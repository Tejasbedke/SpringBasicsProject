package com.tej.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tej.jbeans.PatientBO;
@Repository("dao")
public  class ImplDAORegister implements IDAORegisterpatient {

	private static final String INSERT_PATIENT_QUERY="INSERT INTO COVIDPATIENT (PNAME,PADDRS,ADDMITDATE,LEAVEDATE,BILL)VALUES(?,?,?,?,?)";
	@Autowired
	DataSource datasource;
	@Override
	public int registerPatient(PatientBO pbo)throws Exception {
		
		try(Connection con=datasource.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_PATIENT_QUERY);){
			
			if(ps!=null) {
			ps.setString(1,pbo.getPname());
			ps.setString(2, pbo.getPaddrs());
			ps.setDate(3,pbo.getAddmitDate());
			ps.setDate(4,pbo.getLeaveDate());
			ps.setFloat(5,pbo.getBill());
			
			return ps.executeUpdate();
			}
			
			}catch(Exception e) {
			//e.printStackTrace();
	        throw e;	  
	       
		}
		return 0;
	}

}
