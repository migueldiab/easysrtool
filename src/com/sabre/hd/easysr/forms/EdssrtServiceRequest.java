package com.sabre.hd.easysr.forms;

import com.sabre.hd.easysr.entities.ChangeRequest;
import com.sabre.hd.easysr.entities.ServiceRequest;

public class EdssrtServiceRequest extends ServiceRequestRobot{

	 
	private ServiceRequest sr;
	
	public EdssrtServiceRequest(){
		  
		  this.setBaseUrl("http://edssrt.sea.eds.com/TSG/ReqLogon.asp");
		  this.setPage("/");
		  
	  }
	 
	 public void setEntity(ServiceRequest servicerequest)
	  //public void setEntity(ChangeRequest cr)
	  {
		this.sr =  servicerequest;
	  
	  }
	 
	  public void run() {
		  try{			  
				
			  //Login
			  remoteControl.type("unm", "206662");
			  remoteControl.type("pwrd", "nokia1");
			  remoteControl.click("B1");			  
			  remoteControl.waitForPageToLoad("30000");
			  
			  // Service Request Tool New.
			  remoteControl.click("Image27");
			  remoteControl.waitForPageToLoad("30000");
			  remoteControl.click("SRTYPE_28");
			  remoteControl.click("B1");
			  remoteControl.waitForPageToLoad("30000");
			  
			  // Request Info
			  remoteControl.type("ReqTitle", sr.getRequestTitle());
			  remoteControl.type("ReqDesc", sr.getRequestOverview());
			  remoteControl.select("BusinessUnitID","label=Airline Solutions");
			  remoteControl.select("SabreSystemNewID", "label=eMergo");
			  remoteControl.select("RegionID", "label=EMEA");
			  
			  //Other Info  - Cost center  -9014861
			  remoteControl.type("DemandID", "P_15717");
			  
			  //Cost Center info
			  remoteControl.type("OwningCCSB", "9014861");
			  remoteControl.type("CCSB1", "9014861"); 
			  remoteControl.type("SponsorshipPercent1", "100");
			  
			  //Contact Info
			  
				
			  remoteControl.click("//tr[4]/td/table/tbody/tr/td[5]/a/img");
			  remoteControl.waitForPopUp("getPeoplePop", "30000");
			  remoteControl.selectWindow("name=getPeoplePop");
			  remoteControl.type("LName", "endicott");
			  remoteControl.click("B1");
			  remoteControl.waitForPageToLoad("30000");
			  remoteControl.click("B3");
			  
			  
			  remoteControl.selectWindow(null);
			  
			  //Business Info.
			  remoteControl.type("KeyMajorDeliverable", "weqweqweqwe");
			  remoteControl.type("ReqCompleteDate", "12/12/2009");
			  
			  remoteControl.click("NeedHardware_1");
			  remoteControl.click("NeedSoftware_1");
			  remoteControl.click("NeedSAN_1");
			  remoteControl.click("EDSSWApp_1");
			  remoteControl.click("SecurityExcept_1");
			  remoteControl.click("FirewallAccess_1");
			  remoteControl.click("FlowTrans_1");
			  remoteControl.click("PCIProcess_1");
			  remoteControl.click("RequireSSL_1");
			  remoteControl.click("B2BVPNAccess_1");
			  remoteControl.click("VendorAccessRoom_1");
			  remoteControl.click("WebHost_1");
			  remoteControl.click("HostCapacity_1");
			  remoteControl.click("Circuit_1");
			  remoteControl.click("ReportYesNo_1");
			  remoteControl.click("LDAPActiveDir_1");
			  remoteControl.click("Office_1");
			  remoteControl.click("ContactedEDS_1");
			  
			  //Save
			  remoteControl.click("//table[4]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td/font");			  												  
			  
		  }catch (Exception e){
		  
			logger.error(e);  
	  	  }		  
	  }	 	
}
