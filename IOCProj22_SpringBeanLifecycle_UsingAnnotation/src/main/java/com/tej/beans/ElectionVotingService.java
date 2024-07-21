package com.tej.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("vservice")
@PropertySource(value="com/tej/commons/Info.propreties")
public class ElectionVotingService {
	@Value("${voter.name}")
	String name;
	@Value("${voter.age}")
	int age;
	Date verifiedDate;
	
	@PostConstruct
	public void myInit() {
		
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
	@PreDestroy
	public void myDestroy() {
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
