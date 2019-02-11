package SOAP.parking;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Parking {
	
	private MysqlParkingDAO mysqlParkingDAO;
	
	public Parking() {
		mysqlParkingDAO = DAOFactory.INSTANCE.getMysqlParkingDAO();
	}
	
	@WebMethod
	public int parkCar(String ecvOfCar, int parkingLotId) {
		return mysqlParkingDAO.parkCar(ecvOfCar, parkingLotId);
	}
	
	@WebMethod
	public boolean unparkCar(int ticketId, int parkingLotId) {
		return mysqlParkingDAO.unparkCar(ticketId, parkingLotId);
	}
	
	@WebMethod
	public double getFilling(int parkingLotId) {
		return mysqlParkingDAO.getFilling(parkingLotId);
	}
	
	@WebMethod
	public int getNumberOfCarsOnGivenDay(Date day, int parkingLotId) {
		return mysqlParkingDAO.getNumberOfCarsOnGivenDay(day, parkingLotId);
	}
	
	@WebMethod
	public int createParkingLot(int capacity) {
		return mysqlParkingDAO.createParkingLot(capacity);
	}
}
