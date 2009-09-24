/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr.peer;

import com.sabre.hd.easysr.Facade;
import com.sabre.hd.easysr.entities.ServiceRequest;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ServiceRequestPeer {

  public static ArrayList<ServiceRequest> getAll() {
    ArrayList<ServiceRequest> allServiceRequests = new ArrayList<ServiceRequest>();

    ServiceRequest aServiceRequest = cargaUnSr();
    allServiceRequests.add(aServiceRequest);
    aServiceRequest = cargaOtroSr();
    allServiceRequests.add(aServiceRequest);
    
    return allServiceRequests;
    
  }

  private static ServiceRequest cargaUnSr() {
    ServiceRequest aServiceRequest = new ServiceRequest();
    aServiceRequest.setName("Another SR");
    aServiceRequest.setRequestTitle("txtRequestTitle");
    aServiceRequest.setRequestOverview("txtRequestOverview");
    aServiceRequest.setBusinessUnit("cmbBusinessUnit");
    aServiceRequest.setSystem("cmbSystem");
    aServiceRequest.setPrimaveraId("txtPrimaveraId");
    aServiceRequest.setFRCR("txtFRCRId");
    aServiceRequest.setSEDI("txtSEDIId");
    aServiceRequest.setSabreAR("txtSabreAR");
    aServiceRequest.setSabrePR("txtSabrePR");
    aServiceRequest.setOwningCostCenter("txtOwningCostCenter");
    aServiceRequest.setFundingCostCenter("txtFundingCostCenter");
    aServiceRequest.setRequestor("txtRequestor");
    aServiceRequest.setVP("txtVP");
    aServiceRequest.setRequirements("txtRequirements");
    aServiceRequest.setImplDate("txtImplDate");
    aServiceRequest.setCRUDActiveDirectory(true);
    aServiceRequest.setEDSAlreadyEngaged(true);
    aServiceRequest.setImpactHost(true);
    aServiceRequest.setImplDateASAP(true);
    aServiceRequest.setInvolvePCI(true);
    aServiceRequest.setRequestorLoggedUser(true);
    aServiceRequest.setRequireAccess2VAR(true);
    aServiceRequest.setRequireApplicationChange(true);
    aServiceRequest.setRequireB2BVPN(true);
    aServiceRequest.setRequireFirewallChange(true);
    aServiceRequest.setRequireHardware(true);
    aServiceRequest.setRequireIncreaseTransactions(true);
    aServiceRequest.setRequireNewCircuit(true);
    aServiceRequest.setRequireNewSoftware(true);
    aServiceRequest.setRequireOfficeOpening(true);
    aServiceRequest.setRequireReport(true);
    aServiceRequest.setRequireSSL(true);
    aServiceRequest.setRequireSecurityException(true);
    aServiceRequest.setRequireStorage(true);
    aServiceRequest.setRequireWebHosting(true);
    return aServiceRequest;
  }

  private static ServiceRequest cargaOtroSr() {

    ServiceRequest aServiceRequestCert = new ServiceRequest();
    ServiceRequest aServiceRequestProd = new ServiceRequest();

    aServiceRequestCert.setName("The First SR");
    aServiceRequestCert.setRequestTitle("EMG (D) schema change AC cargomax on Cert");
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
}
