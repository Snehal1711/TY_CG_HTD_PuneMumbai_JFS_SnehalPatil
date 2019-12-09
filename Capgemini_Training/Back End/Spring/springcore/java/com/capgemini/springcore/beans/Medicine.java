package com.capgemini.springcore.beans;

import java.util.List;
import java.util.Set;

public class Medicine {

	private String name;
	private double price;
	private String type;
	//private List<String> drugs;
	private Set<String> drugs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	/*public List<String> getDrugs() {
		return drugs;
	}
	public void setDrugs(List<String> drugs) {
		this.drugs = drugs;
	}*/
	public Set<String> getDrugs() {
		return drugs;
	}
	public void setDrugs(Set<String> drugs) {
		this.drugs = drugs;
	}
	
	
	
	
	
}
