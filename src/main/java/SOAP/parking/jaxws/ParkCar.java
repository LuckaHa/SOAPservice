package SOAP.parking.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="parkCar", namespace="http://parking.SOAP/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="parkCar", namespace="http://parking.SOAP/", propOrder={"arg0", "arg1"})
public class ParkCar
{
  @XmlElement(name="arg0", namespace="")
  private String arg0;
  @XmlElement(name="arg1", namespace="")
  private int arg1;
  
  public String getArg0()
  {
    return this.arg0;
  }
  
  public void setArg0(String paramString)
  {
    this.arg0 = paramString;
  }
  
  public int getArg1()
  {
    return this.arg1;
  }
  
  public void setArg1(int paramInt)
  {
    this.arg1 = paramInt;
  }
}
