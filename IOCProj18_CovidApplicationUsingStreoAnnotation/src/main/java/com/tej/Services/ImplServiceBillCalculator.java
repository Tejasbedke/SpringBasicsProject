package com.tej.Services;

import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tej.DAO.ImplDAORegister;
import com.tej.jbeans.PatientBO;
import com.tej.jbeans.PatientDTO;

@Service("service")
public class ImplServiceBillCalculator implements IserviceBillCalculation {

	
	public ImplServiceBillCalculator() {
         System.out.println("ImplServiceBillCalculator::0 param constructor");
	}
	@Autowired
	ImplDAORegister dao;
	@Override
	public String calculateBill(PatientDTO dto) throws Exception {
		System.out.println("ImplServiceBillCalculator.calculateBill()");
		float bill=ChronoUnit.DAYS.between(dto.getAddmitDate().toLocalDate(),dto.getLeaveDate().toLocalDate())*900;
		
		PatientBO bo=new PatientBO();
		bo.setPname(dto.getPname());
		bo.setPaddrs(dto.getPaddrs());
		bo.setAddmitDate(dto.getAddmitDate());
		bo.setLeaveDate(dto.getLeaveDate());
		bo.setBill(bill);
		
		return (dao.registerPatient(bo)==1)?"Successfully Registered":"Not Registered";
	}

}
