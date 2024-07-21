package com.tej.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tej.comps.Courior;

public class Flipkart {
	@Autowired
	//@Qualifier("dtdc")
    Courior courior;
    
    
   
    public Flipkart() {
	    System.out.println("Flipkart::0 param constructor");
	}

	/*
	 * public void setCourior(Courior courior) {
	 * System.out.println("Flipcart::setCourior()"); this.courior=courior; }
	 */
    
    public void bookOrder(String []names,double []price) {
    
    	double totalprice=0.0;
    	for(double d:price) {
    		totalprice+=d;
    	}
    	
    	String name=Arrays.toString(names);
    	
    	courior.sendParcel(name, totalprice);
    }
	
}

