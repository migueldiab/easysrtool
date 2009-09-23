/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr.formLogic;

import com.sabre.hd.easysr.forms.EcpmNewChange;
import com.sabre.hd.gui.EasySRMain;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author SG0894180
 */
public class SRLogic {

  public static void createMySR() {
    EcpmNewChange f1 = new EcpmNewChange();
      try {
        f1.load();
        f1.run();
        f1.finish();
      } catch (Exception ex) {
        Logger.getLogger(EasySRMain.class.getName()).log(Level.ERROR, null, ex);
      }
  }
      
}
