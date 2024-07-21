package com.tej.test;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		Locale locale=new Locale(args[0],args[1]);
		String msg1=ctx.getMessage("wish.msg",new String[] {}, locale);
		String msg2=ctx.getMessage("bye.msg",new String[] {}, locale);
		
		System.out.println(msg1+" ->  "+msg2);
	}
}