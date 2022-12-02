package com.adminon.sporty.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.adminon.sporty.entity.UserDetails;
import com.adminon.sporty.service.Userservice;
@Controller
public class Usercontroller {
	private Userservice us;
	public Usercontroller(Userservice us) {
		super();
		this.us = us;
	}

	
	@GetMapping("/users")
	public String getallusers(Model model) {
		model.addAttribute("users",us.getAllUsers() );
		return"user";
	}
}
