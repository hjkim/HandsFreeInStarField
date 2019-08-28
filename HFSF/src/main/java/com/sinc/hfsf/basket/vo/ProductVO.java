package com.sinc.hfsf.basket.vo;

public class ProductVO {
	private String prodId;
    private String prodName;
    private int prodPrice;
    private boolean prodTaggable;
    private String prodImgDir;

    private String odrId;
    private int prodQty;
    private String customerId;
    
	public ProductVO(String prodId, String prodName, int prodPrice, boolean prodTaggable, String prodImgDir,
			String odrId, int prodQty, String customerId) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodTaggable = prodTaggable;
		this.prodImgDir = prodImgDir;
		this.odrId = odrId;
		this.prodQty = prodQty;
		this.customerId = customerId;
	}
	
	
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public boolean isProdTaggable() {
		return prodTaggable;
	}
	public void setProdTaggable(boolean prodTaggable) {
		this.prodTaggable = prodTaggable;
	}
	public String getProdImgDir() {
		return prodImgDir;
	}
	public void setProdImgDir(String prodImgDir) {
		this.prodImgDir = prodImgDir;
	}
	public String getOdrId() {
		return odrId;
	}
	public void setOdrId(String odrId) {
		this.odrId = odrId;
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
    
    
    
	
	
}
