
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for events complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="events">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockEvents" type="{http://challenge.entelect.co.za/}blockEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unitEvents" type="{http://challenge.entelect.co.za/}unitEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "events", propOrder = {
  "blockEvents",
  "unitEvents"
})
public class Events {

  @XmlElement(nillable = true)
  protected List<BlockEvent> blockEvents;
  @XmlElement(nillable = true)
  protected List<UnitEvent> unitEvents;

  /**
   * Gets the value of the blockEvents property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the blockEvents property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBlockEvents().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link BlockEvent }
   */
  public List<BlockEvent> getBlockEvents() {
    if (blockEvents == null) {
      blockEvents = new ArrayList<BlockEvent>();
    }
    return this.blockEvents;
  }

  /**
   * Gets the value of the unitEvents property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the unitEvents property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUnitEvents().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link UnitEvent }
   */
  public List<UnitEvent> getUnitEvents() {
    if (unitEvents == null) {
      unitEvents = new ArrayList<UnitEvent>();
    }
    return this.unitEvents;
  }

}
