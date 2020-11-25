package com.employee.model;

import java.sql.Timestamp;

public class Admin_Registeration_Model {
	
	// declared variables
	private int id;
	private String first_Name;
	private String last_Name;
	private Timestamp date_reg;
	private String email;
	private String user_Name;
	private String password;
	private String phone;
	private String enabled;
	
	// no argument constructor
	
	public Admin_Registeration_Model() {
	 
	}

	
	// parametrized cosntructor
	public Admin_Registeration_Model(int id, String first_Name, String last_Name, Timestamp date_reg, String email,
			String user_Name, String password, String phone, String enabled) {
	
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.date_reg = date_reg;
		this.email = email;
		this.user_Name = user_Name;
		this.password = password;
		this.phone = phone;
		this.enabled = enabled;
	}

	// getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_Name() {
		return first_Name;
	}


	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}


	public String getLast_Name() {
		return last_Name;
	}


	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}


	public Timestamp getDate_reg() {
		return date_reg;
	}


	public void setDate_reg(Timestamp date_reg) {
		this.date_reg = date_reg;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUser_Name() {
		return user_Name;
	}


	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEnabled() {
		return enabled;
	}


	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}


	@Override
	public String toString() {
		return "Admin_Registeration_Model [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", date_reg=" + date_reg + ", email=" + email + ", user_Name=" + user_Name + ", password=" + password
				+ ", phone=" + phone + ", enabled=" + enabled + "]";
	}

	
	
	 


	

 
	

}
