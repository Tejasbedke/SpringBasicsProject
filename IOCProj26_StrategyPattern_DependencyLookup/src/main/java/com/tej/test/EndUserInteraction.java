package com.tej.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tej.beans.FlipKart;

public class EndUserInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		
		//FileSystemXmlApplicationContext cts=new FileSystemXmlApplicationContext("src/main/java/com/tej/cfgs/applicationContext.xml");
		  FlipKart flip=ctx.getBean("fpkt",FlipKart.class);
		  flip.sendDelivery("sobalgaon");
		  
		 
	}

}
