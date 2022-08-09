package com.springmvc.demo.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@Column(name = "productID")
	private String productID;
	private String categoryID;
	@Column(name = "productName")
	private String productName;
	private int price;
	@Column(name = "description")
	private String productDescription;
	
	public Product() {};
	
	public Product(String productID, String categoryID, String productName, int price, String productDescription) {
		this.productID = productID;
		this.setCategoryID(categoryID);
		this.productName = productName;
		this.setPrice(price);
		this.productDescription = productDescription;
	}
	
	public String getDescription() {
		return productDescription;
	}
	public void setDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getFormattedPrice() {
		return String.format("$ %.2f", (price*100.00)/100.00);
	}	
}
