package com.tej.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tej.beans.Employee;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		
		Employee emp=ctx.getBean("emp",Employee.class);
		
		System.out.println(emp);
	}

}
