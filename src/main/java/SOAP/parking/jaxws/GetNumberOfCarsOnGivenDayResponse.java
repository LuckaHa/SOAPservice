package SOAP.parking.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="getNumberOfCarsOnGivenDayResponse", namespace="http://parking.SOAP/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="getNumberOfCarsOnGivenDayResponse", namespace="http://parking.SOAP/")
public class GetNumberOfCarsOnGivenDayResponse
{
  @XmlElement(name="return", namespace="")
  private int _return;
  
  public int getReturn()
  {
    return this._return;
  }
  
  public void setReturn(int paramInt)
  {
    this._return = paramInt;
  }
}
