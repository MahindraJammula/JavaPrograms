package com.kn.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {
	@Id
	int productId;
	String productname;
	double cost;
	@ManyToOne
	Customer customer;

	public Products() {
		super();
	}

	public Products(int productId, String productname, double cost, Customer customer) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.cost = cost;
		this.customer = customer;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productname=" + productname + ", cost=" + cost + ", customer="
				+ customer + "]";
	}

}
