package com.tej.comps;

import org.springframework.stereotype.Component;

@Component("dtdc")
public  class DTDC implements Courior {

	
	
	public DTDC() {
		super();
		System.out.println("DTDC::0 param constructor");
	}

	@Override
	public void sendParcel(String name, double price) {
		System.out.println("DTDC.sendParcel()");
		System.out.println(name+"  Parcel has been sent through DTDC "+price);
		
	}

	
}
