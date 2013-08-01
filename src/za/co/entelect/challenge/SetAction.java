
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAction complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="setAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://challenge.entelect.co.za/}action" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAction", propOrder = {
  "arg0",
  "arg1"
})
public class SetAction {

  protected int arg0;
  protected Action arg1;

  /**
   * Gets the value of the arg0 property.
   */
  public int getArg0() {
    return arg0;
  }

  /**
   * Sets the value of the arg0 property.
   */
  public void setArg0(int value) {
    this.arg0 = value;
  }

  /**
   * Gets the value of the arg1 property.
   *
   * @return possible object is
   *         {@link Action }
   */
  public Action getArg1() {
    return arg1;
  }

  /**
   * Sets the value of the arg1 property.
   *
   * @param value allowed object is
   *              {@link Action }
   */
  public void setArg1(Action value) {
    this.arg1 = value;
  }

}
