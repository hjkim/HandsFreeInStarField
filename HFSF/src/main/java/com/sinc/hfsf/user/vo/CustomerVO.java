package com.sinc.hfsf.user.vo;

public class CustomerVO {
	
	private String customerId;
	private String customerName;
	private String carNo;
	private String carFloor;
	private String carLoc;
	public CustomerVO(String customerId, String customerName, String carNo, String carFloor,
			String carLoc) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.carNo = carNo;
		this.carFloor = carFloor;
		this.carLoc = carLoc;
	}
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarFloor() {
		return carFloor;
	}
	public void setCarFloor(String carFloor) {
		this.carFloor = carFloor;
	}
	public String getCarLoc() {
		return carLoc;
	}
	public void setCarLoc(String carLoc) {
		this.carLoc = carLoc;
	}
	
	
	
}
