/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr;

import com.sabre.hd.easysr.entities.Demo;
import com.sabre.hd.easysr.entities.ServiceRequest;
import com.sabre.hd.easysr.entities.ChangeRequest;
import com.sabre.hd.easysr.forms.SeleniumLauncher;
import com.sabre.hd.gui.NewCRTemplate;
import com.sabre.hd.gui.NewSRTemplate;

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
    return ServiceRequest.save();
  }

  public static void newCRTemplate() {
    NewCRTemplate ventanaNewCRTemplate = new NewCRTemplate();
    ventanaNewCRTemplate.setVisible(true);
  }

  public static ServiceRequest loadDemoSR(){
    Demo demo = new Demo();
    return demo.cargaUnSr();
  }

  public static ChangeRequest loadDemoCR(){
    Demo demo = new Demo();
    return demo.cargaUnCr();
  }

}
