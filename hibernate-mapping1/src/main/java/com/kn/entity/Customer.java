package com.kn.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int customerid;
	String customername;
	int age;
	@OneToMany
	List<Products> products;

	public Customer() {
		super();
	}

	public Customer(int customerid, String customername, int age, List<Products> products) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.age = age;
		this.products = products;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", age=" + age + ", products="
				+ products + "]";
	}

}
