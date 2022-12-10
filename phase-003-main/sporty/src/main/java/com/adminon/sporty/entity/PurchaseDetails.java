package com.adminon.sporty.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "order_details")

public class PurchaseDetails {
   
	public PurchaseDetails(long orderid, long userid, String prdcategory, long productid, LocalDate purchasedate) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.prdcategory = prdcategory;
		this.productid = productid;
		this.purchasedate = purchasedate;
	}
	public PurchaseDetails() {
		super();
	}
	
	@Id
     @GeneratedValue
	private long orderid;
	 @Column(name = "user_id", nullable = false)
     private long userid;
	 @Column(name = "prd_cat", nullable = false)
    private String prdcategory;
	 @Column(name = "product_id", nullable = false)
     private long productid;
     @Column(name = "pr_date", nullable = false)
	private LocalDate purchasedate;
     
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	
	
	
	public LocalDate getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(LocalDate purchasedate) {
		this.purchasedate = purchasedate;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getPrdcategory() {
		return prdcategory;
	}
	public void setPrdcategory(String prdcategory) {
		this.prdcategory = prdcategory;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	
}
