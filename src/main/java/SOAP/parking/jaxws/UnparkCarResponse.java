package SOAP.parking.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="unparkCarResponse", namespace="http://parking.SOAP/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="unparkCarResponse", namespace="http://parking.SOAP/")
public class UnparkCarResponse
{
  @XmlElement(name="return", namespace="")
  private boolean _return;
  
  public boolean isReturn()
  {
    return this._return;
  }
  
  public void setReturn(boolean paramBoolean)
  {
    this._return = paramBoolean;
  }
}
