package com.sabre.hd.easysr;

import org.apache.log4j.Logger;
import com.sabre.hd.easysr.forms.*;
import com.sabre.hd.gui.*;

public class EasySR {

	private static Logger logger = Logger.getLogger(EasySR.class.getName());
	/**
   * The Easy SR Tool
   *
   * SPOE for Easy SR Tool. GUI Launcher for administration and execution.
   * 
   * @author Los Suave Criminal
	 * @param args
	 */
	public static void main(String[] args) {
		try{			
			
//			GoogleTest gt = new GoogleTest();
//			gt.load();
//			gt.run();
//			gt.finish();

      Main ventanaMain = new Main();
      ventanaMain.setVisible(true);
			
		}catch (Exception e){
			logger.error(e);
		}

	}

}
