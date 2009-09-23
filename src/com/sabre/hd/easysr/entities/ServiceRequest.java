package com.sabre.hd.easysr.entities;

import org.apache.log4j.Logger;

import com.sabre.hd.easysr.persistence.dao.ServiceRequestDAO;
import com.sabre.hd.easysr.persitence.DAOFactory;
import com.sabre.hd.easysr.persitence.PersistentObject;


public class ServiceRequest extends PersistentObject{
	
	private static Logger logger = Logger.getLogger(ServiceRequest.class.getName());
	private ServiceRequestDAO dao;
	
	// TODO: incluir propiedades del Service Request aqui.
	
	// TODO: Incluir constructor pasandole propiedades
	//public ServiceRequest(attr1,attr2)
	//{	
	//}
	
	
	public ServiceRequest()
	{
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
}
