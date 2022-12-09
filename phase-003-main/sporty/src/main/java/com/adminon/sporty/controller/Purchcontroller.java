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
		List<PurchaseDetails> order =  psr.getAllpurchasedetails();
		System.out.println("0th id of order"+order.get(0));
		System.out.println("0th id of order"+order.get(1));
		System.out.println("0th id of order"+order.get(2));
		System.out.println("0th id of order"+order.indexOf(order));
	List data = new ArrayList();
		for (PurchaseDetails purchaseDetails : order) {
			Products prd = purchaseDetails.getPs();
			UserDetails urd = purchaseDetails.getUser();
			int i = 0;
			System.out.println("inside for each"+order.get(i));
			data.add(i,purchaseDetails.getOrderid());
			data.add(i,purchaseDetails.getPurchasedate());
			data.add(i,urd.getUsername());
			data.add(i,prd.getProduct_name());
			System.out.println(data.toString());
			System.out.println(urd.getUsername());
			System.out.println(prd.getProduct_name());
			System.out.println(purchaseDetails.getOrderid());
			System.out.println(purchaseDetails.getPurchasedate());
			System.out.println(data.get(0));
			i++;
		}
		model.addAttribute("products",order);
		return"purchase";
	}
	@GetMapping("/check")
	public String just(Model mod) {
		
		return"purchas";
	}
}
