package SOAP.parking;

import java.text.ParseException;
import java.util.Date;

public class App {

	public static void main(String[] args) throws ParseException {
		Parking p = new Parking();
		int idParking = 8;//p.createParkingLot(100);
		int idTicket = 6;
		Date date = MysqlParkingDAO.DATE_FORMAT.parse("2019-01-29");
		
/*		System.out.println("Info o parkovisku c." + idParking + ":");
		System.out.println("Zaplnenost (v %): " + p.getFilling(idParking));
		System.out.println("Pocet aut v den " + date + ": " + p.getNumberOfCarsOnGivenDay(date, idParking));		
		System.out.println("Auto s listkom c." + idTicket + " bolo odparkovane: " + p.unparkCar(idTicket, idParking));
		
		idParking = 9;
		System.out.println("Info o parkovisku c." + idParking + ":");
		System.out.println("Zaplnenost (v %): " + p.getFilling(idParking));
		System.out.println("Pocet aut v den " + date + ": " + p.getNumberOfCarsOnGivenDay(date, idParking));
		System.out.println("Na parkovicku c." + idParking + " zaparkovali auta s listkom s id:");
		System.out.println(p.parkCar("AUTO-1", idParking));
		idTicket = p.parkCar("AUTO-2", idParking);
		System.out.println(idTicket);
		System.out.println("Auto s listkom c. " + idTicket + " bolo odparkovane: " + p.unparkCar(idTicket, idParking));

		// znova odparkovat to iste auto
		//System.out.println("Auto s listkom c. 21 bolo odparkovane: " + p.unparkCar(21, 9));
		// zaparkovat uz parkujuce auto
		System.out.println("Auto s listkom c. 20 bolo zaparkovane: " + p.parkCar("AUTO-3", 9));*/
		
		/*idParking = p.createParkingLot(5);
		idTicket = p.parkCar("FIAT-1", idParking);
		date = MysqlParkingDAO.DATE_FORMAT.parse("2019-02-09");
		System.out.println("Auto s listkom c. " + idTicket + " bolo zaparkovane.");
		System.out.println("Zaplnenost (v %): " + p.getFilling(37));
		System.out.println("Pocet aut v den " + date + ": " + p.getNumberOfCarsOnGivenDay(date, idParking));*/
	}

}
