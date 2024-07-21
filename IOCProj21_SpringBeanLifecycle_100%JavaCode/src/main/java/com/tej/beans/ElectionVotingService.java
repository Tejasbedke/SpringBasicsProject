package com.tej.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ElectionVotingService implements DisposableBean,InitializingBean{
	
	String name;
	int age;
	Date verifiedDate;
	
	
	
	public void setName(String name) {
		System.out.println("ElectionVotingService.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("ElectionVotingService.setAge()");
		this.age = age;
	}
	@Override
	public void afterPropertiesSet() {
		
		System.out.println("ElectionVotingService::myinit() ");
		verifiedDate =new Date();
		if(name==null||age<=0) {
			throw new IllegalArgumentException();
		}
			
	}
	
	
	
	public String verifiedVoter() {
	     System.out.println("ElectionVotingService.verifiedVoter() verified on "+verifiedDate);
		if(age>=18) 
			return "mr/mrs "+name+" is eligible  for voting";
		else
			return "master "+name+" is not eligible for voting";

	}
	@Override
	public void destroy() {
		System.out.println("ElectionVotingService.myDestroy()");
		name=null;
		age=0;
		verifiedDate=null;
	}
	/*
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */

}
