package com.sabre.hd.easysr.persistence.dao;

import java.util.Collection;

import com.sabre.hd.easysr.dao.exceptions.ChangeRequestNotFoundException;
import com.sabre.hd.easysr.entities.ChangeRequest;

public interface ChangeRequestDAO {
  public ChangeRequest findChangeRequestByPK(String pk) throws ChangeRequestNotFoundException;
  public Collection<ChangeRequest> findAll() throws ChangeRequestNotFoundException;
  public void insertChangeRequest(ChangeRequest servicerequest);
  public void updateChangeRequest(ChangeRequest servicerequest) throws ChangeRequestNotFoundException;
  public void deleteChangeRequest(String pk) throws ChangeRequestNotFoundException;
}
