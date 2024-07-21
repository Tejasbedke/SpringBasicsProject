package com.tej.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tej.beans.Cricketer;

public class DependencyAware_InterfaceInjection {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		Cricketer c=ctx.getBean("cricket",Cricketer.class);
		c.bowling();
		c.wicketKeeping();
		c.fielding();
		c.batting();
	}

}
