package com.tej.beans;

import com.tej.comps.Courior;

public class FlipKart {

	Courior courior;
	
	public FlipKart(Courior courior) {
		System.out.println("FlipKart::1 param constructor");
		this.courior=courior;
	}
	
	public void sendDelivery(String msg) {
		
		courior.delivery(msg);
		
	}
	
}
