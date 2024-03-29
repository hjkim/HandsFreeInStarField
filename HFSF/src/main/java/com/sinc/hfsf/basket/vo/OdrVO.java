package com.sinc.hfsf.basket.vo;

public class OdrVO {
	
	private String odrId;
	private String pickupId;
	private String customerId;
	private String odrDate;
	private String packDate;
	private String pickupDate;
	private String odrState;
	private String token;
	private int totalPrice;
	private String customerName;
	private String pickupName;
	
	public OdrVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OdrVO(String odrId, String pickupId, String customerId, String odrDate, String packDate, String pickupDate,
			String odrState, String token, int totalPrice, String customerName, String pickupName) {
		super();
		this.odrId = odrId;
		this.pickupId = pickupId;
		this.customerId = customerId;
		this.odrDate = odrDate;
		this.packDate = packDate;
		this.pickupDate = pickupDate;
		this.odrState = odrState;
		this.token = token;
		this.totalPrice = totalPrice;
		this.customerName = customerName;
		this.pickupName = pickupName;
	}

	public String getOdrId() {
		return odrId;
	}

	public void setOdrId(String odrId) {
		this.odrId = odrId;
	}

	public String getPickupId() {
		return pickupId;
	}

	public void setPickupId(String pickupId) {
		this.pickupId = pickupId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOdrDate() {
		return odrDate;
	}

	public void setOdrDate(String odrDate) {
		this.odrDate = odrDate;
	}

	public String getPackDate() {
		return packDate;
	}

	public void setPackDate(String packDate) {
		this.packDate = packDate;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getOdrState() {
		return odrState;
	}

	public void setOdrState(String odrState) {
		this.odrState = odrState;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPickupName() {
		return pickupName;
	}

	public void setPickupName(String pickupName) {
		this.pickupName = pickupName;
	}


}
