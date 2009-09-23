package com.sabre.hd.easysr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.sabre.hd.easysr.dao.exceptions.ServiceRequestNotFoundException;
import com.sabre.hd.easysr.dao.exceptions.DAORuntimeException;
import com.sabre.hd.easysr.entities.ServiceRequest;
import com.sabre.hd.easysr.persistence.dao.ServiceRequestDAO;
import com.sabre.hd.easysr.persitence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;

public class ServiceRequestDAOImpl implements ServiceRequestDAO {

	private static Logger logger = Logger.getLogger(ServiceRequestDAOImpl.class
			.getName());
	private static final String TABLE_NAME_FORM = "forms_template";
        private static final String TABLE_NAME_FORM_FIELDS = "form_fields_template";


	@Override
	public void deleteServiceRequest(String id) throws ServiceRequestNotFoundException {
		if (id == null) {
			logger.error("id parameter must be set!");
			throw new DAORuntimeException("id parameter must be set!");
		}

		Connection conn = DataSource.getConnection();

		PreparedStatement stmtDelete = null;

		try {
			StringBuffer sbDelete = new StringBuffer();

			sbDelete.append("DELETE FROM ");
			sbDelete.append(ServiceRequestDAOImpl.TABLE_NAME_FORM);
			sbDelete.append(" WHERE servicerequest_id = ?");

			stmtDelete = conn.prepareStatement(sbDelete.toString());

			stmtDelete.setString(1, id);

			int rows = stmtDelete.executeUpdate();

			if (rows != 1) {
				throw new SQLException("executeUpdate return value: " + rows);
			}

		} catch (SQLException ex) {
			logger.error(ex);
			throw new DAORuntimeException(ex);
		} finally {
			DBUtil.closeStatement(stmtDelete);
			DBUtil.closeJDBCConnection(conn);
		}
	}

	@Override
	public ServiceRequest findServiceRequestByPK(String pk) throws ServiceRequestNotFoundException {
		if (pk == null || pk.trim().equals("")) {
			logger.error("ServiceRequest PK is required!");
			throw new DAORuntimeException("ServiceRequest PK is required!");
		}

		Connection conn = DataSource.getConnection();

		ServiceRequest result = null;
		ResultSet rsForm = null;
		PreparedStatement stmtSelect = null;

		try {
			StringBuffer sbSelect = new StringBuffer();

			sbSelect.append("SELECT * FROM ");
			sbSelect.append(ServiceRequestDAOImpl.TABLE_NAME_FORM);
			sbSelect.append(" WHERE form_id = ?");

			stmtSelect = conn.prepareStatement(sbSelect.toString());

			stmtSelect.setString(1, pk);

			rsForm = stmtSelect.executeQuery();

			if (rsForm.next()) {
                            ResultSet rsForm_fields = null;
                            PreparedStatement stmtSelect_fields = null;
                            StringBuffer sbSelect_fields = new StringBuffer();
                            sbSelect_fields.append("SELECT * FROM ");
                            sbSelect_fields.append(ServiceRequestDAOImpl.TABLE_NAME_FORM_FIELDS);
                            sbSelect_fields.append(" WHERE form_id = ?");
                            stmtSelect_fields = conn.prepareStatement(sbSelect_fields.toString());
                            stmtSelect_fields.setString(1, pk);
                            rsForm_fields = stmtSelect_fields.executeQuery();
           
                                while (rsForm_fields.next()) {
				rsForm_fields.getString("Valor");
                                Hashtable ht = new Hashtable();
                                ht.put(rsForm_fields.getString("Name"), rsForm_fields.getString("Value"));



                                result.setUrl(ht.get("url").toString());
                                result.setName(ht.get("name").toString());
                                result.setRequestTitle(ht.get("requestTitle").toString());
                                result.setRequestOverview(ht.get("requestOverview").toString());
                                result.setBusinessUnit(ht.get("businessUnit").toString());
                                result.setSystem(ht.get("system").toString());
                                result.setPrimaveraId(ht.get("primaveraId").toString());
                                result.setFRCR(ht.get("FRCR").toString());
                                result.setSEDI(ht.get("SEDI").toString());
                                result.setSabreAR(ht.get("sabreAR").toString());
                                result.setSabrePR(ht.get("sabrePR").toString());
                                result.setOwningCostCenter(ht.get("owningCostCenter").toString());
                                result.setFundingCostCenter(ht.get("fundingCostCenter").toString());
                                result.setRequestor(ht.get("requestor").toString());
                                result.setVP(ht.get("VP").toString());
                                result.setRequirements(ht.get("requirements").toString());
                                result.setImplDate( ht.get("implDate").toString() );
                                result.setCRUDActiveDirectory( (Boolean) ht.get("CRUDActiveDirectory"));
                                result.setEDSAlreadyEngaged( (Boolean) ht.get("EDSAlreadyEngaged"));
                                result.setImpactHost( (Boolean) ht.get("impactHost"));
                                result.setImplDateASAP( (Boolean) ht.get("implDateASAP"));
                                result.setInvolvePCI( (Boolean) ht.get("involvePCI"));
                                result.setRequestorLoggedUser( (Boolean) ht.get("requestorLoggedUser"));
                                result.setRequireAccess2VAR((Boolean)ht.get("requireAccess2VAR"));
                                result.setRequireApplicationChange( (Boolean) ht.get("requireApplicationChange"));
                                result.setRequireB2BVPN( (Boolean) ht.get("requireB2BVPN"));
                                result.setRequireFirewallChange( (Boolean) ht.get("requireFirewallChange"));
                                result.setRequireHardware( (Boolean) ht.get("requireHardware"));
                                result.setRequireIncreaseTransactions( (Boolean) ht.get("requireIncreaseTransactions"));
                                result.setRequireNewCircuit( (Boolean) ht.get("requireNewCircuit"));
                                result.setRequireNewSoftware( (Boolean) ht.get("requireNewSoftware"));
                                result.setRequireOfficeOpening( (Boolean) ht.get("requireOfficeOpening"));
                                result.setRequireReport( (Boolean) ht.get("requireReport"));
                                result.setRequireSSL( (Boolean) ht.get("requireSSL"));
                                result.setRequireSecurityException( (Boolean) ht.get("requireSecurityException"));
                                result.setRequireStorage( (Boolean) ht.get("requireStorage"));
                                result.setRequireWebHosting( (Boolean) ht.get("requireWebHosting"));
                                }
				
			} else {
				throw new ServiceRequestNotFoundException();
                                }
                }
		 catch (SQLException ex) {
			logger.error(ex);
			throw new DAORuntimeException(ex);
		} finally {
			DBUtil.closeStatement(stmtSelect);
			DBUtil.closeResultSet(rsForm);
			DBUtil.closeJDBCConnection(conn);
		}
		return result;
        }
	

	@Override
	public void insertServiceRequest(ServiceRequest servicerequest) {

		PreparedStatement stmtInsert = null;

		Connection conn = DataSource.getConnection();

		try {
			StringBuffer sbInsert = new StringBuffer();
			sbInsert.append("INSERT INTO ");
			sbInsert.append(ServiceRequestDAOImpl.TABLE_NAME_FORM);
			
			//TODO: Modificar los attr para hacer el insert
			
			sbInsert.append(" ( servicerequest_id, attrName1, attrName2 ) ");
			sbInsert.append(" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			stmtInsert = conn.prepareStatement(sbInsert.toString());

			//stmtInsert.setString(1, servicerequest.getAttName1());
			//stmtInsert.setString(2, servicerequest.getAttName2());
			//stmtInsert.setString(3, servicerequest.getAttName3());
			//stmtInsert.setString(4, servicerequest.getAttName4());			
			//);

			logger.info("About to execute INSERT: values "
					+ servicerequest.toString());

			int rows = stmtInsert.executeUpdate();

			if (rows != 1) {
				throw new SQLException("executeUpdate return value: " + rows);
			}

		} catch (SQLException ex) {
			logger.error(ex);
			throw new DAORuntimeException(ex);
		} finally {
			DBUtil.closeStatement(stmtInsert);
			DBUtil.closeJDBCConnection(conn);
		}

	}

	@Override
	public void updateServiceRequest(ServiceRequest activity) {

		Connection conn = DataSource.getConnection();

		PreparedStatement stmtUpdate = null;

		try {
			StringBuffer sbUpdate = new StringBuffer();

			sbUpdate.append("UPDATE ");
			sbUpdate.append(ServiceRequestDAOImpl.TABLE_NAME_FORM);
			sbUpdate.append(" SET ");

			//TODO; Remplazar con SR attrs.
			//sbUpdate.append(" AttrName1 = ?, ");
			//sbUpdate.append(" AttrName2 = ? ");
			//sbUpdate.append(" AttrName3 = ?, ");

			
			sbUpdate.append(" WHERE servicerequest_id = ?");
			stmtUpdate = conn.prepareStatement(sbUpdate.toString());

			//TODO: Remplazar por attr del Service Request 
			//stmtUpdate.setString(1, servicerequest.getAttrName1());
			//stmtUpdate.setString(2, servicerequest.getAttrName2());
			//stmtUpdate.setString(3, servicerequest.getAttrName3());
			//stmtUpdate.setString(4, servicerequest.getAttrName4());

			int rows = stmtUpdate.executeUpdate();

			if (rows != 1) {
				throw new SQLException("executeUpdate return value: " + rows);
			}

		} catch (SQLException ex) {
			throw new DAORuntimeException(ex);
		} finally {
			DBUtil.closeStatement(stmtUpdate);
			DBUtil.closeJDBCConnection(conn);
		}
	}

	@Override
	public Collection<ServiceRequest> findAll() throws ServiceRequestNotFoundException {

		Connection conn = DataSource.getConnection();

		Collection<ServiceRequest> result = new ArrayList<ServiceRequest>();

		ResultSet rs = null;
		PreparedStatement stmtSelect = null;

		try {
			StringBuffer sbSelect = new StringBuffer();

			sbSelect.append("SELECT * FROM ");
			sbSelect.append(ServiceRequestDAOImpl.TABLE_NAME_FORM);

			stmtSelect = conn.prepareStatement(sbSelect.toString());
			rs = stmtSelect.executeQuery();
//			while (rs.next()) {
//				//TODO: Remplazar con constructor adecuado				/*ServiceRequest servicerequest = new ServiceRequest(rs.getString("AttrName1"),
//				rs.getDate("AttrName2"));
//				result.add(servicerequest); */
//			}
			if (result.isEmpty()) {
				logger.info("No service requests were found...");
				throw new ServiceRequestNotFoundException();
			}
		} catch (SQLException ex) {
			logger.error(ex);
			throw new DAORuntimeException(ex);
		} finally {
			DBUtil.closeStatement(stmtSelect);
			DBUtil.closeResultSet(rs);
			DBUtil.closeJDBCConnection(conn);
		}
		return result;
	}

}
