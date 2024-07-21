package com.tej.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("student")
@PropertySource("classpath:com/tej/compos/info.properties")
public class Student {
	@Value("${std.id}")
	private int sid;
	@Value("${std.name}")
	private String sname;
	@Value("${std.addrs}")
	private String saddrs;
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddrs=" + saddrs + "]";
	}
	
	

}
