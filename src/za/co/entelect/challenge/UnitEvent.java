
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitEvent complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="unitEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bullet" type="{http://challenge.entelect.co.za/}bullet" minOccurs="0"/>
 *         &lt;element name="tickTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unit" type="{http://challenge.entelect.co.za/}unit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitEvent", propOrder = {
  "bullet",
  "tickTime",
  "unit"
})
public class UnitEvent {

  protected Bullet bullet;
  protected int tickTime;
  protected Unit unit;

  /**
   * Gets the value of the bullet property.
   *
   * @return possible object is
   *         {@link Bullet }
   */
  public Bullet getBullet() {
    return bullet;
  }

  /**
   * Sets the value of the bullet property.
   *
   * @param value allowed object is
   *              {@link Bullet }
   */
  public void setBullet(Bullet value) {
    this.bullet = value;
  }

  /**
   * Gets the value of the tickTime property.
   */
  public int getTickTime() {
    return tickTime;
  }

  /**
   * Sets the value of the tickTime property.
   */
  public void setTickTime(int value) {
    this.tickTime = value;
  }

  /**
   * Gets the value of the unit property.
   *
   * @return possible object is
   *         {@link Unit }
   */
  public Unit getUnit() {
    return unit;
  }

  /**
   * Sets the value of the unit property.
   *
   * @param value allowed object is
   *              {@link Unit }
   */
  public void setUnit(Unit value) {
    this.unit = value;
  }

}
