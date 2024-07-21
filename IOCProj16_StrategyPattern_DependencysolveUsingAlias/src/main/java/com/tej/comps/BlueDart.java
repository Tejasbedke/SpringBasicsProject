package com.tej.comps;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courior{
	
	public BlueDart() {
		super();
		System.out.println("BlueDart::0 param constructor");
	}

	@Override
	public void delivery(String msg) {
		System.out.println("Material Deliver Successful  to"+msg);
		
	}

}
