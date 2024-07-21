package com.tej.comps;


public class DTDC implements Courior{

	
	public DTDC() {
		super();
		System.out.println("DTDC::0 param Constructor.");
	}

	@Override
	public void  delivery(String msg) {
		System.out.println("Material Deliver Successful to  "+msg);
		
	}
	
	

}
