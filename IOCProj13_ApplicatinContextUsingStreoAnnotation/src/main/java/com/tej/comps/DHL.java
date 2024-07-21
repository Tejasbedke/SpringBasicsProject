package com.tej.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dhl")
@Primary
public class DHL implements Courior {

	
	
	public DHL() {
		super();
		System.out.println("DHL.0 param constructor");
	}

	@Override
	public void sendParcel(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println(name+"  Parcel has been sent through DHL "+price);
	}

}
