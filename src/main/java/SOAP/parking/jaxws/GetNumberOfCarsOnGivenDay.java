package SOAP.parking.jaxws;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="getNumberOfCarsOnGivenDay", namespace="http://parking.SOAP/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="getNumberOfCarsOnGivenDay", namespace="http://parking.SOAP/", propOrder={"arg0", "arg1"})
public class GetNumberOfCarsOnGivenDay
{
  @XmlElement(name="arg0", namespace="")
  private Date arg0;
  @XmlElement(name="arg1", namespace="")
  private int arg1;
  
  public Date getArg0()
  {
    return this.arg0;
  }
  
  public void setArg0(Date paramDate)
  {
    this.arg0 = paramDate;
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
