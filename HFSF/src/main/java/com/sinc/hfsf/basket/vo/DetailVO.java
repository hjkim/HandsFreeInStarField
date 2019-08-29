package com.sinc.hfsf.basket.vo;

public class DetailVO {

	private String odrId;
	private String prodId;
	private int prodQty;
	private String customerId;
	private String prodName;
	
	public DetailVO() {
		super();
	}

	public DetailVO(String odrId, String prodId, int prodQty, String customerId, String prodName) {
		super();
		this.odrId = odrId;
		this.prodId = prodId;
		this.prodQty = prodQty;
		this.customerId = customerId;
		this.prodName = prodName;
	}

	public String getOdrId() {
		return odrId;
	}

	public void setOdrId(String odrId) {
		this.odrId = odrId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	
	
}
