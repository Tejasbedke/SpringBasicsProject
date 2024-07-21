package com.tej.comps;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courior {

	public DHL() {
		super();
		System.out.println("DHL::0 param Constructor.");
	}

	@Override
	public void  delivery(String msg) {
		System.out.println("Material Deliver Successful to  "+msg);
		
	}

}
