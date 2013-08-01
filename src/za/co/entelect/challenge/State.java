
package za.co.entelect.challenge;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for state.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="state">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="EMPTY"/>
 *     &lt;enumeration value="OUT_OF_BOUNDS"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "state")
@XmlEnum
public enum State {

  FULL,
  EMPTY,
  OUT_OF_BOUNDS,
  NONE;

  public String value() {
    return name();
  }

  public static State fromValue(String v) {
    return valueOf(v);
  }

}
