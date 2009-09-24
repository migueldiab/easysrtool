/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr.peer;

import com.sabre.hd.easysr.entities.ChangeRequest;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ChangeRequestPeer {

  public static ArrayList<ChangeRequest> getAll() {
    ArrayList<ChangeRequest> allChangeRequest = new ArrayList<ChangeRequest>();

    ChangeRequest aChangeRequest = cargaUnCr();
    allChangeRequest.add(aChangeRequest);
    
    return allChangeRequest;

  }

    private static  ChangeRequest cargaUnCr(){

    ChangeRequest aChangeRequestCert = new ChangeRequest();
    ChangeRequest aChangeRequestProd = new ChangeRequest();
    aChangeRequestCert.setPhoneNumber("598 2 518 6342");
    aChangeRequestCert.setEmployeeId("203705");
    aChangeRequestCert.setManagerId("426528");
    //aChangeRequestCert.setSponsor("Sabre");
    aChangeRequestCert.setSignificantChange(true);
    aChangeRequestCert.setServiceRequestId("Impl");
    //aChangeRequestCert.setEnvironment("Certification");
    aChangeRequestCert.setImplementationLocation("98234987264876");
    aChangeRequestCert.setChangeName("Deploy cargomax GUI for AC");
    aChangeRequestCert.setDescription("This is needed to resolve issues reported by the customer, a new version of the software needs to be installed. Pre Implementation Test Plan:Software was tested by Sabre on  cert and dev enviroment");
    aChangeRequestCert.setAssets("AIPSNC11");
    aChangeRequestCert.setPotentialCustomersImpacted("SBI");
    aChangeRequestCert.setCurrentStatus("label=SAVED AS DRAFT");
    //aChangeRequestCert.setComponentType("APPLICATION");
    //aChangeRequestCert.setState("PRODUCTION");
    //aChangeRequestCert.setActivity("CORRECTIVE MAINTENANCE");
    aChangeRequestCert.setChangeCategory("40.70.25");
    //aChangeRequestCert.setPriority("URGENT");
    aChangeRequestCert.setChangeJustification("This request is needed to install a new version of the Cargospot software to resolve issues reported by the customer.");
    aChangeRequestCert.setRequestedType("PLANNED-4QWIK-SBI");
    aChangeRequestCert.setRiskReason("Low risk. New installation that effects ABC cargospot (ABC).");
    aChangeRequestCert.setImpactDescription("No Impact. New installation that effects JJ CS. This installation will not effect other users or require a reboot.");
    aChangeRequestCert.setPotentialImpact(3);
    aChangeRequestCert.setPotentialRisk(2);
    aChangeRequestCert.setInstallationProcedures("Load new software - Stop cargospot service - Upgrade software - Restart cargospot service - Verification");
    aChangeRequestCert.setFallbackProcedures("Stop cargospot service - Restore software - Restart cargospot service");
    aChangeRequestCert.setStartDate("09/28/2009");
    aChangeRequestCert.setEndDate("09/28/2009");
    aChangeRequestCert.setStartTime("10:00");
    aChangeRequestCert.setEndTime("15:00");
    aChangeRequestCert.setDuration("01");
    aChangeRequestCert.setPrimaryCoordinatorName("MARCOS LUCAS");
    aChangeRequestCert.setSecondaryName("FRANCISCO GUELLA");
    aChangeRequestCert.setSecondaryPhoneNumber("59 825 182 025");
    aChangeRequestCert.setSecondaryEmailAddress("francisco.guella@sabre-holdings.com");
    aChangeRequestCert.setInstallerId("203705");

    return aChangeRequestCert;
     }

}
