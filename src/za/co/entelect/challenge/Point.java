
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for point complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="point">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "point", propOrder = {
  "x",
  "y"
})
public class Point {

  protected int x;
  protected int y;

  public Point() {
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
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

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    sb.append("x=").append(x);
    sb.append(", y=").append(y);
    sb.append('}');
    return sb.toString();
  }
}
