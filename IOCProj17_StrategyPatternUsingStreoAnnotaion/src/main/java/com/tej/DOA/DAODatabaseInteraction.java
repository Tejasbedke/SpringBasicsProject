package com.tej.DOA;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tej.comps.CustomerBO;
@Repository
public class DAODatabaseInteraction implements IDOADatabaseInteraction {
	
    private static final String INSERT_CUST_DETAIL="INSERT INTO `INTERESTCALCULATOR`.`REALTIMEDI_INTERESTCALC` "
    		+ "(`CNO`, `CNAME`, `CADD`, `PAMT`, `IAMT`) VALUES (?,?,?,?,?)";
    @Autowired
	DataSource dataSource;
	
	/*
	 * public DOADatabaseInteraction() {
	 * System.out.println("DOADatabaseInteraction::1 param Constructors");
	 * this.dataSource = dataSource; }
	 */


	@Override
	public int insert(CustomerBO customer) throws Exception {
		
		try(Connection con=dataSource.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_CUST_DETAIL)){
			if(ps!=null) {
				ps.setInt(1, customer.getcNo());
				ps.setString(2,customer.getcName());
				ps.setString(3, customer.getcAdd());
				ps.setDouble(4,customer.getpAmt());
				ps.setDouble(5,customer.getiAmt());
				
				int result=ps.executeUpdate();
				 return result;
			}
			return 0;
			
		}
	     catch(SQLException e) {
		 throw e;
		}
		
	}

}
