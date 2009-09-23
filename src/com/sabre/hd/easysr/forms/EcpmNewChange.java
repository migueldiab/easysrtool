package com.sabre.hd.easysr.forms;

public class EcpmNewChange extends ServiceRequestRobot{
		  		
	  public EcpmNewChange(){
		  
		  this.setBaseUrl("http://ecpm.sea.eds.com/");
		  this.setPage("/");		  		  
	  }
	
	  public void run() {
		  try{
		  	
			remoteControl.type("txtLogin_Number", "894180");
			remoteControl.type("txtLogin_Password", "Flask1");
			remoteControl.click("btnSubmit");
			remoteControl.waitForPageToLoad("30000");
			remoteControl.click("link=New Change");
			remoteControl.waitForPageToLoad("30000");
			remoteControl.type("txtRequesterEmpID", "203705");
			
		  }catch (Exception e){
			logger.error(e);  
	  	  }		  
	  }
}
