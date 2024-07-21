package com.tej.teas;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/tej/cfgs/applicationContext.xml");
		
		Class c=factory.getBean("c",Class.class);
		
		System.out.println(c+"  "+c.toString());
		
		Calendar cal=factory.getBean("cal",Calendar.class);
		System.out.println(cal.getCalendarType());
	    System.out.println(cal+"  "+cal.toString());
	    
	    Properties props=factory.getBean("props",Properties.class);
	    System.out.println(props+"  "+props.toString());
	    
		String s=factory.getBean("s2",String.class);
		System.out.println(s);
		System.out.println("----------------------------------------------");
		String ss=factory.getBean("ss2",String.class);
		System.out.println(ss);
		
		
	}

}
