package com.tej.main;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tej.comps.CustomerVO;
import com.tej.services.Controller;

public class EndUserInteraction {

	public static void main(String[] args) {
		
	    ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");

		Scanner scn=new Scanner(System.in);
		
		CustomerVO customer=new CustomerVO();
		System.out.println("Enter customer no::");
		customer.setcNo(scn.nextLine());
		
		System.out.println("Enter customer name::");
		customer.setcName(scn.nextLine());
		
		System.out.println("Enter customer Address::");
		customer.setcAdd(scn.nextLine());
		
		System.out.println("Enter customer Principle Amount::");
		customer.setpAmt(scn.nextLine());
		
		System.out.println("Enter customer Interest Rate::");
		customer.setiAmt(scn.nextLine());
		
		System.out.println("Enter time period of the loan::");
		customer.setTime(scn.nextLine());
		
		Controller controller=ctx.getBean("controller",Controller.class);
		
		try {
			System.out.println(controller.validateCustomer(customer));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
