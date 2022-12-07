package com.adminon.sporty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.adminon.sporty.service.PurchaseService;

@Controller
public class Purchcontroller {
	public Purchcontroller(PurchaseService psr) {
		super();
		this.psr = psr;
	}

	private PurchaseService psr;

	@GetMapping("/purchase")
	public String getall(Model model) {
		
		model.addAttribute("products", psr.getAllpurchasedetails());
		return"";
	}
}
