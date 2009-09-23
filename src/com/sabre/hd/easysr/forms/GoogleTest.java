package com.sabre.hd.easysr.forms;

public class GoogleTest extends ServiceRequestRobot{
		    
    public GoogleTest()
    {
    	this.setBaseUrl("http://www.google.com");    
    }
        
    public void run() {
    	try{
    		  remoteControl.type("q", "sabre");
	          remoteControl.click("btnG");
	          remoteControl.waitForPageToLoad("90000");	  	                      
    	}catch (Exception e){
    		logger.error(e);
    	}
	}        	                
}
