package com.simplilearn.webservice.model;

import java.util.Date;

public class Product {

	// properties
	private long id;
	private String name;
	private double price;
	private String description;
	private boolean enabled;
	private Date createAt;
	
	// get & set methods
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	// constructor 
	public Product() {
		super();
	}
	public Product(int id, String name, double price, String description, boolean enabled, Date createAt) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.enabled = enabled;
		this.createAt = createAt;
	}
	
	// override tostring
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", enabled=" + enabled + ", createAt=" + createAt + "]";
	}	
}
