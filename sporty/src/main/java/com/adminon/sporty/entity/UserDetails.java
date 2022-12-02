package com.adminon.sporty.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
	public UserDetails() {
		super();
	}
	public UserDetails(long uid, String username, String email, long mobile, String address) {
		super();
		this.uid = uid;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	@Column(name = "name", nullable = false)
	private String username;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "mobile", nullable = false)
	private long mobile;
	@Column(name = "address", nullable = false)
	private String address;
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
