package com.sinc.hfsf.admin.vo;

public class StockVO {
	String prod_id;
	String prod_name;
	int prod_stock;
	String prod_taggable;
	public StockVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockVO(String prod_id, String prod_name, int prod_price, String prod_taggable) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_stock = prod_price;
		this.prod_taggable = prod_taggable;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_stock() {
		return prod_stock;
	}
	public void setProd_stock(int prod_stock) {
		this.prod_stock = prod_stock;
	}
	public String getProd_taggable() {
		return prod_taggable;
	}
	public void setProd_taggable(String prod_taggable) {
		this.prod_taggable = prod_taggable;
	} 
	
	
}
