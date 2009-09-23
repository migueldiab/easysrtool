package com.sabre.hd.easysr.persistence.dao;

import java.util.Collection;

import com.sabre.hd.easysr.dao.exceptions.ServiceRequestNotFoundException;
import com.sabre.hd.easysr.entities.ServiceRequest;

public interface ServiceRequestDAO {
  public ServiceRequest findServiceRequestByPK(String pk) throws ServiceRequestNotFoundException;
  public Collection<ServiceRequest> findAll() throws ServiceRequestNotFoundException;
  public void insertServiceRequest(ServiceRequest servicerequest);
  public void updateServiceRequest(ServiceRequest servicerequest) throws ServiceRequestNotFoundException;
  public void deleteServiceRequest(String pk) throws ServiceRequestNotFoundException;
}
