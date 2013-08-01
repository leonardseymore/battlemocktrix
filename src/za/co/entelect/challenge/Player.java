
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for player complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="player">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://challenge.entelect.co.za/}base" minOccurs="0"/>
 *         &lt;element name="bullets" type="{http://challenge.entelect.co.za/}bullet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units" type="{http://challenge.entelect.co.za/}unit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "player", propOrder = {
  "base",
  "bullets",
  "name",
  "units"
})
public class Player {

  protected Base base;
  @XmlElement(nillable = true)
  protected List<Bullet> bullets;
  protected String name;
  @XmlElement(nillable = true)
  protected List<Unit> units;

  /**
   * Gets the value of the base property.
   *
   * @return possible object is
   *         {@link Base }
   */
  public Base getBase() {
    return base;
  }

  /**
   * Sets the value of the base property.
   *
   * @param value allowed object is
   *              {@link Base }
   */
  public void setBase(Base value) {
    this.base = value;
  }

  /**
   * Gets the value of the bullets property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the bullets property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBullets().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Bullet }
   */
  public List<Bullet> getBullets() {
    if (bullets == null) {
      bullets = new ArrayList<Bullet>();
    }
    return this.bullets;
  }

  /**
   * Gets the value of the name property.
   *
   * @return possible object is
   *         {@link String }
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the units property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the units property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUnits().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Unit }
   */
  public List<Unit> getUnits() {
    if (units == null) {
      units = new ArrayList<Unit>();
    }
    return this.units;
  }

}
