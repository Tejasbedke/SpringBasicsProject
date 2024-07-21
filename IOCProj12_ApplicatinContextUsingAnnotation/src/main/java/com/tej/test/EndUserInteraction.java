package com.tej.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tej.beans.Flipkart;

public class EndUserInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("com/tej/cfgs/applicationContext.xml");
		 */
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		
		Flipkart flipkart=ctx
				.getBean("flipkart",Flipkart.class);
		flipkart.bookOrder(new String[]{"core java","python","html"},new double[] {1500,4500,5500});
		
	}

}
