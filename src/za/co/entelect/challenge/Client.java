package za.co.entelect.challenge;

import org.apache.axis2.AxisFault;

public class Client {

  public static void main(String[] args) throws AxisFault {
    ChallengeServiceStub client = new ChallengeServiceStub("http://localhost:8080/axis2/services/ChallengeService");
    try {
      LoginResponse loginResponse = client.login(new Login());
      System.out.println(loginResponse.getReturn());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
