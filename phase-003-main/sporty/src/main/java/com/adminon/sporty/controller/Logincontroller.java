package com.adminon.sporty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adminon.sporty.entity.Login;
import com.adminon.sporty.entity.Products;
import com.adminon.sporty.service.Loginservice;

@Controller
public class Logincontroller {
public Logincontroller(Loginservice ls) {
		super();
		this.ls = ls;
	}

private Loginservice ls;
@GetMapping("/index")
public String call() {
	return"index";
}
@PostMapping("/home")
public String tester(@RequestParam(defaultValue = "empty") String name,@RequestParam(defaultValue = "empty") String pin) {
	long id = 1;
	Login data = ls.getLoginById(id);
	String  usname =data.getUsername();
	String pinn = data.getPass();
	if(usname.equalsIgnoreCase(name)&&pinn.equalsIgnoreCase(pin)) {
		return"redirect:/products";
	}else
	return"redirect:/index";
}
@PostMapping("/login")
public String updateProduct(@RequestParam(defaultValue = "empty") String pincode) {
	long id = 1;
	// get student from database by id
	Login existingproduct = ls.getLoginById(id);
	existingproduct.setId(id);
	
	existingproduct.setPass(pincode);
	
	ls.updateLog(existingproduct);
	return "redirect:/products";		
}
}
