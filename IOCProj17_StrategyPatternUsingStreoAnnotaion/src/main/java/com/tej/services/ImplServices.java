package com.tej.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tej.DOA.DAODatabaseInteraction;
import com.tej.DOA.IDOADatabaseInteraction;
import com.tej.comps.CustomerBO;
import com.tej.comps.CustomerDTO;
@Service("service")
public class ImplServices implements Iservice {

	@Autowired
	private IDOADatabaseInteraction DAO;

	
	@Override
	public String registerCustomer(CustomerDTO dto)throws Exception {
		
		//Calculationg the interest amount of principle amount
		Double interest=dto.getpAmt()*dto.getiAmt()*dto.getTime()/100.0;
		CustomerBO customer=new CustomerBO();
		
		//Setting value to customer BO class 
		customer.setcNo(dto.getcNo());
		customer.setcName(dto.getcName());
		customer.setcAdd(dto.getcAdd());
		customer.setpAmt(dto.getpAmt());
		customer.setiAmt(interest);
		
		
		//use of the service class 
         int result=DAO.insert(customer);
         
         return (result==0)?"Failed to Insertion":"Record Inserted";
        	
        			 
         }
	}


