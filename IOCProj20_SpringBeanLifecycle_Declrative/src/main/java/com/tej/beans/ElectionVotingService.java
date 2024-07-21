package com.tej.beans;

import java.util.Date;

public class ElectionVotingService {
	
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
	
	public void myinit() {
		
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
	public void myDestroy() {
		System.out.println("ElectionVotingService.myDestroy()");
		name=null;
		age=0;
		verifiedDate=null;
	}
	

}
