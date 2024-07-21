package com.tej.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tej.Controller.Patientcontroller;
import com.tej.jbeans.PatientVO;

public class EnduserInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		
		Scanner scn=new Scanner(System.in);
		PatientVO vo=new PatientVO();
		if(scn!=null) {
			
			System.out.println("Enter the patient name::");
			vo.setPname(scn.next());
			System.out.println("Enter the Patient Addrs::");
			vo.setPaddrs(scn.next());
			System.out.println("Enter the patient Addmit Date (yyyy-mm-dd)::");
			vo.setAddmitDate(scn.next());
	        System.out.println("Enter the patient leave Date(yyyy-mm-dd)::");
	        vo.setLeaveDate(scn.next());
			
	        Patientcontroller controller=ctx.getBean("controller",Patientcontroller.class);
	        
	        try {
	        	System.out.println(controller.verifyDate(vo));
	        }catch(Exception e) {
	        	System.out.println("Exception raised");
	        	e.printStackTrace();
	        }
		}
	}

}
