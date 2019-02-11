package SOAP.parking;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import SOAP.parking.client.ParkingService;
import SOAP.parking.client.Parking;

public class ParkingClient {
	public static void main(String[] args) throws DatatypeConfigurationException {
		ParkingService service = new ParkingService();
		Parking parking = service.getParkingPort();
		System.out.println("Welcome to parking service.");
		
		//System.out.println(port.createParkingLot());
		//System.out.println(port.parkCar("CLIENT1", 9));
		//System.out.println(port.parkCar("CLIENT1", 8));
		//System.out.println(port.unparkCar(5, 8));
		//System.out.println(port.getFilling(8));
		
		Date now = new Date();
		//Date date = new Date(2019,1,29);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(now);
		XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		System.out.println("Na parkovisku s id 9 je aut: " + parking.getNumberOfCarsOnGivenDay(xmlCalendar, 9));
	}
}
