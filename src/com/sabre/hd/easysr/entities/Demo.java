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


    aServiceRequestCert.setRequestTitle("Schema change for AC DB in Cert");
    aServiceRequestCert.setRequestOverview("Execute scripts to change schema");
    aServiceRequestCert.setBusinessUnit("Air");
    aServiceRequestCert.setSystem("cmbSystem");
    aServiceRequestCert.setPrimaveraId("txtPrimaveraId");
    aServiceRequestCert.setFRCR("txtFRCRId");
    aServiceRequestCert.setSEDI("txtSEDIId");
    aServiceRequestCert.setSabreAR("txtSabreAR");
    aServiceRequestCert.setSabrePR("txtSabrePR");
    aServiceRequestCert.setOwningCostCenter("txtOwningCostCenter");
    aServiceRequestCert.setFundingCostCenter("txtFundingCostCenter");
    aServiceRequestCert.setRequestor("txtRequestor");
    aServiceRequestCert.setVP("txtVP");
    aServiceRequestCert.setRequirements("txtRequirements");
    aServiceRequestCert.setImplDate("txtImplDate");
    aServiceRequestCert.setCRUDActiveDirectory(true);
    aServiceRequestCert.setEDSAlreadyEngaged(true);
    aServiceRequestCert.setImpactHost(true);
    aServiceRequestCert.setImplDateASAP(true);
    aServiceRequestCert.setInvolvePCI(true);
    aServiceRequestCert.setRequestorLoggedUser(true);
    aServiceRequestCert.setRequireAccess2VAR(true);
    aServiceRequestCert.setRequireApplicationChange(true);
    aServiceRequestCert.setRequireB2BVPN(true);
    aServiceRequestCert.setRequireFirewallChange(true);
    aServiceRequestCert.setRequireHardware(true);
    aServiceRequestCert.setRequireIncreaseTransactions(true);
    aServiceRequestCert.setRequireNewCircuit(true);
    aServiceRequestCert.setRequireNewSoftware(true);
    aServiceRequestCert.setRequireOfficeOpening(true);
    aServiceRequestCert.setRequireReport(true);
    aServiceRequestCert.setRequireSSL(true);
    aServiceRequestCert.setRequireSecurityException(true);
    aServiceRequestCert.setRequireStorage(true);
    aServiceRequestCert.setRequireWebHosting(true);


    aChangeRequestCert.setAssets("aipsnp38");
    aChangeRequestCert.setChangeName("Deploy cargomax GUI for AC");
    aChangeRequestCert.setSponsor("Sabre");
    aChangeRequestCert.setSignificantChange(true);


    return aServiceRequestCert;
  }

}
