/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr.entities;

/**
 *
 * @author SG0203705
 */
public class Demo {


     public ServiceRequest cargaUnSr() {

    ServiceRequest aServiceRequestCert = new ServiceRequest();
    ServiceRequest aServiceRequestProd = new ServiceRequest();

    aServiceRequestCert.setRequestTitle("EMG (D) schema change AC cargomax on PROD");
    aServiceRequestCert.setRequestOverview("DB schema change needed to promote current CMX version from cert to prod Change must be execute during client off hours and app daemons downDBA and app tema must coordinate a proper date/time for execution scripts must be executed by cmxadmin user (app team does not know the schema owner password");
    aServiceRequestCert.setBusinessUnit("Airline Solutions");
    aServiceRequestCert.setSystem("eMergo");
    aServiceRequestCert.setPrimaveraId("p_15717");
    aServiceRequestCert.setFRCR("");
    aServiceRequestCert.setSEDI("");
    aServiceRequestCert.setSabreAR("");
    aServiceRequestCert.setSabrePR("");
    aServiceRequestCert.setOwningCostCenter("9014664");
    aServiceRequestCert.setFundingCostCenter("9014664");
    aServiceRequestCert.setRequestor("LUCAS, MARCOS");
    aServiceRequestCert.setVP("txtVP");
    aServiceRequestCert.setRequirements("txtRequirements");
    aServiceRequestCert.setImplDate("9/25/2009");
    aServiceRequestCert.setCRUDActiveDirectory(false);
    aServiceRequestCert.setEDSAlreadyEngaged(false);
    aServiceRequestCert.setImpactHost(false);
    aServiceRequestCert.setImplDateASAP(false);
    aServiceRequestCert.setInvolvePCI(false);
    aServiceRequestCert.setRequestorLoggedUser(false);
    aServiceRequestCert.setRequireAccess2VAR(false);
    aServiceRequestCert.setRequireApplicationChange(false);
    aServiceRequestCert.setRequireB2BVPN(false);
    aServiceRequestCert.setRequireFirewallChange(false);
    aServiceRequestCert.setRequireHardware(false);
    aServiceRequestCert.setRequireIncreaseTransactions(false);
    aServiceRequestCert.setRequireNewCircuit(false);
    aServiceRequestCert.setRequireNewSoftware(false);
    aServiceRequestCert.setRequireOfficeOpening(false);
    aServiceRequestCert.setRequireReport(false);
    aServiceRequestCert.setRequireSSL(false);
    aServiceRequestCert.setRequireSecurityException(false);
    aServiceRequestCert.setRequireStorage(false);
    aServiceRequestCert.setRequireWebHosting(false);

    return aServiceRequestCert;
  }
    public  ChangeRequest cargaUnCr(){

    ChangeRequest aChangeRequestCert = new ChangeRequest();
    ChangeRequest aChangeRequestProd = new ChangeRequest();
    aChangeRequestCert.setPhoneNumber("598 2 518 6342");
    aChangeRequestCert.setEmployeeId("203705");
    aChangeRequestCert.setManagerId("426528");
    //aChangeRequestCert.setSponsor("Sabre");
    aChangeRequestCert.setSignificantChange(true);
    aChangeRequestCert.setServiceRequestId("Impl1");
    //aChangeRequestCert.setEnvironment("Certification");
    aChangeRequestCert.setImplementationLocation("98234987264876  TCC - TULSA COMPUTER CENTER");
    aChangeRequestCert.setChangeName("Deploy cargomax GUI for AC");
    aChangeRequestCert.setDescription("This is needed to resolve issues reported by the customer, a new version of the software needs to be installed. Pre Implementation Test Plan:Software was tested by Sabre on  cert and dev enviroment");
    aChangeRequestCert.setAssets("AIPSNC11");
    aChangeRequestCert.setPotentialCustomersImpacted("SBI");
    aChangeRequestCert.setCurrentStatus("label=SAVED AS DRAFT");
    //aChangeRequestCert.setComponentType("APPLICATION");
    //aChangeRequestCert.setState("PRODUCTION");
    //aChangeRequestCert.setActivity("CORRECTIVE MAINTENANCE");
    aChangeRequestCert.setChangeCategory("40.70.25  EMERGO - 4QWIK");
    //aChangeRequestCert.setPriority("URGENT");
    aChangeRequestCert.setChangeCategory("This request is needed to install a new version of the Cargospot software to resolve issues reported by the customer.");
    aChangeRequestCert.setRequestedType("PLANNED-4QWIK-SBI");
    aChangeRequestCert.setRiskReason("Low risk. New installation that effects ABC cargospot (ABC).");
    aChangeRequestCert.setImpactDescription("No Impact. New installation that effects JJ CS. This installation will not effect other users or require a reboot.");
    aChangeRequestCert.setPotentialImpact(3);
    aChangeRequestCert.setPotentialRisk(2);
    aChangeRequestCert.setInstallationProcedures("Load new software - Stop cargospot service - Upgrade software - Restart cargospot service - Verification");
    aChangeRequestCert.setFallbackProcedures("Stop cargospot service - Restore software - Restart cargospot service");
    aChangeRequestCert.setStartDate("09/24/2009");
    aChangeRequestCert.setEndDate("09/24/2009");
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
