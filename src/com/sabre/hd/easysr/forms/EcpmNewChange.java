package com.sabre.hd.easysr.forms;

import com.sabre.hd.easysr.entities.ChangeRequest;
import java.awt.event.KeyEvent;

public class EcpmNewChange extends ServiceRequestRobot{
	  private ChangeRequest cr;

	  public EcpmNewChange(){
		  this.setBaseUrl("http://ecpm.sea.eds.com/");
		  this.setPage("/");
	  }
	  
	  public void setEntity(ChangeRequest changerequest)	  
	  {
      this.cr = changerequest;
	  }
	
	  public void run()
    {
		  try{
			  			  			  
				// login page			 
				remoteControl.type("txtLogin_Number", "203705");
				remoteControl.type("txtLogin_Password", "203705");
				remoteControl.click("btnSubmit");
				
				//
				remoteControl.waitForPageToLoad("30000");
				remoteControl.click("link=New Change");
				remoteControl.waitForPageToLoad("30000");
				remoteControl.type("txtRequesterEmpID", "203705");
                                      
				//remoteControl.type("txtAdminContactPhone",cr.getPhoneNumber());
				//remoteControl.type("txtAdminEmail",cr.getEmailAddress());
				remoteControl.type("txtExternalRefID",cr.getExternalReferenceId());
				remoteControl.type("txtRequesterEmpID",cr.getEmployeeId());
				remoteControl.type("txtRequesterMgrID",cr.getManagerId());
				//remoteControl.type("txtRequesterName",cr.getDeveloperVendor());
				remoteControl.select("cboVendor",cr.getDeveloperVendor());
				remoteControl.select("cboSponsor",cr.getSponsor());
				remoteControl.type("txtServiceRequest",cr.getServiceRequestId());
				
				//Description
				
				remoteControl.select("cboEnvironment_ID", cr.getEnvironment());
				remoteControl.type("txtRequesterLocation",cr.getImplementationLocation());

				remoteControl.type("txtChangeName",cr.getChangeName());
				remoteControl.type("txtChangeDesc",cr.getDescription());
				
				// Pop Up - Assest.
				
				remoteControl.click("cmdAdd");
				remoteControl.waitForPopUp("myRemote32", "30000");
				remoteControl.selectWindow("name=myRemote32");
				remoteControl.type("txtAsset_Tag",cr.getAssets());
				
				remoteControl.click("btnSearch");
				remoteControl.waitForPageToLoad("30000");
				remoteControl.click("chkAction");
				remoteControl.click("cmdAdd");
				
				//-------------
							
				remoteControl.selectWindow(null);
									
				//remoteControl.type("txtCustImpact","");
				//remoteControl.type("txtProblemId","");
				
				//Classification		
				remoteControl.select("cboChangeStatus", cr.getCurrentStatus());
				remoteControl.select("cboChangeComponentType",cr.getComponentType());
				remoteControl.select("cboChangeState", cr.getState());
				remoteControl.select("cboChangeActivity", cr.getActivity());			
				remoteControl.type("txtCategory",cr.getChangeCategory());			
				remoteControl.select("cboPriority", cr.getPriority());			
				remoteControl.type("txtChangeJustify",cr.getChangeJustification());			
				remoteControl.select("cboImpactCategory", cr.getRequestedType());			
				//remoteControl.click("chkFirewall");			
				remoteControl.type("txtRiskReason",cr.getRiskReason());			
				remoteControl.type("txtImpactDesc",cr.getImpactDescription());						
				remoteControl.type("txtHSISNumber",cr.getHSIS());
				remoteControl.type("txtECONumber",cr.getECO());
				remoteControl.type("txtLMRNumber",cr.getLMR());
				remoteControl.type("txtOtherNumber",cr.getOther());
				
				//Impact Attribute Matrix				
				remoteControl.click("chkRisk_Emergency");
				remoteControl.click("chkRisk_Multi_Clients");
				remoteControl.click("chkRisk_Multi_Tech_Teams");
				remoteControl.click("chkRisk_Critical_SPOF");
				remoteControl.click("chkRisk_New_Activity");
				//remoteControl.type("txtCustImpactDesc","0 - Emergency");
				
					//remoteControl.click("chkcchange");
				
				//Risk Matrix			
				remoteControl.click("//input[@name='rdoImpactCode' and @value='1. No impact']");
				remoteControl.click("//input[@name='rdoRiskCode' and @value='2. Low risk']");
				//remoteControl.click("document.forms[0].elements[58]");
				//remoteControl.click("document.forms[0].elements[62]");
				
				//remoteControl.click("//tr[15]/td/font/input");
				//remoteControl.click("//tr[15]/td/font/input");
									
				//Installation Procedures
				remoteControl.type("txtInstallProc",cr.getInstallationProcedures());
				
				//Fallback Procedures
				remoteControl.type("txtFallBackProc",cr.getFallbackProcedures());
				
				//Implementation Schedule
				remoteControl.type("txtStartDate",cr.getStartDate());
				remoteControl.type("txtEndDate",cr.getEndDate());
				remoteControl.type("txtStartTime",cr.getStartTime());
				remoteControl.type("txtEndTime",cr.getEndTime());
				remoteControl.type("txtDurationDays",cr.getDuration());
				remoteControl.type("txtDurationHours",cr.getDuration());
				remoteControl.type("txtDurationMinutes","34");
				
				//Support Contact Information
				remoteControl.type("txtPriContactName",cr.getPrimaryCoordinatorName());
				remoteControl.type("txtPriContactPhone",cr.getPrimaryPhoneNumber());
				remoteControl.type("txtPriContactEmail",cr.getPrimaryEmailAddress());
				
				remoteControl.type("txtSecContactName",cr.getSecondaryName());
				remoteControl.type("txtSecContactPhone",cr.getSecondaryPhoneNumber());			
				remoteControl.type("txtSecContactEmail",cr.getSecondaryEmailAddress());
				
				remoteControl.type("txtInstallerEmpID",cr.getInstallerId());
				//remoteControl.type("txtInstallerPhone",);
				
				//remoteControl.type("txtBUDName",cr.getBusinessUnitDirector());
				//remoteControl.type("txtBUDPhone",cr.getBudPhoneNumber());
				//remoteControl.type("txtBUDEmail",cr.getBudEmailAddress());
				
				//remoteControl.type("txtCoverageName",cr.getCoverageName());
				//remoteControl.type("txtCoveragePhone",cr.getCoveragePhoneNumber());
				//remoteControl.type("txtCoveragePager",cr.getCoveragePagerNumber());
				//remoteControl.type("txtCoverageEmail",cr.getCoverageEmailAddress());
				
				//remoteControl.type("txtFALName",cr.getFuncationalAreaLead());
				//remoteControl.type("txtFALPhone",cr.getFalPhoneNumber());
				//remoteControl.type("txtFALEmail",cr.getFalEmailAddress());
				remoteControl.click("cmdButton");
                               

			  /*
			// login page			 
			remoteControl.type("txtLogin_Number", "203705");
			remoteControl.type("txtLogin_Password", "203705");
			remoteControl.click("btnSubmit");
			
			//
			remoteControl.waitForPageToLoad("30000");
			remoteControl.click("link=New Change");
			remoteControl.waitForPageToLoad("30000");
			remoteControl.type("txtRequesterEmpID", "203705");
			
			//Requester Information
			
			remoteControl.type("txtAdminContactPhone",cr.getPhoneNumber());
			
			remoteControl.type("txtAdminEmail","marcos.lucas@sabre.com");
			remoteControl.type("txtExternalRefID","203705");
			remoteControl.type("txtRequesterEmpID","203705");
			remoteControl.type("txtRequesterMgrID","203705" );
			remoteControl.type("txtRequesterName","Marcos Lucas");
			remoteControl.select("cboVendor", "label=SABRE");
			remoteControl.select("cboSponsor", "label=SABRE");
			remoteControl.type("txtServiceRequest","impl");
			
			//Description
			
			remoteControl.select("cboEnvironment_ID", "label=Midrange");
			remoteControl.type("txtRequesterLocation","98234987264876");
			remoteControl.type("txtChangeName","Change Name example");
			remoteControl.type("txtChangeDesc","Description of change name example");
			
			// Pop Up - Assest.
			
			remoteControl.click("cmdAdd");
			remoteControl.waitForPopUp("myRemote32", "30000");
			remoteControl.selectWindow("name=myRemote32");
			remoteControl.type("txtAsset_Tag","aipsnp31");
			
			remoteControl.click("btnSearch");
			remoteControl.waitForPageToLoad("30000");
			remoteControl.click("chkAction");
			remoteControl.click("cmdAdd");
			
			//-------------
						
			remoteControl.selectWindow(null);
								
			//remoteControl.type("txtCustImpact","");
			//remoteControl.type("txtProblemId","");
			
			//Classification		
			remoteControl.select("cboChangeStatus", "label=SAVED AS DRAFT");
			remoteControl.select("cboChangeComponentType", "label=APPLICATION");
			remoteControl.select("cboChangeState", "label=CERTIFICATION");
			remoteControl.select("cboChangeActivity", "label=NEW DEVELOPMENT");			
			remoteControl.type("txtCategory","40.70.25");			
			remoteControl.select("cboPriority", "label=CRITICAL");			
			remoteControl.type("txtChangeJustify","This is the change Justification");			
			remoteControl.select("cboImpactCategory", "label=EMERGENCY");			
			remoteControl.click("chkFirewall");			
			remoteControl.type("txtRiskReason","This is the risk reason entered by teh robot");			
			remoteControl.type("txtImpactDesc","This is the Impact Description entered by robot");						
			remoteControl.type("txtHSISNumber","");
			remoteControl.type("txtECONumber","");
			remoteControl.type("txtLMRNumber","");
			remoteControl.type("txtOtherNumber","");
			
			//Impact Attribute Matrix				
			remoteControl.click("chkRisk_Emergency");
			remoteControl.click("chkRisk_Multi_Clients");
			remoteControl.click("chkRisk_Multi_Tech_Teams");
			remoteControl.click("chkRisk_Critical_SPOF");
			remoteControl.click("chkRisk_New_Activity");
			//remoteControl.type("txtCustImpactDesc","0 - Emergency");
			
				//remoteControl.click("chkcchange");
			
			//Risk Matrix			
			remoteControl.click("//input[@name='rdoImpactCode' and @value='1. No impact']");
			remoteControl.click("//input[@name='rdoRiskCode' and @value='2. Low risk']");
			//remoteControl.click("document.forms[0].elements[58]");
			//remoteControl.click("document.forms[0].elements[62]");
			
			//remoteControl.click("//tr[15]/td/font/input");
			//remoteControl.click("//tr[15]/td/font/input");
								
			//Installation Procedures
			remoteControl.type("txtInstallProc","This is the installation procedure");
			
			//Fallback Procedures
			remoteControl.type("txtFallBackProc","This is the fallback procedure");
			
			//Implementation Schedule
			remoteControl.type("txtStartDate","09/22/2009");
			remoteControl.type("txtEndDate","09/22/2009");
			remoteControl.type("txtStartTime","06:00");
			remoteControl.type("txtEndTime","23:00 ");
			remoteControl.type("txtDurationDays","1");
			remoteControl.type("txtDurationHours","2");
			remoteControl.type("txtDurationMinutes","34");
			
			//Support Contact Information
			remoteControl.type("txtPriContactName","Marcos Lucas");
			remoteControl.type("txtPriContactPhone","+598  518 7654");
			remoteControl.type("txtPriContactEmail","marcos.lucas@sabre.com");
			
			remoteControl.type("txtSecContactName","Gaston Gordillo");
			remoteControl.type("txtSecContactPhone","+598 99 064534");			
			remoteControl.type("txtSecContactEmail","gaston.gordillo@sabre.com");
			
			remoteControl.type("txtInstallerEmpID","203705");
			remoteControl.type("txtInstallerPhone","+598 99 064534");
			
			remoteControl.type("txtBUDName","");
			remoteControl.type("txtBUDPhone","");
			remoteControl.type("txtBUDEmail","");
			
			remoteControl.type("txtCoverageName","");
			remoteControl.type("txtCoveragePhone","");
			remoteControl.type("txtCoveragePager","");
			remoteControl.type("txtCoverageEmail","");
			
			remoteControl.type("txtFALName","");
			remoteControl.type("txtFALPhone","");
			remoteControl.type("txtFALEmail","");
			remoteControl.click("cmdButton");
			
			//remoteControl.assertEquals("A valid Installer Phone Number must be entered.\nA valid Installer Name must be entered.\nA valid Primary Contact Phone Number must be entered.\nA valid Primary Contact Name must be entered.\nA valid Manager ID must be entered.\nA valid Employee ID must be entered.\nA value  for SERVICE REQUEST must be Entered.\nA valid Change Name must be entered.\nAt least one customer must be entered for Customers Impacted.\nA valid Change Description must be entered.\nA valid Category Code must be entered.\nA valid Change Justification must be entered.\nYou must associate at least one asset.", selenium.getAlert());
			*/
			
		  }
      catch (Exception e) {
        System.out.print(e);
        logger.error(e);
	  	}		  
	  }
}
