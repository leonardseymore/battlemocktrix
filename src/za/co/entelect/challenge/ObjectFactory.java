
package za.co.entelect.challenge;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the za.co.entelect.challenge package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _SetAction_QNAME = new QName("http://challenge.entelect.co.za/", "setAction");
  private final static QName _EndOfGameException_QNAME = new QName("http://challenge.entelect.co.za/", "EndOfGameException");
  private final static QName _Login_QNAME = new QName("http://challenge.entelect.co.za/", "login");
  private final static QName _SetActionResponse_QNAME = new QName("http://challenge.entelect.co.za/", "setActionResponse");
  private final static QName _LoginResponse_QNAME = new QName("http://challenge.entelect.co.za/", "loginResponse");
  private final static QName _NoBlameException_QNAME = new QName("http://challenge.entelect.co.za/", "NoBlameException");
  private final static QName _GetStatus_QNAME = new QName("http://challenge.entelect.co.za/", "getStatus");
  private final static QName _GetStatusResponse_QNAME = new QName("http://challenge.entelect.co.za/", "getStatusResponse");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.co.entelect.challenge
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link NoBlameException }
   */
  public NoBlameException createNoBlameException() {
    return new NoBlameException();
  }

  /**
   * Create an instance of {@link Base }
   */
  public Base createBase() {
    return new Base();
  }

  /**
   * Create an instance of {@link Events }
   */
  public Events createEvents() {
    return new Events();
  }

  /**
   * Create an instance of {@link Unit }
   */
  public Unit createUnit() {
    return new Unit();
  }

  /**
   * Create an instance of {@link Game }
   */
  public Game createGame() {
    return new Game();
  }

  /**
   * Create an instance of {@link SetActionResponse }
   */
  public SetActionResponse createSetActionResponse() {
    return new SetActionResponse();
  }

  /**
   * Create an instance of {@link LoginResponse }
   */
  public LoginResponse createLoginResponse() {
    return new LoginResponse();
  }

  /**
   * Create an instance of {@link Board }
   */
  public Board createBoard() {
    return new Board();
  }

  /**
   * Create an instance of {@link StateArray }
   */
  public StateArray createStateArray() {
    return new StateArray();
  }

  /**
   * Create an instance of {@link ArrayList }
   */
  public ArrayList createArrayList() {
    return new ArrayList();
  }

  /**
   * Create an instance of {@link Point }
   */
  public Point createPoint() {
    return new Point();
  }

  /**
   * Create an instance of {@link GetStatusResponse }
   */
  public GetStatusResponse createGetStatusResponse() {
    return new GetStatusResponse();
  }

  /**
   * Create an instance of {@link UnitEvent }
   */
  public UnitEvent createUnitEvent() {
    return new UnitEvent();
  }

  /**
   * Create an instance of {@link Player }
   */
  public Player createPlayer() {
    return new Player();
  }

  /**
   * Create an instance of {@link EndOfGameException }
   */
  public EndOfGameException createEndOfGameException() {
    return new EndOfGameException();
  }

  /**
   * Create an instance of {@link SetAction }
   */
  public SetAction createSetAction() {
    return new SetAction();
  }

  /**
   * Create an instance of {@link GetStatus }
   */
  public GetStatus createGetStatus() {
    return new GetStatus();
  }

  /**
   * Create an instance of {@link Login }
   */
  public Login createLogin() {
    return new Login();
  }

  /**
   * Create an instance of {@link Bullet }
   */
  public Bullet createBullet() {
    return new Bullet();
  }

  /**
   * Create an instance of {@link BlockEvent }
   */
  public BlockEvent createBlockEvent() {
    return new BlockEvent();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SetAction }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "setAction")
  public JAXBElement<SetAction> createSetAction(SetAction value) {
    return new JAXBElement<SetAction>(_SetAction_QNAME, SetAction.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link EndOfGameException }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "EndOfGameException")
  public JAXBElement<EndOfGameException> createEndOfGameException(EndOfGameException value) {
    return new JAXBElement<EndOfGameException>(_EndOfGameException_QNAME, EndOfGameException.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "login")
  public JAXBElement<Login> createLogin(Login value) {
    return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SetActionResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "setActionResponse")
  public JAXBElement<SetActionResponse> createSetActionResponse(SetActionResponse value) {
    return new JAXBElement<SetActionResponse>(_SetActionResponse_QNAME, SetActionResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "loginResponse")
  public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
    return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link NoBlameException }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "NoBlameException")
  public JAXBElement<NoBlameException> createNoBlameException(NoBlameException value) {
    return new JAXBElement<NoBlameException>(_NoBlameException_QNAME, NoBlameException.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "getStatus")
  public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
    return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://challenge.entelect.co.za/", name = "getStatusResponse")
  public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
    return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
  }

}
