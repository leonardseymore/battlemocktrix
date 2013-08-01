
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bullet complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="bullet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://challenge.entelect.co.za/}direction" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bullet", propOrder = {
  "direction",
  "id",
  "x",
  "y"
})
public class Bullet {

  protected Direction direction;
  protected int id;
  protected int x;
  protected int y;

  /**
   * Gets the value of the direction property.
   *
   * @return possible object is
   *         {@link Direction }
   */
  public Direction getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   *
   * @param value allowed object is
   *              {@link Direction }
   */
  public void setDirection(Direction value) {
    this.direction = value;
  }

  /**
   * Gets the value of the id property.
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   */
  public void setId(int value) {
    this.id = value;
  }

  /**
   * Gets the value of the x property.
   */
  public int getX() {
    return x;
  }

  /**
   * Sets the value of the x property.
   */
  public void setX(int value) {
    this.x = value;
  }

  /**
   * Gets the value of the y property.
   */
  public int getY() {
    return y;
  }

  /**
   * Sets the value of the y property.
   */
  public void setY(int value) {
    this.y = value;
  }

}
