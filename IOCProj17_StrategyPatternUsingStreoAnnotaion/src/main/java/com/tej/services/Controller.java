package com.tej.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.tej.comps.CustomerDTO;
import com.tej.comps.CustomerVO;
@org.springframework.stereotype.Controller("controller")
public class Controller {
	@Autowired
	Iservice service;
	
	
	
	public String validateCustomer(CustomerVO vo) throws Exception {
		
		CustomerDTO dto=new CustomerDTO();
		dto.setcNo(Integer.parseInt(vo.getcNo()));
		dto.setcName(vo.getcName());
		dto.setcAdd(vo.getcAdd());
		dto.setpAmt(Double.parseDouble(vo.getpAmt()));
		dto.setiAmt(Double.parseDouble(vo.getiAmt()));
		dto.setTime(Integer.parseInt(vo.getTime()));
		
		//use of the Service class
		
		return service.registerCustomer(dto);
		
	}

}
