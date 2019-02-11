package SOAP.parking.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="createParkingLot", namespace="http://parking.SOAP/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="createParkingLot", namespace="http://parking.SOAP/")
public class CreateParkingLot
{
  @XmlElement(name="arg0", namespace="")
  private int arg0;
  
  public int getArg0()
  {
    return this.arg0;
  }
  
  public void setArg0(int paramInt)
  {
    this.arg0 = paramInt;
  }
}