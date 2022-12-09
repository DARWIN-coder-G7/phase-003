package com.adminon.sporty.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
public class Products {
	public Products(String product_name, int product_size, double product_price, String brand_name, String category,
			int available_qty) {
		super();
		this.product_name = product_name;
		this.product_size = product_size;
		this.product_price = product_price;
		this.brand_name = brand_name;
		this.category = category;
		this.available_qty = available_qty;
	}
	public Products() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "pr_name", nullable = false)
	private String product_name;
	/*@OneToMany(mappedBy = "ps")
	private List<PurchaseDetails>purchasedetails= new ArrayList<>();*/
	@Column(name = "pr_size", nullable = false)
	private int product_size;
	@Column(name = "pr_price", nullable = false)
	private double product_price;
	@Column(name = "br_name", nullable = false)
	private String brand_name;
	@Column(name = "pr_type", nullable = false)
	private String category;
	@Column(name = "in_stock", nullable = false)
	private int available_qty;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_size() {
		return product_size;
	}
	public void setProduct_size(int product_size) {
		this.product_size = product_size;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getAvailable_qty() {
		return available_qty;
	}
	public void setAvailable_qty(int available_qty) {
		this.available_qty = available_qty;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/*public List<PurchaseDetails> getPurchasedetails() {
		return purchasedetails;
	}
	public void setPurchasedetails(List<PurchaseDetails> purchasedetails) {
		this.purchasedetails = purchasedetails;
	}*/
	

}
