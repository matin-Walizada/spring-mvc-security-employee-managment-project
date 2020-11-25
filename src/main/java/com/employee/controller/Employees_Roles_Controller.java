package com.employee.controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Employees_Roles_Controller {

	@GetMapping("/")
	public String showHomePage() {
		
		
		return "home";
		
	}
	
	
	@GetMapping("/leaders")
	public String showLeaders() {
		
		
		return "leaders";
	}
	
	@GetMapping("/systems")
	public String showSystems() {
		
		return "systems";
	}
	
	
}
