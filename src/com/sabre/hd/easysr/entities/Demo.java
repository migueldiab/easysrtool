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


     private ServiceRequest cargaUnSr() {

    ServiceRequest aServiceRequestCert = new ServiceRequest();
    ServiceRequest aServiceRequestProd = new ServiceRequest();
    ChangeRequest aChangeRequestCert = new ChangeRequest();
    ChangeRequest aChangeRequestProd = new ChangeRequest();

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


    aChangeRequestCert.setAssets("aipsnp38");
    aChangeRequestCert.setChangeName("Deploy cargomax GUI for AC");
    aChangeRequestCert.setSponsor("Sabre");
    aChangeRequestCert.setSignificantChange(true);


    return aServiceRequestCert;
  }

}
