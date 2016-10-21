package com.niit.shopfrontend;

import java.io.Serializable;

public class UserBean implements Serializable{
 
	private static final long serialVersionUID = 4657462015039726030L;
	private String userId;
	private String email;
	private Integer age;
	private String address;
	private String contactno;
	 
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
 
}
