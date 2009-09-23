package com.sabre.hd.easysr.entities;

import org.apache.log4j.Logger;

import com.sabre.hd.easysr.persistence.dao.ChangeRequestDAO;
import com.sabre.hd.easysr.persitence.DAOFactory;
import com.sabre.hd.easysr.persitence.PersistentObject;
import java.sql.Date;


public class ChangeRequest extends PersistentObject{
	
	private static Logger logger = Logger.getLogger(ChangeRequest.class.getName());
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
  private String requestedType;
  private Date   implDate;
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
    throw new UnsupportedOperationException("Not yet implemented");
  }

  
	public ChangeRequest()
	{
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
   * @return the requestTitle
   */
        /*
  public String getRequestTitle() {
    return requestTitle;
  } */


}
