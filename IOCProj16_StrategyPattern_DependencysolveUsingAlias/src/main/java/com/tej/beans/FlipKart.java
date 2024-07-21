package com.tej.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tej.comps.Courior;
@Component("fpkt")
public class FlipKart {

	@Autowired
	@Qualifier("dpartner")
	Courior courior;
	
	public FlipKart() {
		System.out.println("FlipKart::1 param constructor");
		//this.courior=courior;
	}
	
	public void sendDelivery(String msg) {
		
		courior.delivery(msg);
		
	}
	
}
