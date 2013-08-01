
/**
 * ChallengeServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package za.co.entelect.challenge;

/**
 * ChallengeServiceCallbackHandler Callback class, Users can extend this class and implement
 * their own receiveResult and receiveError methods.
 */
public abstract class ChallengeServiceCallbackHandler {


  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking
   * Web service call is finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data
   *                   that will be avilable at the time this callback is called.
   */
  public ChallengeServiceCallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /**
   * Please use this constructor if you don't want to set any clientData
   */
  public ChallengeServiceCallbackHandler() {
    this.clientData = null;
  }

  /**
   * Get the client data
   */

  public Object getClientData() {
    return clientData;
  }


  /**
   * auto generated Axis2 call back method for getStatus method
   * override this method for handling normal response from getStatus operation
   */
  public void receiveResultgetStatus(
    za.co.entelect.challenge.GetStatusResponse result
  ) {
  }

  /**
   * auto generated Axis2 Error handler
   * override this method for handling error response from getStatus operation
   */
  public void receiveErrorgetStatus(java.lang.Exception e) {
  }

  /**
   * auto generated Axis2 call back method for setAction method
   * override this method for handling normal response from setAction operation
   */
  public void receiveResultsetAction(
    za.co.entelect.challenge.SetActionResponse result
  ) {
  }

  /**
   * auto generated Axis2 Error handler
   * override this method for handling error response from setAction operation
   */
  public void receiveErrorsetAction(java.lang.Exception e) {
  }

  /**
   * auto generated Axis2 call back method for login method
   * override this method for handling normal response from login operation
   */
  public void receiveResultlogin(
    za.co.entelect.challenge.LoginResponse result
  ) {
  }

  /**
   * auto generated Axis2 Error handler
   * override this method for handling error response from login operation
   */
  public void receiveErrorlogin(java.lang.Exception e) {
  }


}
    