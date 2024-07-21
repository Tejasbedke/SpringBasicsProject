package com.tej.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:com/tej/compos/Info.properties")
public class Employee {
	@Value("${emp.no}")
	private int empno;
	@Value("${emp.name}")
	private String empname;
	@Value("${emp.addrs}")
	private String empaddrs;
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empaddrs=" + empaddrs + "]";
	}
}
