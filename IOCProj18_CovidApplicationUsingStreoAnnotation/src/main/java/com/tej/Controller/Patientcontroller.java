package com.tej.Controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.tej.Services.ImplServiceBillCalculator;
import com.tej.jbeans.PatientDTO;
import com.tej.jbeans.PatientVO;

@Controller("controller")
public class Patientcontroller {

	
	@Autowired
	@Qualifier("service")
	ImplServiceBillCalculator service;

	public String verifyDate(PatientVO vo)throws Exception {
		
		PatientDTO dto=new PatientDTO();
		dto.setPname(vo.getPname());
		dto.setPaddrs(vo.getPaddrs());
		dto.setAddmitDate(Date.valueOf(vo.getAddmitDate()));
		dto.setLeaveDate(Date.valueOf(vo.getLeaveDate()));
		System.out.println("Patientcontroller.verifyDate()");
		return service.calculateBill(dto);
	}
}
