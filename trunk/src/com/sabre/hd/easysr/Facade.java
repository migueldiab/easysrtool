/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr;

import com.sabre.hd.easysr.entities.ServiceRequest;
import com.sabre.hd.easysr.entities.ChangeRequest;
import com.sabre.hd.easysr.forms.SeleniumLauncher;
import com.sabre.hd.easysr.peer.ChangeRequestPeer;
import com.sabre.hd.easysr.peer.ServiceRequestPeer;
import com.sabre.hd.gui.NewCRTemplate;
import com.sabre.hd.gui.NewSRTemplate;
import com.sabre.hd.gui.NewWorkflow;
import java.util.ArrayList;

/**
 *
 * @author SG0894180
 */
public class Facade {

  public static void executeSeleniumCR(ChangeRequest aChangeRequest) {
    SeleniumLauncher.executeCR(aChangeRequest);
  }

  public static void executeSeleniumSR(ServiceRequest aServiceRequest) {
    SeleniumLauncher.executeSR(aServiceRequest);
  }

  public static void newSRTemplate() {
    NewSRTemplate ventanaNewSRTemplate = new NewSRTemplate();
    ventanaNewSRTemplate.setVisible(true);
  }
 
  public static boolean saveSR(ServiceRequest aServiceRequest) {
    return ServiceRequestPeer.save(aServiceRequest);
  }

  public static void newCRTemplate() {
    NewCRTemplate ventanaNewCRTemplate = new NewCRTemplate();
    ventanaNewCRTemplate.setVisible(true);
  }

  public static ArrayList<ServiceRequest> getAllServiceRequests() {
    return ServiceRequestPeer.getAll();
  }

  public static ArrayList<ChangeRequest> getAllChangeRequests() {
    return ChangeRequestPeer.getAll();
  }

  public static void newWorkflow() {
    NewWorkflow ventanaNewWorkflow = new NewWorkflow();
    ventanaNewWorkflow.setVisible(true);
  }

  public static void executeSeleniumWorkflow() {
    SeleniumLauncher.executeWorkflow();
  }

}
