
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="loginResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://challenge.entelect.co.za/}board" minOccurs="0"/>
 *         &lt;element name="playerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResponse", propOrder = {
  "_return",
  "playerName"
})
public class LoginResponse {

  @XmlElement(name = "return")
  protected Board _return;
  protected String playerName;

  /**
   * Gets the value of the return property.
   *
   * @return
   *     possible object is
   *     {@link Board }
   *
   */
  public Board getReturn() {
    return _return;
  }

  /**
   * Sets the value of the return property.
   *
   * @param value
   *     allowed object is
   *     {@link Board }
   *
   */
  public void setReturn(Board value) {
    this._return = value;
  }

  /**
   * Gets the value of the playerName property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getPlayerName() {
    return playerName;
  }

  /**
   * Sets the value of the playerName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setPlayerName(String value) {
    this.playerName = value;
  }

}
