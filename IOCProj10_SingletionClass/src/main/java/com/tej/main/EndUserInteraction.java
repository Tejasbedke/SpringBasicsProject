package com.tej.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tej.singleton.Printer;



public class EndUserInteraction {

	public static void main(String[] args) {

		/*
		 * DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("com/tej/cfgs/applicationContext.xml");
		 */
		//FileSystemXmlApplicationContext factory=new FileSystemXmlApplicationContext("src/main/java/com/tej/cfgs/applicationContext.xml");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
	    Printer p1=factory.getBean("print",Printer.class);
	    Printer p2=factory.getBean("print2",Printer.class);
	    System.out.println("P1==P2?  "+p1.equals(p2));
	    System.out.println(p1.hashCode()+"  "+p2.hashCode());
	}

}
