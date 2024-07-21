package com.tej.Services;

import com.tej.jbeans.PatientDTO;

public interface IserviceBillCalculation {

	public String calculateBill(PatientDTO dto)throws Exception;
}
