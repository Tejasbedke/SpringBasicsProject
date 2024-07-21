package com.tej.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import com.tej.comps.DTDC;
@Component("fpkt")
public abstract class FlipKart {//implements ApplicationContextAware{

	//@Autowired
	//@Qualifier("dpartner")
//	Courior courior;
//	@Override
//	public void setApplicationContext(ApplicationContext ctx) {
//		System.out.println("FlipKart.setapplicationContext() method");
//		this.courior=ctx.getBean("dtdc",DTDC.class);
//	}
	
	@Lookup
	public abstract DTDC getDtdc();
	
	public FlipKart() {
		System.out.println("FlipKart::1 param constructor");
		//this.courior=courior;
	}
	
	public void sendDelivery(String msg) {
		
		DTDC d=getDtdc();
		d.delivery(msg);
		
		System.out.println(d.getClass());
		
	}
	
}
