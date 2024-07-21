package com.tej.test;

import java.util.Date;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.tej.beans.Student;

public class PropertiesTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		
		Student student=ctx.getBean("student",Student.class);
		System.out.println(student);
		
		Date d=ctx.getBean("date",Date.class);
		System.out.println(d);
		
		Environment env=ctx.getEnvironment();
		System.out.println(ctx);
		System.out.println(env.getProperty("std.name"));
		
		Properties p=System.getProperties();
		System.out.println(p);
		

	}

}
