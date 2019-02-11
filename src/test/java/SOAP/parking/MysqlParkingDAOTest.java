package SOAP.parking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import SOAP.parking.client.Parking;
import SOAP.parking.client.ParkingService;

public class MysqlParkingDAOTest {
	
	private ParkingService service;
	private Parking port;
	private String query;
	private JdbcTemplate jdbcTemplate;
	private int idPL = -1;
	private int idT = -1;
	
	public MysqlParkingDAOTest() {
		this.service = new ParkingService();
		this.port = service.getParkingPort();
		this.jdbcTemplate = DAOFactory.INSTANCE.getJdbcTemplate();
	}
	
	@Before
	public void prepare() {
		idPL = port.createParkingLot(2);
	}
	
	@After
	public void tidy() {
		if (idT != -1) {
			query = "DELETE FROM ticket WHERE id = " + idT;
			jdbcTemplate.update(query);
		}
		if (idPL != -1) {
			query = "DELETE FROM parkinglot WHERE id = " + idPL;
			jdbcTemplate.update(query);
		}
	}

	@Test
	public void createParkingLotTest() {
		// pocet parkovisk pred zalozenim noveho
		query = "SELECT COUNT(*) FROM parkinglot";
		int before = jdbcTemplate.queryForObject(query, Integer.class);
		
		// vytvorenie parkoviska
		idPL = port.createParkingLot(5);
		
		// pocet parkovisk po zalozeni noveho
		query = "SELECT COUNT(*) FROM parkinglot";
		int after = jdbcTemplate.queryForObject(query, Integer.class);
		
		// vymazat testovacie parkovisko
		query = "DELETE FROM parkinglot WHERE id = " + idPL;
		int rowsAffected = jdbcTemplate.update(query);
		
		assertEquals(before, after-1);
		assertEquals(rowsAffected, 1);
	}
	
	@Test
	public void parkCarSuccessfullyTest() {	
		// pocet aut zaparkovanych pred zaparkovanim je 0
		// zisti pocet listkov pred zaparkovanim
		query = "SELECT COUNT(*) FROM ticket";
		int ticketsBefore = jdbcTemplate.queryForObject(query, Integer.class);
		
		// zaparkovanie
		idT = port.parkCar("TEST1", idPL);
		
		// pocet aut zaparkovanych na danom parkovisku po zaparkovani ma byt 1
		query = "SELECT numberOfCarsIn FROM parkinglot WHERE id = " + idPL;
		int after = jdbcTemplate.queryForObject(query, Integer.class);
		assertEquals(after, 1);
		
		// pocet listkov po zaparkovani ma byt o 1 viac
		query = "SELECT COUNT(*) FROM ticket";
		int ticketsAfter = jdbcTemplate.queryForObject(query, Integer.class);
		assertEquals(ticketsBefore, ticketsAfter-1);
	}
	
	@Test
	public void unparkCarSuccessfullyTest() {	
		// zaparkujem a to auto hned odparkujem
		Date now = new Date();
		idT = port.parkCar("TEST2", idPL);
		assertTrue(port.unparkCar(idT, idPL));
		
		// pocet aut zaparkovanych na danom parkovisku po odparkovani ma byt 0
		query = "SELECT numberOfCarsIn FROM parkinglot WHERE id = " + idPL;
		int after = jdbcTemplate.queryForObject(query, Integer.class);		
		assertEquals(after, 0);
		
		// departureDate ma byt dnesny
		query = "SELECT departureDate FROM ticket WHERE id = " + idT;
		String date = jdbcTemplate.queryForObject(query, String.class);	
		assertEquals(MysqlParkingDAO.DATE_FORMAT.format(now), date);
		
		// departureTime ma byt now - to nie je presne
		/*query = "SELECT departureTime FROM ticket WHERE id = " + idT;
		String time = jdbcTemplate.queryForObject(query, String.class);	
		assertEquals(MysqlParkingDAO.TIME_FORMAT.format(now), time);*/
	}
	
	@Test
	public void parkCarUnsuccessfullyAlreadyInTest() {
		// auto zaparkujeme 1. krat
		String car = "TEST3";
		idT = port.parkCar(car, idPL);
		assertNotEquals(-1, idT);
		
		// auto zaparkujeme 2. krat, to by nemalo byt uspesne
		assertEquals(-1, port.parkCar(car, idPL));
	}
	
	@Test
	public void parkCarUnsuccessfullyFullLotTest() {
		// zaparkujeme 2 auta a tym sa parkovisko uz naplni (ma kapacitu 2)
		idT = port.parkCar("TEST4", idPL);
		assertNotEquals(-1, idT);
		int idT2 = port.parkCar("TEST5", idPL);
		assertNotEquals(-1, idT2);
		
		// skusime zaparkovat 3. auto, ale to sa kvoli kapacite nepodari
		assertEquals(-1, port.parkCar("TEST6", idPL));
		
		// vymazat listok
		query = "DELETE FROM ticket WHERE id = " + idT2;
		jdbcTemplate.update(query);
	}
	
	@Test
	public void unparkCarUnsuccessfullyTest() {
		// a - auto je 1. krat odparkovane uspesne, 2. krat neuspesne
		idT = port.parkCar("TEST6", idPL);
		assertTrue(port.unparkCar(idT, idPL));
		assertFalse(port.unparkCar(idT, idPL));
		
		// b - auto s id 5 nie je na tom parkovisku, 0 vobec
		assertFalse(port.unparkCar(5, idPL));
		assertFalse(port.unparkCar(0, idPL));
	}
	
	@Test
	public void getFillingTest() {
		assertTrue(port.getFilling(idPL) == (double) 0);
		
		// ked zaparkujeme 1 auto, zaplnenost ma byt 50 percent
		idT = port.parkCar("TEST7", idPL);
		assertTrue(port.getFilling(idPL) == (double) 50);
		
		// ked zaparkujeme 2. auto, zaplnenost ma byt 100 percent
		int idT2 = port.parkCar("TEST8", idPL);
		assertTrue(port.getFilling(idPL) == (double) 100);
		
		// vymazat listok
		query = "DELETE FROM ticket WHERE id = " + idT2;
		jdbcTemplate.update(query);
	}
	
	@Test
	public void getNumberOfCarsOnGivenDayTest() throws DatatypeConfigurationException {
		Date date = new Date(); // now
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		
		assertEquals(0, port.getNumberOfCarsOnGivenDay(xmlCalendar, idPL));
		
		// zaparkujeme 1 auto
		idT = port.parkCar("TEST9", idPL);
		assertEquals(1, port.getNumberOfCarsOnGivenDay(xmlCalendar, idPL));
		
		// zaparkujeme 2. auto
		int idT2 = port.parkCar("TEST10", idPL);
		assertEquals(2, port.getNumberOfCarsOnGivenDay(xmlCalendar, idPL));
		
		// vymazat listok
		query = "DELETE FROM ticket WHERE id = " + idT2;
		jdbcTemplate.update(query);
	}
}




























