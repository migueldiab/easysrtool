package com.sabre.hd.easysr.forms;

import com.sabre.hd.easysr.entities.ServiceRequest;

public class SRNewSR extends ServiceRequestRobot{
		  		
	  public SRNewSR(){
		  
		  this.setBaseUrl("http://sr.sabre.com/");
		  this.setPage("/");		  		  
	  }
	
	  public void run() {
		  try{
		  	
			remoteControl.type("txtLogin_Number", "894180");
			remoteControl.type("txtLogin_Password", "Flask1");
			remoteControl.click("b1");
			remoteControl.waitForPageToLoad("30000");
			remoteControl.click("link=New Change");
			remoteControl.waitForPageToLoad("30000");
			remoteControl.type("txtRequesterEmpID", "203705");
			
		  }catch (Exception e){
			logger.error(e);  
	  	  }		  
	  }

  void setEntity(ServiceRequest aServiceRequest) {
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
