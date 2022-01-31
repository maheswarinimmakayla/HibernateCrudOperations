package com.mouritech.criteriaexamples.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private Double productPrice;
	private String productCategory;
	private String productColor;
		


	public Product(int productId, String productName, Double productPrice, String productCategory,
			String productColor) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productColor = productColor;
	}



	public Product(String productName, Double productPrice, String productCategory, String productColor) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productColor = productColor;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}



	public String getProductCategory() {
		return productCategory;
	}



	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}



	public String getProductColor() {
		return productColor;
	}



	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productCategory=" + productCategory + ", productColor=" + productColor + "]";
	}

	
}

