package com.sabre.hd.easysr.entities;

import org.apache.log4j.Logger;

import com.sabre.hd.easysr.persistence.dao.ChangeRequestDAO;
import com.sabre.hd.easysr.persitence.DAOFactory;
import com.sabre.hd.easysr.persitence.PersistentObject;
import java.sql.Date;


public class ChangeRequest extends PersistentObject{
	
	private static Logger logger = Logger.getLogger(ChangeRequest.class.getName());

    /**
     * @return the logger
     */
    public static Logger getLogger() {
        return logger;
    }

    /**
     * @param aLogger the logger to set
     */
    public static void setLogger(Logger aLogger) {
        logger = aLogger;
    }
	private ChangeRequestDAO dao;

  private String phoneNumber;
  private String emailAddress;
  private String externalReferenceId;
  private String employeeId;
  private String managerId;
  private String developerVendor;
  private String sponsor;
  private String serviceRequestId;
  private String environment;
  private String implementationLocation;
  private String changeName;
  private String assets;
  private String description;
  private String potentialCustomersImpacted;
  private String associatedProblem;
  private String componentType;
  private String activity;
  private String priority;
  private String currentStatus;
  private String riskReason;
  private String state;
  private String changeCategory;
  private String changeJustification;
  private String HSIS;
  private String ECO;
  private String LMR;
  private String other;
  private String requestedType;
  private String impactDescription;
  private String customerImpact;
  private String installationProcedures;
  private String fallbackProcedures;

  private String primaryCoordinatorName;
  private String primaryEmailAddress;
  private String secondaryName;
  private String secondaryEmailAddress;
  private String installerId;
  private String businessUnitDirector;
  private String budEmailAddress;
  private String coverageName;
  private String coverageEmailAddress;
  private String funcationalAreaLead;
  private String falEmailAddress;

  private String primaryPhoneNumber;
  private String secondaryPhoneNumber;
  private String budPhoneNumber;
  private String coveragePhoneNumber;
  private String coveragePagerNumber;
  private String falPhoneNumber;

  private Date startDate;
  private Date startTime;
  private Date endDate;
  private Date endTime;
  private Date duration;

  private boolean changeRelatesToFirewall;
  private boolean emergencyChange;
  private boolean affectsMultilpeCustomers;
  private boolean newActivity;
  private boolean moreThanOneTechnicalTeamRequired;
  private boolean affectsCriticalHardware;
  private boolean significantChange;
  private boolean asap;
  private boolean endTimeDefault; // El campo se llama default, en realidad. No puedo usar 'default' como palabra.

  private int  potentialImpact;
  private int  potentialRisk;



  public static boolean save() {
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public ChangeRequest(){
  }

  public static void launchCRCreation() {
//    EcpmNewChange f1 = new EcpmNewChange();
//      try {
//        f1.load();
//        f1.run();
//        f1.finish();
//      } catch (Exception ex) {
//        Logger.getLogger(EasySRMain.class.getName()).log(Level.ERROR, null, ex);
//      }
  }
	
    public ChangeRequestDAO getDao() {
		if(this.dao == null){
			this.dao = (ChangeRequestDAO)DAOFactory.getDAO(ChangeRequest.class.getName());
		}
		return dao;
    }

    public void setDao(ChangeRequestDAO dao) {
    		this.dao = dao;
    }

    public static ChangeRequestDAO getDaoStatic(){
		return (ChangeRequestDAO)DAOFactory.getDAO(ChangeRequest.class.getName());
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
    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the externalReferenceId
     */
    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    /**
     * @param externalReferenceId the externalReferenceId to set
     */
    public void setExternalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
    }

    /**
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the managerId
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * @param managerId the managerId to set
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    /**
     * @return the developerVendor
     */
    public String getDeveloperVendor() {
        return developerVendor;
    }

    /**
     * @param developerVendor the developerVendor to set
     */
    public void setDeveloperVendor(String developerVendor) {
        this.developerVendor = developerVendor;
    }

    /**
     * @return the sponsor
     */
    public String getSponsor() {
        return sponsor;
    }

    /**
     * @param sponsor the sponsor to set
     */
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    /**
     * @return the serviceRequestId
     */
    public String getServiceRequestId() {
        return serviceRequestId;
    }

    /**
     * @param serviceRequestId the serviceRequestId to set
     */
    public void setServiceRequestId(String serviceRequestId) {
        this.serviceRequestId = serviceRequestId;
    }

    /**
     * @return the environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * @param environment the environment to set
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * @return the implementationLocation
     */
    public String getImplementationLocation() {
        return implementationLocation;
    }

    /**
     * @param implementationLocation the implementationLocation to set
     */
    public void setImplementationLocation(String implementationLocation) {
        this.implementationLocation = implementationLocation;
    }

    /**
     * @return the changeName
     */
    public String getChangeName() {
        return changeName;
    }

    /**
     * @param changeName the changeName to set
     */
    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }

    /**
     * @return the assets
     */
    public String getAssets() {
        return assets;
    }

    /**
     * @param assets the assets to set
     */
    public void setAssets(String assets) {
        this.assets = assets;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the potentialCustomersImpacted
     */
    public String getPotentialCustomersImpacted() {
        return potentialCustomersImpacted;
    }

    /**
     * @param potentialCustomersImpacted the potentialCustomersImpacted to set
     */
    public void setPotentialCustomersImpacted(String potentialCustomersImpacted) {
        this.potentialCustomersImpacted = potentialCustomersImpacted;
    }

    /**
     * @return the associatedProblem
     */
    public String getAssociatedProblem() {
        return associatedProblem;
    }

    /**
     * @param associatedProblem the associatedProblem to set
     */
    public void setAssociatedProblem(String associatedProblem) {
        this.associatedProblem = associatedProblem;
    }

    /**
     * @return the componentType
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * @param componentType the componentType to set
     */
    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * @return the activity
     */
    public String getActivity() {
        return activity;
    }

    /**
     * @param activity the activity to set
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * @return the currentStatus
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * @param currentStatus the currentStatus to set
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * @return the riskReason
     */
    public String getRiskReason() {
        return riskReason;
    }

    /**
     * @param riskReason the riskReason to set
     */
    public void setRiskReason(String riskReason) {
        this.riskReason = riskReason;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the changeCategory
     */
    public String getChangeCategory() {
        return changeCategory;
    }

    /**
     * @param changeCategory the changeCategory to set
     */
    public void setChangeCategory(String changeCategory) {
        this.changeCategory = changeCategory;
    }

    /**
     * @return the changeJustification
     */
    public String getChangeJustification() {
        return changeJustification;
    }

    /**
     * @param changeJustification the changeJustification to set
     */
    public void setChangeJustification(String changeJustification) {
        this.changeJustification = changeJustification;
    }

    /**
     * @return the HSIS
     */
    public String getHSIS() {
        return HSIS;
    }

    /**
     * @param HSIS the HSIS to set
     */
    public void setHSIS(String HSIS) {
        this.HSIS = HSIS;
    }

    /**
     * @return the ECO
     */
    public String getECO() {
        return ECO;
    }

    /**
     * @param ECO the ECO to set
     */
    public void setECO(String ECO) {
        this.ECO = ECO;
    }

    /**
     * @return the LMR
     */
    public String getLMR() {
        return LMR;
    }

    /**
     * @param LMR the LMR to set
     */
    public void setLMR(String LMR) {
        this.LMR = LMR;
    }

    /**
     * @return the other
     */
    public String getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * @return the requestedType
     */
    public String getRequestedType() {
        return requestedType;
    }

    /**
     * @param requestedType the requestedType to set
     */
    public void setRequestedType(String requestedType) {
        this.requestedType = requestedType;
    }

    /**
     * @return the impactDescription
     */
    public String getImpactDescription() {
        return impactDescription;
    }

    /**
     * @param impactDescription the impactDescription to set
     */
    public void setImpactDescription(String impactDescription) {
        this.impactDescription = impactDescription;
    }

    /**
     * @return the customerImpact
     */
    public String getCustomerImpact() {
        return customerImpact;
    }

    /**
     * @param customerImpact the customerImpact to set
     */
    public void setCustomerImpact(String customerImpact) {
        this.customerImpact = customerImpact;
    }

    /**
     * @return the installationProcedures
     */
    public String getInstallationProcedures() {
        return installationProcedures;
    }

    /**
     * @param installationProcedures the installationProcedures to set
     */
    public void setInstallationProcedures(String installationProcedures) {
        this.installationProcedures = installationProcedures;
    }

    /**
     * @return the fallbackProcedures
     */
    public String getFallbackProcedures() {
        return fallbackProcedures;
    }

    /**
     * @param fallbackProcedures the fallbackProcedures to set
     */
    public void setFallbackProcedures(String fallbackProcedures) {
        this.fallbackProcedures = fallbackProcedures;
    }

    /**
     * @return the primaryCoordinatorName
     */
    public String getPrimaryCoordinatorName() {
        return primaryCoordinatorName;
    }

    /**
     * @param primaryCoordinatorName the primaryCoordinatorName to set
     */
    public void setPrimaryCoordinatorName(String primaryCoordinatorName) {
        this.primaryCoordinatorName = primaryCoordinatorName;
    }

    /**
     * @return the primaryEmailAddress
     */
    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    /**
     * @param primaryEmailAddress the primaryEmailAddress to set
     */
    public void setPrimaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
    }

    /**
     * @return the secondaryName
     */
    public String getSecondaryName() {
        return secondaryName;
    }

    /**
     * @param secondaryName the secondaryName to set
     */
    public void setSecondaryName(String secondaryName) {
        this.secondaryName = secondaryName;
    }

    /**
     * @return the secondaryEmailAddress
     */
    public String getSecondaryEmailAddress() {
        return secondaryEmailAddress;
    }

    /**
     * @param secondaryEmailAddress the secondaryEmailAddress to set
     */
    public void setSecondaryEmailAddress(String secondaryEmailAddress) {
        this.secondaryEmailAddress = secondaryEmailAddress;
    }

    /**
     * @return the installerId
     */
    public String getInstallerId() {
        return installerId;
    }

    /**
     * @param installerId the installerId to set
     */
    public void setInstallerId(String installerId) {
        this.installerId = installerId;
    }

    /**
     * @return the businessUnitDirector
     */
    public String getBusinessUnitDirector() {
        return businessUnitDirector;
    }

    /**
     * @param businessUnitDirector the businessUnitDirector to set
     */
    public void setBusinessUnitDirector(String businessUnitDirector) {
        this.businessUnitDirector = businessUnitDirector;
    }

    /**
     * @return the budEmailAddress
     */
    public String getBudEmailAddress() {
        return budEmailAddress;
    }

    /**
     * @param budEmailAddress the budEmailAddress to set
     */
    public void setBudEmailAddress(String budEmailAddress) {
        this.budEmailAddress = budEmailAddress;
    }

    /**
     * @return the coverageName
     */
    public String getCoverageName() {
        return coverageName;
    }

    /**
     * @param coverageName the coverageName to set
     */
    public void setCoverageName(String coverageName) {
        this.coverageName = coverageName;
    }

    /**
     * @return the coverageEmailAddress
     */
    public String getCoverageEmailAddress() {
        return coverageEmailAddress;
    }

    /**
     * @param coverageEmailAddress the coverageEmailAddress to set
     */
    public void setCoverageEmailAddress(String coverageEmailAddress) {
        this.coverageEmailAddress = coverageEmailAddress;
    }

    /**
     * @return the funcationalAreaLead
     */
    public String getFuncationalAreaLead() {
        return funcationalAreaLead;
    }

    /**
     * @param funcationalAreaLead the funcationalAreaLead to set
     */
    public void setFuncationalAreaLead(String funcationalAreaLead) {
        this.funcationalAreaLead = funcationalAreaLead;
    }

    /**
     * @return the falEmailAddress
     */
    public String getFalEmailAddress() {
        return falEmailAddress;
    }

    /**
     * @param falEmailAddress the falEmailAddress to set
     */
    public void setFalEmailAddress(String falEmailAddress) {
        this.falEmailAddress = falEmailAddress;
    }

    /**
     * @return the primaryPhoneNumber
     */
    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * @param primaryPhoneNumber the primaryPhoneNumber to set
     */
    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    /**
     * @return the secondaryPhoneNumber
     */
    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    /**
     * @param secondaryPhoneNumber the secondaryPhoneNumber to set
     */
    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    /**
     * @return the budPhoneNumber
     */
    public String getBudPhoneNumber() {
        return budPhoneNumber;
    }

    /**
     * @param budPhoneNumber the budPhoneNumber to set
     */
    public void setBudPhoneNumber(String budPhoneNumber) {
        this.budPhoneNumber = budPhoneNumber;
    }

    /**
     * @return the coveragePhoneNumber
     */
    public String getCoveragePhoneNumber() {
        return coveragePhoneNumber;
    }

    /**
     * @param coveragePhoneNumber the coveragePhoneNumber to set
     */
    public void setCoveragePhoneNumber(String coveragePhoneNumber) {
        this.coveragePhoneNumber = coveragePhoneNumber;
    }

    /**
     * @return the coveragePagerNumber
     */
    public String getCoveragePagerNumber() {
        return coveragePagerNumber;
    }

    /**
     * @param coveragePagerNumber the coveragePagerNumber to set
     */
    public void setCoveragePagerNumber(String coveragePagerNumber) {
        this.coveragePagerNumber = coveragePagerNumber;
    }

    /**
     * @return the falPhoneNumber
     */
    public String getFalPhoneNumber() {
        return falPhoneNumber;
    }

    /**
     * @param falPhoneNumber the falPhoneNumber to set
     */
    public void setFalPhoneNumber(String falPhoneNumber) {
        this.falPhoneNumber = falPhoneNumber;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the duration
     */
    public Date getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Date duration) {
        this.duration = duration;
    }

    /**
     * @return the changeRelatesToFirewall
     */
    public boolean isChangeRelatesToFirewall() {
        return changeRelatesToFirewall;
    }

    /**
     * @param changeRelatesToFirewall the changeRelatesToFirewall to set
     */
    public void setChangeRelatesToFirewall(boolean changeRelatesToFirewall) {
        this.changeRelatesToFirewall = changeRelatesToFirewall;
    }

    /**
     * @return the emergencyChange
     */
    public boolean isEmergencyChange() {
        return emergencyChange;
    }

    /**
     * @param emergencyChange the emergencyChange to set
     */
    public void setEmergencyChange(boolean emergencyChange) {
        this.emergencyChange = emergencyChange;
    }

    /**
     * @return the affectsMultilpeCustomers
     */
    public boolean isAffectsMultilpeCustomers() {
        return affectsMultilpeCustomers;
    }

    /**
     * @param affectsMultilpeCustomers the affectsMultilpeCustomers to set
     */
    public void setAffectsMultilpeCustomers(boolean affectsMultilpeCustomers) {
        this.affectsMultilpeCustomers = affectsMultilpeCustomers;
    }

    /**
     * @return the newActivity
     */
    public boolean isNewActivity() {
        return newActivity;
    }

    /**
     * @param newActivity the newActivity to set
     */
    public void setNewActivity(boolean newActivity) {
        this.newActivity = newActivity;
    }

    /**
     * @return the moreThanOneTechnicalTeamRequired
     */
    public boolean isMoreThanOneTechnicalTeamRequired() {
        return moreThanOneTechnicalTeamRequired;
    }

    /**
     * @param moreThanOneTechnicalTeamRequired the moreThanOneTechnicalTeamRequired to set
     */
    public void setMoreThanOneTechnicalTeamRequired(boolean moreThanOneTechnicalTeamRequired) {
        this.moreThanOneTechnicalTeamRequired = moreThanOneTechnicalTeamRequired;
    }

    /**
     * @return the affectsCriticalHardware
     */
    public boolean isAffectsCriticalHardware() {
        return affectsCriticalHardware;
    }

    /**
     * @param affectsCriticalHardware the affectsCriticalHardware to set
     */
    public void setAffectsCriticalHardware(boolean affectsCriticalHardware) {
        this.affectsCriticalHardware = affectsCriticalHardware;
    }

    /**
     * @return the significantChange
     */
    public boolean isSignificantChange() {
        return significantChange;
    }

    /**
     * @param significantChange the significantChange to set
     */
    public void setSignificantChange(boolean significantChange) {
        this.significantChange = significantChange;
    }

    /**
     * @return the asap
     */
    public boolean isAsap() {
        return asap;
    }

    /**
     * @param asap the asap to set
     */
    public void setAsap(boolean asap) {
        this.asap = asap;
    }

    /**
     * @return the endTimeDefault
     */
    public boolean isEndTimeDefault() {
        return endTimeDefault;
    }

    /**
     * @param endTimeDefault the endTimeDefault to set
     */
    public void setEndTimeDefault(boolean endTimeDefault) {
        this.endTimeDefault = endTimeDefault;
    }

    /**
     * @return the potentialImpact
     */
    public int getPotentialImpact() {
        return potentialImpact;
    }

    /**
     * @param potentialImpact the potentialImpact to set
     */
    public void setPotentialImpact(int potentialImpact) {
        this.potentialImpact = potentialImpact;
    }

    /**
     * @return the potentialRisk
     */
    public int getPotentialRisk() {
        return potentialRisk;
    }

    /**
     * @param potentialRisk the potentialRisk to set
     */
    public void setPotentialRisk(int potentialRisk) {
        this.potentialRisk = potentialRisk;
    }

}
