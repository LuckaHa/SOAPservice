
package SOAP.parking.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Parking", targetNamespace = "http://parking.SOAP/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Parking {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNumberOfCarsOnGivenDay", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.GetNumberOfCarsOnGivenDay")
    @ResponseWrapper(localName = "getNumberOfCarsOnGivenDayResponse", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.GetNumberOfCarsOnGivenDayResponse")
    @Action(input = "http://parking.SOAP/Parking/getNumberOfCarsOnGivenDayRequest", output = "http://parking.SOAP/Parking/getNumberOfCarsOnGivenDayResponse")
    public int getNumberOfCarsOnGivenDay(
        @WebParam(name = "arg0", targetNamespace = "")
        XMLGregorianCalendar arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "parkCar", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.ParkCar")
    @ResponseWrapper(localName = "parkCarResponse", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.ParkCarResponse")
    @Action(input = "http://parking.SOAP/Parking/parkCarRequest", output = "http://parking.SOAP/Parking/parkCarResponse")
    public int parkCar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "unparkCar", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.UnparkCar")
    @ResponseWrapper(localName = "unparkCarResponse", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.UnparkCarResponse")
    @Action(input = "http://parking.SOAP/Parking/unparkCarRequest", output = "http://parking.SOAP/Parking/unparkCarResponse")
    public boolean unparkCar(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFilling", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.GetFilling")
    @ResponseWrapper(localName = "getFillingResponse", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.GetFillingResponse")
    @Action(input = "http://parking.SOAP/Parking/getFillingRequest", output = "http://parking.SOAP/Parking/getFillingResponse")
    public double getFilling(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createParkingLot", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.CreateParkingLot")
    @ResponseWrapper(localName = "createParkingLotResponse", targetNamespace = "http://parking.SOAP/", className = "SOAP.parking.client.CreateParkingLotResponse")
    @Action(input = "http://parking.SOAP/Parking/createParkingLotRequest", output = "http://parking.SOAP/Parking/createParkingLotResponse")
    public int createParkingLot(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
