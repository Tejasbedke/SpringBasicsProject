package com.tej.comps;

public class CustomerDTO {

	private Integer cNo;
	private String cName;
	private String cAdd;
	private Double pAmt;
	private Double iAmt;
	private Integer time;
	
	public Integer getcNo() {
		return cNo;
	}
	public void setcNo(Integer cNo) {
		this.cNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAdd() {
		return cAdd;
	}
	public void setcAdd(String cAdd) {
		this.cAdd = cAdd;
	}
	public Double getpAmt() {
		return pAmt;
	}
	public void setpAmt(Double pAmt) {
		this.pAmt = pAmt;
	}
	public Double getiAmt() {
		return iAmt;
	}
	public void setiAmt(Double iAmt) {
		this.iAmt = iAmt;
	}
	
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time ) {
		this.time=time;
	}
	
}
