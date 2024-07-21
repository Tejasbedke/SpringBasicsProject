package com.tej.comps;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courior{

	
	public DTDC() {
		super();
		System.out.println("DTDC::0 param Constructor.");
	}

	@Override
	public void  delivery(String msg) {
		System.out.println("Material Deliver Successful through DTDC to  "+msg);
		
	}
	
	

}
