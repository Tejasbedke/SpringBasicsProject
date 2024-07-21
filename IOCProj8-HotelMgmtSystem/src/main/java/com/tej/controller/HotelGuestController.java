package com.tej.controller;

import com.tej.DAO.IGuestDAO;
import com.tej.DTO.GuestDTO;
import com.tej.Services.IHotelMgmtServices;
import com.tej.VO.GuestVO;

public class HotelGuestController {

	IHotelMgmtServices service;

	
	
	public HotelGuestController(IHotelMgmtServices service) {
		super();
		this.service = service;
	}



	public String ValiDateRegistration(GuestVO vo) throws Exception {
		
		GuestDTO dto=new GuestDTO();
		dto.setgName(vo.getgName());
	    dto.setGaddrs(vo.getGaddrs());
	    dto.setPerDCharge(Double.parseDouble(vo.getPerDcharge()));
	    dto.setNofDays(Integer.parseInt(vo.getNofDays()));
	   
	    return service.RegisterGuest(dto);
	}
	
}
