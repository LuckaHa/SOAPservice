package SOAP.parking;

import javax.xml.ws.Endpoint;

public class ParkingPublisher {
	public static void main(String[] args) {
		String url = "http://localhost:4422/parking";
		System.out.println("Check WSDL at " + url + "?wsdl");
		Endpoint.publish(url, new Parking());
	}
}
