package com.adminon.sporty.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	public Login(String pass) {
		super();
		this.pass = pass;
	}
	public Login() {
		super();
	}
	public Login( String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	@Id
	@GeneratedValue
    private long id;
    private String username;
    private String pass;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
