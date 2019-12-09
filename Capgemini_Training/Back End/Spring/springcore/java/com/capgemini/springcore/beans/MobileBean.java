package com.capgemini.springcore.beans;

public class MobileBean {

	private String brandName;
	private String modelName;
	private int price;
	private MobileDisplayBean displayBean;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MobileDisplayBean getDisplayBean() {
		return displayBean;
	}
	public void setDisplayBean(MobileDisplayBean displayBean) {
		this.displayBean = displayBean;
	}
	
	
	
}
