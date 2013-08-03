
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStatus complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getStatus", propOrder = {
  "playerName"
})
public class GetStatus {

  protected String playerName;

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
