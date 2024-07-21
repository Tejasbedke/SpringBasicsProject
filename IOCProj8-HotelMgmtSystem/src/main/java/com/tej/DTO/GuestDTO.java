package com.tej.DTO;

import java.io.Serializable;

public class GuestDTO implements Serializable {

	String gName;
	String gaddrs;
	Integer nofDays;
	Double perDCharge;
	
	
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getGaddrs() {
		return gaddrs;
	}
	public void setGaddrs(String gaddrs) {
		this.gaddrs = gaddrs;
	}
	public Integer getNofDays() {
		return nofDays;
	}
	public void setNofDays(Integer nofDays) {
		this.nofDays = nofDays;
	}
	public Double getPerDCharge() {
		return perDCharge;
	}
	public void setPerDCharge(Double perDCharge) {
		this.perDCharge = perDCharge;
	}
	
	
	
}
