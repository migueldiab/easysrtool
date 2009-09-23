/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr;

import com.sabre.hd.easysr.formLogic.SRLogic;
import com.sabre.hd.gui.NewSRTemplate;

/**
 *
 * @author SG0894180
 */
public class Facade {

  public static void createMySR() {
    SRLogic.createMySR();
  }

  public static void newSRTemplate() {
    NewSRTemplate ventanaNewSRTemplate = new NewSRTemplate();
    ventanaNewSRTemplate.setVisible(true);
  }



}
