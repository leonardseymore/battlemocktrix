
/**
 * EndOfGameExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package za.co.entelect.challenge;

public class EndOfGameExceptionException extends java.lang.Exception {

  private static final long serialVersionUID = 1375342970987L;

  private za.co.entelect.challenge.EndOfGameException faultMessage;


  public EndOfGameExceptionException() {
    super("EndOfGameExceptionException");
  }

  public EndOfGameExceptionException(java.lang.String s) {
    super(s);
  }

  public EndOfGameExceptionException(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public EndOfGameExceptionException(java.lang.Throwable cause) {
    super(cause);
  }


  public void setFaultMessage(za.co.entelect.challenge.EndOfGameException msg) {
    faultMessage = msg;
  }

  public za.co.entelect.challenge.EndOfGameException getFaultMessage() {
    return faultMessage;
  }
}
    