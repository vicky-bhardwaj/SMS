package com.dac.studentApp.model;

import org.springframework.stereotype.Component;






//@Data // generates getters for all fields
@Component
public class Product {

	private int prodId;
    private String prodName;
    private int price;
   
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		this.prodId=100;
		this.prodName="jeena";
		this.price=60000;
		
	}
	public Product(int prodId, String prodName, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	
}