package com.tej.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.tej.BO.GuestBO;

public class ImplGuestDAO implements IGuestDAO {

	private final String INSERT_TABLE_QUERY="INSERT INTO `hotelmgmtdatabase`.`hotelguestrecord` "
			+ "(`GuestName`, `Gaddrs`, `PerDayCharge`, `Days`, `BillAmt`) VALUES (?,?,?,?,?)";
	DataSource ds;
	
	
	public ImplGuestDAO(DataSource ds) {
	
		this.ds = ds;
	}


	@Override
	public int registerGuest(GuestBO guest) throws Exception {
		
		
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_TABLE_QUERY);){
			ps.setString(1,guest.getgName());
			ps.setString(2,guest.getGaddrs());
			ps.setDouble(3,guest.getPerDCharge());
			ps.setInt(4,guest.getNofDays());
			ps.setDouble(5,guest.getBillAmt());
			
		    return ps.executeUpdate();
		}
	
	}

}
