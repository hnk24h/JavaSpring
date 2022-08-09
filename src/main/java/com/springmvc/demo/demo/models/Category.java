package com.springmvc.demo.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@Column(name = "categoryID")
	private String categoryID;
	@Column(name = "categoryName")
	private String categoryName;
	@Column(name = "description")
	private String categoryDescription;
	
	public Category() {};
	
	public Category(String categoryID, String categoryName, String categoryDescription) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}
	
	public String getDescription() {
		return categoryDescription;
	}
	public void setDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
	
}
