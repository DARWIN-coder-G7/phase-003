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
     public PurchaseDetails() {
		super();
	}
	public PurchaseDetails(UserDetails user, Products pr, LocalDate purchasedate) {
		super();
		this.user = user;
		this.pr = pr;
		this.purchasedate = purchasedate;
	}
	@Id
     @GeneratedValue
	private long orderid;
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "user.uid")
     private UserDetails user;
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "pr.category")
     private Products pr;
     @Column(name = "pr_date", nullable = false)
	private LocalDate purchasedate;
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public Products getPr() {
		return pr;
	}
	public void setPr(Products pr) {
		this.pr = pr;
	}
	public LocalDate getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(LocalDate purchasedate) {
		this.purchasedate = purchasedate;
	}
}
