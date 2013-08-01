
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blockEvent complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="blockEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newState" type="{http://challenge.entelect.co.za/}state" minOccurs="0"/>
 *         &lt;element name="point" type="{http://challenge.entelect.co.za/}point" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockEvent", propOrder = {
  "newState",
  "point"
})
public class BlockEvent {

  protected State newState;
  protected Point point;

  public BlockEvent() {
  }

  public BlockEvent(State newState, Point point) {
    this.newState = newState;
    this.point = point;
  }

  /**
   * Gets the value of the newState property.
   *
   * @return possible object is
   *         {@link State }
   */
  public State getNewState() {
    return newState;
  }

  /**
   * Sets the value of the newState property.
   *
   * @param value allowed object is
   *              {@link State }
   */
  public void setNewState(State value) {
    this.newState = value;
  }

  /**
   * Gets the value of the point property.
   *
   * @return possible object is
   *         {@link Point }
   */
  public Point getPoint() {
    return point;
  }

  /**
   * Sets the value of the point property.
   *
   * @param value allowed object is
   *              {@link Point }
   */
  public void setPoint(Point value) {
    this.point = value;
  }

}
