package com.jikexueyuan.demo.springmvc.lesson6.entity;

public class SysUser {

	private String first_name ;
	private String last_name ;
	private int address_id ;
	private String email;
	private int customer_id;
	private String last_update;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	public SysUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SysUser [first_name=" + first_name + ", last_name=" + last_name + ", address_id=" + address_id
				+ ", email=" + email + ", customer_id=" + customer_id + ", last_update=" + last_update + "]";
	}
	
	
}
