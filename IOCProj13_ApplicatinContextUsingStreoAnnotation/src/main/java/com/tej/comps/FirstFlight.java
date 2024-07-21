package com.tej.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("courior")
//@Primary
public class FirstFlight implements Courior {

	
	public FirstFlight() {
		super();
		System.out.println("FirstFlight::0 param constructor");
	}

	@Override
	public void sendParcel(String name, double price) {
		System.out.println(name+"  Parcel has been sent through FirstFlight "+price);

	}

}
