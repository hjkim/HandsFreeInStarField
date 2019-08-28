package com.sinc.hfsf.qr.vo;

public class QrVO {
	
	private String qr_id;
	private String pickup_id;
	private String qr_date;
	private int total_price;
	private String customer_id;
	
	public QrVO() {
		super();
	}

	public QrVO(String qr_id, String pickup_id, String qr_date, int total_price, String customer_id) {
		super();
		this.qr_id = qr_id;
		this.pickup_id = pickup_id;
		this.qr_date = qr_date;
		this.total_price = total_price;
		this.customer_id = customer_id;
	}

	public String getQr_id() {
		return qr_id;
	}

	public void setQr_id(String qr_id) {
		this.qr_id = qr_id;
	}

	public String getPickup_id() {
		return pickup_id;
	}

	public void setPickup_id(String pickup_id) {
		this.pickup_id = pickup_id;
	}

	public String getQr_date() {
		return qr_date;
	}

	public void setQr_date(String qr_date) {
		this.qr_date = qr_date;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	
	
}
