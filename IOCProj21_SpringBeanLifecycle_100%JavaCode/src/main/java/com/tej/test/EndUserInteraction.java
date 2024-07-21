package com.tej.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tej.beans.ElectionVotingService;

public class EndUserInteraction {

	public static void main(String[] args) {
	      
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		
		ElectionVotingService verify= ctx.getBean("verify",ElectionVotingService.class);
		System.out.println(verify.verifiedVoter());
        ctx.close();
	}

	
		
	}