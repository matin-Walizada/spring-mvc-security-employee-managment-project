package com.employee.controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.dao.Admin_Registeration_Dao;
import com.employee.model.Admin_Registeration_Model;

@Controller
public class Admins_Registration_Controller {

	// we injected Admin_Registeration_Dao class
	@Autowired
	private Admin_Registeration_Dao admin_Registeration_Dao;
	
	// create a method to show Admin Registration
//	@GetMapping({ "/register","/" })
	@GetMapping("/register")
	public String showAminRegistrationScreen() {
		
		
		return "admin_registration_form";
	}
	
	
	
	// this method save the data 
	@PostMapping("/register")
	public String SaveAdminInfo(HttpServletRequest requets) {
		String firstName = requets.getParameter("first_name");
		String lastName =  requets.getParameter("last_Name");
		String userName = requets.getParameter("username");
		String password = requets.getParameter("password");
		String phoneNumber = requets.getParameter("number");
		String email = requets.getParameter("email");
		String enabled = requets.getParameter("enabled");
		
		Admin_Registeration_Model theRegisteration = new Admin_Registeration_Model();
		theRegisteration.setFirst_Name(firstName);
		theRegisteration.setLast_Name(lastName);
		theRegisteration.setUser_Name(userName);
		theRegisteration.setPassword(password);
		theRegisteration.setPhone(phoneNumber);
		theRegisteration.setEmail(email);
		theRegisteration.setEnabled(enabled);
		
		Timestamp theTimestamp = new Timestamp(new Date().getTime());
		
		theRegisteration.setDate_reg(theTimestamp);
		
		admin_Registeration_Dao.save(theRegisteration);
		
		requets.setAttribute("successMessage", "you have successfully Registered now you can signin");
		
		
		
	
		return "admin_registration_form";
	}
	
	
	
	
}
