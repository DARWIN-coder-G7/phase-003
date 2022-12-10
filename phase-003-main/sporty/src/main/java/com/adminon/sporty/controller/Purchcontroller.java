package com.adminon.sporty.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.adminon.sporty.entity.Products;
import com.adminon.sporty.entity.PurchaseDetails;
import com.adminon.sporty.entity.UserDetails;
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
		
		
		model.addAttribute("products",psr.getAllpurchasedetails());
		return"purchase";
	}
	@GetMapping("/purchase/date")
	public String getbydate(PurchaseDetails ud ,Model model,String keyword) {
		model.addAttribute("products",psr.getbykeyword(keyword));
		
		return "purchase";
	}
	@GetMapping("/category")
	public String getbycategory(PurchaseDetails ud ,Model model,String keywords) {
		model.addAttribute("products",psr.getbykeywords(keywords));
		
		return "purchase";
	}
	@GetMapping("/check")
	public String just(Model mod) {
		
		return"purchas";
	}
}
