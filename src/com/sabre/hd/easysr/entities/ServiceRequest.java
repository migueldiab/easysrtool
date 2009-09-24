package com.sabre.hd.easysr.entities;

import org.apache.log4j.Logger;

import com.sabre.hd.easysr.persistence.dao.ServiceRequestDAO;
import com.sabre.hd.easysr.persitence.DAOFactory;
import com.sabre.hd.easysr.persitence.PersistentObject;
import java.sql.Date;
import com.sabre.hd.easysr.xml.*;

public class ServiceRequest extends PersistentObject{
	
	private static Logger logger = Logger.getLogger(ServiceRequest.class.getName());
	private ServiceRequestDAO dao;

  private String url;
  private String name;
  private String requestTitle;
  private String requestOverview;
  private String businessUnit;
  private String system;
  private String primaveraId;
  private String FRCR;
  private String SEDI;
  private String sabreAR;
  private String sabrePR;
  private String owningCostCenter;
  private String fundingCostCenter;
  private String requestor;
  private String VP;
  private String requirements;
  private String implDate;
  private boolean CRUDActiveDirectory;
  private boolean EDSAlreadyEngaged;
  private boolean impactHost;
  private boolean implDateASAP;
  private boolean involvePCI;
  private boolean requestorLoggedUser;
  private boolean requireAccess2VAR;
  private boolean requireApplicationChange;
  private boolean requireB2BVPN;
  private boolean requireFirewallChange;
  private boolean requireHardware;
  private boolean requireIncreaseTransactions;
  private boolean requireNewCircuit;
  private boolean requireNewSoftware;
  private boolean requireOfficeOpening;
  private boolean requireReport;
  private boolean requireSSL;
  private boolean requireSecurityException;
  private boolean requireStorage;
  private boolean requireWebHosting;


  public static boolean save() {
    return true;
  }

  public ServiceRequest ()
	{
    
  }

  public ServiceRequest(String url, String name,String path){
      this.setUrl(url);
      this.setName(name);

      XmlTemplateReader xtr = new XmlTemplateReader(path);
      this.setRequestTitle(xtr.getFieldValue("requestTitle"));
      this.setRequestOverview(xtr.getFieldValue("requestOverview"));
      this.setBusinessUnit(xtr.getFieldValue("businessUnit"));
      this.setSystem(xtr.getFieldValue("system"));
      this.setPrimaveraId(xtr.getFieldValue("primaveraId"));
      this.setFRCR(xtr.getFieldValue("FRCR"));
      this.setSEDI(xtr.getFieldValue("SEDI"));
      this.setSabreAR(xtr.getFieldValue("sabreAR"));
      this.setSabrePR(xtr.getFieldValue("sabrePR"));
      this.setOwningCostCenter(xtr.getFieldValue("owningCostCenter"));
      this.setFundingCostCenter(xtr.getFieldValue("fundingCostCenter"));
      this.setRequestor(xtr.getFieldValue("requestor"));
      this.setVP(xtr.getFieldValue("VP"));
      this.setRequirements(xtr.getFieldValue("requirements"));
      this.setImplDate(xtr.getFieldValue("implDate"));

      // el metodo getFieldValue devuelve un string, y no un boolean. Por eso
      // pasamos estps parametros de la misma manera que el constructor de abajo;
            this.setCRUDActiveDirectory(CRUDActiveDirectory);
            this.setEDSAlreadyEngaged(EDSAlreadyEngaged);
            this.setImpactHost(impactHost);
            this.setImplDateASAP(implDateASAP);
            this.setInvolvePCI(involvePCI);
            this.setRequestorLoggedUser(requestorLoggedUser);
            this.setRequireAccess2VAR(requireAccess2VAR);
            this.setRequireApplicationChange(requireApplicationChange);
            this.setRequireB2BVPN(requireB2BVPN);
            this.setRequireFirewallChange(requireFirewallChange);
            this.setRequireHardware(requireHardware);
            this.setRequireIncreaseTransactions(requireIncreaseTransactions);
            this.setRequireNewCircuit(requireNewCircuit);
            this.setRequireNewSoftware(requireNewSoftware);
            this.setRequireOfficeOpening(requireOfficeOpening);
            this.setRequireReport(requireReport);
            this.setRequireSSL(requireSSL);
            this.setRequireSecurityException(requireSecurityException);
            this.setRequireStorage(requireStorage);
            this.setRequireWebHosting(requireWebHosting);

  }

	public ServiceRequest (String url, String name, String requestTitle,   String requestOverview,   String businessUnit,   String system,   String primaveraId,   String FRCR,   String SEDI,   String sabreAR,   String sabrePR,   String owningCostCenter,   String fundingCostCenter,   String requestor,   String VP,   String requirements,   String   implDate,   boolean CRUDActiveDirectory,   boolean EDSAlreadyEngaged,   boolean impactHost,   boolean implDateASAP,   boolean involvePCI,   boolean requestorLoggedUser,   boolean requireAccess2VAR,   boolean requireApplicationChange,   boolean requireB2BVPN,   boolean requireFirewallChange,   boolean requireHardware,   boolean requireIncreaseTransactions,   boolean requireNewCircuit,   boolean requireNewSoftware,   boolean requireOfficeOpening,   boolean requireReport,   boolean requireSSL,   boolean requireSecurityException,   boolean requireStorage,   boolean requireWebHosting)
	{
            this.setUrl(url);
            this.setName(name);
            this.setRequestTitle(requestTitle);
            this.setRequestOverview(requestOverview);
            this.setBusinessUnit(businessUnit);
            this.setSystem(system);
            this.setPrimaveraId(primaveraId);
            this.setFRCR(FRCR);
            this.setSEDI(SEDI);
            this.setSabreAR(sabreAR);
            this.setSabrePR(sabrePR);
            this.setOwningCostCenter(owningCostCenter);
            this.setFundingCostCenter(fundingCostCenter);
            this.setRequestor(requestor);
            this.setVP(VP);
            this.setRequirements(requirements);
            this.setImplDate(implDate);
            this.setCRUDActiveDirectory(CRUDActiveDirectory);
            this.setEDSAlreadyEngaged(EDSAlreadyEngaged);
            this.setImpactHost(impactHost);
            this.setImplDateASAP(implDateASAP);
            this.setInvolvePCI(involvePCI);
            this.setRequestorLoggedUser(requestorLoggedUser);
            this.setRequireAccess2VAR(requireAccess2VAR);
            this.setRequireApplicationChange(requireApplicationChange);
            this.setRequireB2BVPN(requireB2BVPN);
            this.setRequireFirewallChange(requireFirewallChange);
            this.setRequireHardware(requireHardware);
            this.setRequireIncreaseTransactions(requireIncreaseTransactions);
            this.setRequireNewCircuit(requireNewCircuit);
            this.setRequireNewSoftware(requireNewSoftware);
            this.setRequireOfficeOpening(requireOfficeOpening);
            this.setRequireReport(requireReport);
            this.setRequireSSL(requireSSL);
            this.setRequireSecurityException(requireSecurityException);
            this.setRequireStorage(requireStorage);
            this.setRequireWebHosting(requireWebHosting);
        }

  public static void launchSRCreation() {
//    EcpmNewChange f1 = new EcpmNewChange();
//      try {
//        f1.load();
//        f1.run();
//        f1.finish();
//      } catch (Exception ex) {
//        Logger.getLogger(EasySRMain.class.getName()).log(Level.ERROR, null, ex);
//      }
  }
	
	public ServiceRequestDAO getDao() {
		if(this.dao == null){
			this.dao = (ServiceRequestDAO)DAOFactory.getDAO(ServiceRequest.class.getName());
		}
		return dao;
	}

	public void setDao(ServiceRequestDAO dao) {
		this.dao = dao;
	}

	public static ServiceRequestDAO getDaoStatic(){
		return (ServiceRequestDAO)DAOFactory.getDAO(ServiceRequest.class.getName());
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


  public String getRequestTitle() {
    return requestTitle;
  }

  public void setRequestTitle(String requestTitle) {
    this.requestTitle = requestTitle;
  }


  public String getName() {
      return name;
  }

  public void setName(String name){
      this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getRequestOverview() {
    return requestOverview;
  }

  public void setRequestOverview(String requestOverview) {
    this.requestOverview = requestOverview;
  }

  /**
   * @return the businessUnit
   */
  public String getBusinessUnit() {
    return businessUnit;
  }

  /**
   * @param businessUnit the businessUnit to set
   */
  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  /**
   * @return the system
   */
  public String getSystem() {
    return system;
  }

  /**
   * @param system the system to set
   */
  public void setSystem(String system) {
    this.system = system;
  }

  /**
   * @return the primaveraId
   */
  public String getPrimaveraId() {
    return primaveraId;
  }

  /**
   * @param primaveraId the primaveraId to set
   */
  public void setPrimaveraId(String primaveraId) {
    this.primaveraId = primaveraId;
  }

  /**
   * @return the FRCR
   */
  public String getFRCR() {
    return FRCR;
  }

  /**
   * @param FRCR the FRCR to set
   */
  public void setFRCR(String FRCR) {
    this.FRCR = FRCR;
  }

  /**
   * @return the SEDI
   */
  public String getSEDI() {
    return SEDI;
  }

  /**
   * @param SEDI the SEDI to set
   */
  public void setSEDI(String SEDI) {
    this.SEDI = SEDI;
  }

  /**
   * @return the sabreAR
   */
  public String getSabreAR() {
    return sabreAR;
  }

  /**
   * @param sabreAR the sabreAR to set
   */
  public void setSabreAR(String sabreAR) {
    this.sabreAR = sabreAR;
  }

  /**
   * @return the sabrePR
   */
  public String getSabrePR() {
    return sabrePR;
  }

  /**
   * @param sabrePR the sabrePR to set
   */
  public void setSabrePR(String sabrePR) {
    this.sabrePR = sabrePR;
  }

  /**
   * @return the owningCostCenter
   */
  public String getOwningCostCenter() {
    return owningCostCenter;
  }

  /**
   * @param owningCostCenter the owningCostCenter to set
   */
  public void setOwningCostCenter(String owningCostCenter) {
    this.owningCostCenter = owningCostCenter;
  }

  /**
   * @return the fundingCostCenter
   */
  public String getFundingCostCenter() {
    return fundingCostCenter;
  }

  /**
   * @param fundingCostCenter the fundingCostCenter to set
   */
  public void setFundingCostCenter(String fundingCostCenter) {
    this.fundingCostCenter = fundingCostCenter;
  }

  /**
   * @return the requestor
   */
  public String getRequestor() {
    return requestor;
  }

  /**
   * @param requestor the requestor to set
   */
  public void setRequestor(String requestor) {
    this.requestor = requestor;
  }

  /**
   * @return the VP
   */
  public String getVP() {
    return VP;
  }

  /**
   * @param VP the VP to set
   */
  public void setVP(String VP) {
    this.VP = VP;
  }

  /**
   * @return the requirements
   */
  public String getRequirements() {
    return requirements;
  }

  /**
   * @param requirements the requirements to set
   */
  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  /**
   * @return the implDate
   */
  public String getImplDate() {
    return implDate;
  }

  /**
   * @param implDate the implDate to set
   */
  public void setImplDate(String implDate) {
    this.implDate = implDate;
  }

  /**
   * @return the CRUDActiveDirectory
   */
  public boolean isCRUDActiveDirectory() {
    return CRUDActiveDirectory;
  }

  /**
   * @param CRUDActiveDirectory the CRUDActiveDirectory to set
   */
  public void setCRUDActiveDirectory(boolean CRUDActiveDirectory) {
    this.CRUDActiveDirectory = CRUDActiveDirectory;
  }

  /**
   * @return the EDSAlreadyEngaged
   */
  public boolean isEDSAlreadyEngaged() {
    return EDSAlreadyEngaged;
  }

  /**
   * @param EDSAlreadyEngaged the EDSAlreadyEngaged to set
   */
  public void setEDSAlreadyEngaged(boolean EDSAlreadyEngaged) {
    this.EDSAlreadyEngaged = EDSAlreadyEngaged;
  }

  /**
   * @return the impactHost
   */
  public boolean isImpactHost() {
    return impactHost;
  }

  /**
   * @param impactHost the impactHost to set
   */
  public void setImpactHost(boolean impactHost) {
    this.impactHost = impactHost;
  }

  /**
   * @return the implDateASAP
   */
  public boolean isImplDateASAP() {
    return implDateASAP;
  }

  /**
   * @param implDateASAP the implDateASAP to set
   */
  public void setImplDateASAP(boolean implDateASAP) {
    this.implDateASAP = implDateASAP;
  }

  /**
   * @return the involvePCI
   */
  public boolean isInvolvePCI() {
    return involvePCI;
  }

  /**
   * @param involvePCI the involvePCI to set
   */
  public void setInvolvePCI(boolean involvePCI) {
    this.involvePCI = involvePCI;
  }

  /**
   * @return the requestorLoggedUser
   */
  public boolean isRequestorLoggedUser() {
    return requestorLoggedUser;
  }

  /**
   * @param requestorLoggedUser the requestorLoggedUser to set
   */
  public void setRequestorLoggedUser(boolean requestorLoggedUser) {
    this.requestorLoggedUser = requestorLoggedUser;
  }

  /**
   * @return the requireAccess2VAR
   */
  public boolean isRequireAccess2VAR() {
    return requireAccess2VAR;
  }

  /**
   * @param requireAccess2VAR the requireAccess2VAR to set
   */
  public void setRequireAccess2VAR(boolean requireAccess2VAR) {
    this.requireAccess2VAR = requireAccess2VAR;
  }

  /**
   * @return the requireApplicationChange
   */
  public boolean isRequireApplicationChange() {
    return requireApplicationChange;
  }

  /**
   * @param requireApplicationChange the requireApplicationChange to set
   */
  public void setRequireApplicationChange(boolean requireApplicationChange) {
    this.requireApplicationChange = requireApplicationChange;
  }

  /**
   * @return the requireB2BVPN
   */
  public boolean isRequireB2BVPN() {
    return requireB2BVPN;
  }

  /**
   * @param requireB2BVPN the requireB2BVPN to set
   */
  public void setRequireB2BVPN(boolean requireB2BVPN) {
    this.requireB2BVPN = requireB2BVPN;
  }

  /**
   * @return the requireFirewallChange
   */
  public boolean isRequireFirewallChange() {
    return requireFirewallChange;
  }

  /**
   * @param requireFirewallChange the requireFirewallChange to set
   */
  public void setRequireFirewallChange(boolean requireFirewallChange) {
    this.requireFirewallChange = requireFirewallChange;
  }

  /**
   * @return the requireHardware
   */
  public boolean isRequireHardware() {
    return requireHardware;
  }

  /**
   * @param requireHardware the requireHardware to set
   */
  public void setRequireHardware(boolean requireHardware) {
    this.requireHardware = requireHardware;
  }

  /**
   * @return the requireIncreaseTransactions
   */
  public boolean isRequireIncreaseTransactions() {
    return requireIncreaseTransactions;
  }

  /**
   * @param requireIncreaseTransactions the requireIncreaseTransactions to set
   */
  public void setRequireIncreaseTransactions(boolean requireIncreaseTransactions) {
    this.requireIncreaseTransactions = requireIncreaseTransactions;
  }

  /**
   * @return the requireNewCircuit
   */
  public boolean isRequireNewCircuit() {
    return requireNewCircuit;
  }

  /**
   * @param requireNewCircuit the requireNewCircuit to set
   */
  public void setRequireNewCircuit(boolean requireNewCircuit) {
    this.requireNewCircuit = requireNewCircuit;
  }

  /**
   * @return the requireNewSoftware
   */
  public boolean isRequireNewSoftware() {
    return requireNewSoftware;
  }

  /**
   * @param requireNewSoftware the requireNewSoftware to set
   */
  public void setRequireNewSoftware(boolean requireNewSoftware) {
    this.requireNewSoftware = requireNewSoftware;
  }

  /**
   * @return the requireOfficeOpening
   */
  public boolean isRequireOfficeOpening() {
    return requireOfficeOpening;
  }

  /**
   * @param requireOfficeOpening the requireOfficeOpening to set
   */
  public void setRequireOfficeOpening(boolean requireOfficeOpening) {
    this.requireOfficeOpening = requireOfficeOpening;
  }

  /**
   * @return the requireReport
   */
  public boolean isRequireReport() {
    return requireReport;
  }

  /**
   * @param requireReport the requireReport to set
   */
  public void setRequireReport(boolean requireReport) {
    this.requireReport = requireReport;
  }

  /**
   * @return the requireSSL
   */
  public boolean isRequireSSL() {
    return requireSSL;
  }

  /**
   * @param requireSSL the requireSSL to set
   */
  public void setRequireSSL(boolean requireSSL) {
    this.requireSSL = requireSSL;
  }

  /**
   * @return the requireSecurityException
   */
  public boolean isRequireSecurityException() {
    return requireSecurityException;
  }

  /**
   * @param requireSecurityException the requireSecurityException to set
   */
  public void setRequireSecurityException(boolean requireSecurityException) {
    this.requireSecurityException = requireSecurityException;
  }

  /**
   * @return the requireStorage
   */
  public boolean isRequireStorage() {
    return requireStorage;
  }

  /**
   * @param requireStorage the requireStorage to set
   */
  public void setRequireStorage(boolean requireStorage) {
    this.requireStorage = requireStorage;
  }

  /**
   * @return the requireWebHosting
   */
  public boolean isRequireWebHosting() {
    return requireWebHosting;
  }

  /**
   * @param requireWebHosting the requireWebHosting to set
   */
  public void setRequireWebHosting(boolean requireWebHosting) {
    this.requireWebHosting = requireWebHosting;
  }

  @Override
  public String toString() {
    return this.getName();
  }


}
