
package SOAP.parking.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the SOAP.parking.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFillingResponse_QNAME = new QName("http://parking.SOAP/", "getFillingResponse");
    private final static QName _CreateParkingLot_QNAME = new QName("http://parking.SOAP/", "createParkingLot");
    private final static QName _GetNumberOfCarsOnGivenDay_QNAME = new QName("http://parking.SOAP/", "getNumberOfCarsOnGivenDay");
    private final static QName _GetNumberOfCarsOnGivenDayResponse_QNAME = new QName("http://parking.SOAP/", "getNumberOfCarsOnGivenDayResponse");
    private final static QName _UnparkCarResponse_QNAME = new QName("http://parking.SOAP/", "unparkCarResponse");
    private final static QName _CreateParkingLotResponse_QNAME = new QName("http://parking.SOAP/", "createParkingLotResponse");
    private final static QName _ParkCar_QNAME = new QName("http://parking.SOAP/", "parkCar");
    private final static QName _GetFilling_QNAME = new QName("http://parking.SOAP/", "getFilling");
    private final static QName _ParkCarResponse_QNAME = new QName("http://parking.SOAP/", "parkCarResponse");
    private final static QName _UnparkCar_QNAME = new QName("http://parking.SOAP/", "unparkCar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: SOAP.parking.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParkCarResponse }
     * 
     */
    public ParkCarResponse createParkCarResponse() {
        return new ParkCarResponse();
    }

    /**
     * Create an instance of {@link UnparkCar }
     * 
     */
    public UnparkCar createUnparkCar() {
        return new UnparkCar();
    }

    /**
     * Create an instance of {@link ParkCar }
     * 
     */
    public ParkCar createParkCar() {
        return new ParkCar();
    }

    /**
     * Create an instance of {@link GetFilling }
     * 
     */
    public GetFilling createGetFilling() {
        return new GetFilling();
    }

    /**
     * Create an instance of {@link CreateParkingLotResponse }
     * 
     */
    public CreateParkingLotResponse createCreateParkingLotResponse() {
        return new CreateParkingLotResponse();
    }

    /**
     * Create an instance of {@link UnparkCarResponse }
     * 
     */
    public UnparkCarResponse createUnparkCarResponse() {
        return new UnparkCarResponse();
    }

    /**
     * Create an instance of {@link GetFillingResponse }
     * 
     */
    public GetFillingResponse createGetFillingResponse() {
        return new GetFillingResponse();
    }

    /**
     * Create an instance of {@link CreateParkingLot }
     * 
     */
    public CreateParkingLot createCreateParkingLot() {
        return new CreateParkingLot();
    }

    /**
     * Create an instance of {@link GetNumberOfCarsOnGivenDay }
     * 
     */
    public GetNumberOfCarsOnGivenDay createGetNumberOfCarsOnGivenDay() {
        return new GetNumberOfCarsOnGivenDay();
    }

    /**
     * Create an instance of {@link GetNumberOfCarsOnGivenDayResponse }
     * 
     */
    public GetNumberOfCarsOnGivenDayResponse createGetNumberOfCarsOnGivenDayResponse() {
        return new GetNumberOfCarsOnGivenDayResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFillingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "getFillingResponse")
    public JAXBElement<GetFillingResponse> createGetFillingResponse(GetFillingResponse value) {
        return new JAXBElement<GetFillingResponse>(_GetFillingResponse_QNAME, GetFillingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParkingLot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "createParkingLot")
    public JAXBElement<CreateParkingLot> createCreateParkingLot(CreateParkingLot value) {
        return new JAXBElement<CreateParkingLot>(_CreateParkingLot_QNAME, CreateParkingLot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfCarsOnGivenDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "getNumberOfCarsOnGivenDay")
    public JAXBElement<GetNumberOfCarsOnGivenDay> createGetNumberOfCarsOnGivenDay(GetNumberOfCarsOnGivenDay value) {
        return new JAXBElement<GetNumberOfCarsOnGivenDay>(_GetNumberOfCarsOnGivenDay_QNAME, GetNumberOfCarsOnGivenDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfCarsOnGivenDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "getNumberOfCarsOnGivenDayResponse")
    public JAXBElement<GetNumberOfCarsOnGivenDayResponse> createGetNumberOfCarsOnGivenDayResponse(GetNumberOfCarsOnGivenDayResponse value) {
        return new JAXBElement<GetNumberOfCarsOnGivenDayResponse>(_GetNumberOfCarsOnGivenDayResponse_QNAME, GetNumberOfCarsOnGivenDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnparkCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "unparkCarResponse")
    public JAXBElement<UnparkCarResponse> createUnparkCarResponse(UnparkCarResponse value) {
        return new JAXBElement<UnparkCarResponse>(_UnparkCarResponse_QNAME, UnparkCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParkingLotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "createParkingLotResponse")
    public JAXBElement<CreateParkingLotResponse> createCreateParkingLotResponse(CreateParkingLotResponse value) {
        return new JAXBElement<CreateParkingLotResponse>(_CreateParkingLotResponse_QNAME, CreateParkingLotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "parkCar")
    public JAXBElement<ParkCar> createParkCar(ParkCar value) {
        return new JAXBElement<ParkCar>(_ParkCar_QNAME, ParkCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "getFilling")
    public JAXBElement<GetFilling> createGetFilling(GetFilling value) {
        return new JAXBElement<GetFilling>(_GetFilling_QNAME, GetFilling.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "parkCarResponse")
    public JAXBElement<ParkCarResponse> createParkCarResponse(ParkCarResponse value) {
        return new JAXBElement<ParkCarResponse>(_ParkCarResponse_QNAME, ParkCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnparkCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parking.SOAP/", name = "unparkCar")
    public JAXBElement<UnparkCar> createUnparkCar(UnparkCar value) {
        return new JAXBElement<UnparkCar>(_UnparkCar_QNAME, UnparkCar.class, null, value);
    }

}
