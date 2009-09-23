package com.sabre.hd.easysr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

import com.sabre.hd.easysr.dao.exceptions.ServiceRequestNotFoundException;
import com.sabre.hd.easysr.dao.exceptions.DAORuntimeException;
import com.sabre.hd.easysr.entities.ServiceRequest;
import com.sabre.hd.easysr.persistence.dao.ServiceRequestDAO;
import com.sabre.hd.easysr.persitence.*;

public class ServiceRequestDAOImpl implements ServiceRequestDAO {

	private static Logger logger = Logger.getLogger(ServiceRequestDAOImpl.class
			.getName());
	private static final String TABLE_NAME = "forms_template";


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
			sbDelete.append(ServiceRequestDAOImpl.TABLE_NAME);
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
		ResultSet rs = null;
		PreparedStatement stmtSelect = null;

		try {
			StringBuffer sbSelect = new StringBuffer();

			sbSelect.append("SELECT * FROM ");
			sbSelect.append(ServiceRequestDAOImpl.TABLE_NAME);
			sbSelect.append(" WHERE form_id = ?");

			stmtSelect = conn.prepareStatement(sbSelect.toString());

			stmtSelect.setString(1, pk);

			rs = stmtSelect.executeQuery();
			if (rs.next()) {
				
      //TODO: Remplazar con constructor adecuado
//      result = new ServiceRequest(
//              rs.getString("attrName1"),
//              rs.getString("attrName2"),
//              rs.getDate("attrName3")   );

				
			} else {
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

	@Override
	public void insertServiceRequest(ServiceRequest servicerequest) {

		PreparedStatement stmtInsert = null;

		Connection conn = DataSource.getConnection();

		try {
			StringBuffer sbInsert = new StringBuffer();
			sbInsert.append("INSERT INTO ");
			sbInsert.append(ServiceRequestDAOImpl.TABLE_NAME);
			
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
			sbUpdate.append(ServiceRequestDAOImpl.TABLE_NAME);
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
			sbSelect.append(ServiceRequestDAOImpl.TABLE_NAME);

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
