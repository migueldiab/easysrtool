/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr.forms;

import com.sabre.hd.easysr.entities.ChangeRequest;
import com.sabre.hd.easysr.entities.ServiceRequest;

/**
 *
 * @author Administrator
 */
public class SeleniumLauncher {

  public static void executeCR(ChangeRequest aChangeRequest) {
    EcpmNewChange crRobot = new EcpmNewChange();
    crRobot.setEntity(aChangeRequest);
    crRobot.load();
    crRobot.run();
    crRobot.finish();
  }

  public static void executeSR(ServiceRequest aServiceRequest) {
    SRNewSR newSRRobot = new SRNewSR();
    newSRRobot.setEntity(aServiceRequest);
    newSRRobot.load();
    newSRRobot.run();
    newSRRobot.finish();
  }
}
