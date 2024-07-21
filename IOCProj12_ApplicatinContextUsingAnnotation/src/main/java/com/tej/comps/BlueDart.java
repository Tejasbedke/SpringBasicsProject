package com.tej.comps;

public class BlueDart implements Courior {

	
	public BlueDart() {
		System.out.println("BlueDart::0 param constructor");
	}

	@Override
	public void sendParcel(String name, double price) {
		
		System.out.println(name+"  Parcel has been sent through BlueDart "+price);
		
	}

	
}