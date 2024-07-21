package com.tej.Services;

import com.tej.BO.GuestBO;
import com.tej.DAO.IGuestDAO;
import com.tej.DTO.GuestDTO;

public class ImplHotelMgmtServices implements IHotelMgmtServices {

	IGuestDAO dao;
	
	public ImplHotelMgmtServices(IGuestDAO dao) {
		
		this.dao = dao;
	}

	@Override
	public String RegisterGuest(GuestDTO guest) throws Exception {
		
	    //Calculating Total bill amount
		Double billamt=guest.getPerDCharge()*guest.getNofDays();
		
		GuestBO bo=new GuestBO();
		bo.setgName(guest.getgName());
		bo.setGaddrs(guest.getGaddrs());
		bo.setNofDays(guest.getNofDays());
		bo.setPerDCharge(guest.getPerDCharge());
		bo.setBillAmt(billamt);
		
		return(dao.registerGuest(bo)==1)?"Registered Successfullly":"Invalid Registration";
	}

}
