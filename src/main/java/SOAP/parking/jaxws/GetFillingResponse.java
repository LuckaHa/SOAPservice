package SOAP.parking.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="getFillingResponse", namespace="http://parking.SOAP/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="getFillingResponse", namespace="http://parking.SOAP/")
public class GetFillingResponse
{
  @XmlElement(name="return", namespace="")
  private double _return;
  
  public double getReturn()
  {
    return this._return;
  }
  
  public void setReturn(double paramDouble)
  {
    this._return = paramDouble;
  }
}
