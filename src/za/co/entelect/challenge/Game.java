
package za.co.entelect.challenge;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for game complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="game">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentTick" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="events" type="{http://challenge.entelect.co.za/}events" minOccurs="0"/>
 *         &lt;element name="nextTickTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="playerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="players" type="{http://challenge.entelect.co.za/}player" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "game", propOrder = {
  "currentTick",
  "events",
  "nextTickTime",
  "playerName",
  "players"
})
public class Game {

  protected int currentTick;
  protected Events events;
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar nextTickTime;
  protected String playerName;
  @XmlElement(nillable = true)
  protected List<Player> players;

  /**
   * Gets the value of the currentTick property.
   */
  public int getCurrentTick() {
    return currentTick;
  }

  /**
   * Sets the value of the currentTick property.
   */
  public void setCurrentTick(int value) {
    this.currentTick = value;
  }

  /**
   * Gets the value of the events property.
   *
   * @return possible object is
   *         {@link Events }
   */
  public Events getEvents() {
    return events;
  }

  /**
   * Sets the value of the events property.
   *
   * @param value allowed object is
   *              {@link Events }
   */
  public void setEvents(Events value) {
    this.events = value;
  }

  /**
   * Gets the value of the nextTickTime property.
   *
   * @return possible object is
   *         {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getNextTickTime() {
    return nextTickTime;
  }

  /**
   * Sets the value of the nextTickTime property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setNextTickTime(XMLGregorianCalendar value) {
    this.nextTickTime = value;
  }

  /**
   * Gets the value of the playerName property.
   *
   * @return possible object is
   *         {@link String }
   */
  public String getPlayerName() {
    return playerName;
  }

  /**
   * Sets the value of the playerName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setPlayerName(String value) {
    this.playerName = value;
  }

  /**
   * Gets the value of the players property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the players property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPlayers().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Player }
   */
  public List<Player> getPlayers() {
    if (players == null) {
      players = new ArrayList<Player>();
    }
    return this.players;
  }

}
