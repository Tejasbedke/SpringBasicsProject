package com.tej.jbeans;

import java.sql.Date;

public class PatientVO {

	private String pid;
	
	private String pname;
	private String paddrs;
	private String addmitDate;
	private String leaveDate;
	private String totaldays;
	private String bill;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
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
	public String getAddmitDate() {
		return addmitDate;
	}
	public void setAddmitDate(String addmitDate) {
		this.addmitDate = addmitDate;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(String totaldays) {
		this.totaldays = totaldays;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	
	
}
