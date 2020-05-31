package com.example.securityapp.securityapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.securityapp.securityapp.repositories.EmployeeRepository;

@Controller
public class SecurityAppController {
	@Autowired
	private EmployeeRepository repo;
	
	
	@RequestMapping("/")
	public String homeController() {
		
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginController() {
		
		return "login";
	}
	
	
	@RequestMapping("/employees")
	public String getEmployee(Model model) {
		
		model.addAttribute("employees", repo.findAll());
		
		return "employees";
	}
	
	@RequestMapping("/HR")
	public String getEmployeebyHR(Model model) {
		
		model.addAttribute("employees", repo.findAll());
		
		return "hr";
	}
}
