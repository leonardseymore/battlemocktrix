
/**
 * NoBlameExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package za.co.entelect.challenge;

public class NoBlameExceptionException extends java.lang.Exception {

  private static final long serialVersionUID = 1375342970979L;

  private za.co.entelect.challenge.NoBlameException faultMessage;


  public NoBlameExceptionException() {
    super("NoBlameExceptionException");
  }

  public NoBlameExceptionException(java.lang.String s) {
    super(s);
  }

  public NoBlameExceptionException(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public NoBlameExceptionException(java.lang.Throwable cause) {
    super(cause);
  }


  public void setFaultMessage(za.co.entelect.challenge.NoBlameException msg) {
    faultMessage = msg;
  }

  public za.co.entelect.challenge.NoBlameException getFaultMessage() {
    return faultMessage;
  }
}
    