package com.tej.jbeans;

import java.sql.Date;

public class PatientDTO {

	private int pid;	
	private String pname;
	private String paddrs;
	private Date addmitDate;
	private Date leaveDate;
	private float totaldays;
	private float bill;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddrs() {
		return paddrs;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public Date getAddmitDate() {
		return addmitDate;
	}
	public void setAddmitDate(Date addmitDate) {
		this.addmitDate = addmitDate;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public float getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(float totaldays) {
		this.totaldays = totaldays;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	
	
	
	
}
