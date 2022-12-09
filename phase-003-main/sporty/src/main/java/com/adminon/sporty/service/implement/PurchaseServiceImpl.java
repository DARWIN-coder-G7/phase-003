package com.adminon.sporty.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adminon.sporty.entity.PurchaseDetails;
import com.adminon.sporty.repository.PurchasedetailsRepo;
import com.adminon.sporty.service.PurchaseService;
@Service
public class PurchaseServiceImpl implements PurchaseService {

	public PurchaseServiceImpl(PurchasedetailsRepo pdr) {
		super();
		this.pdr = pdr;
	}

	private PurchasedetailsRepo pdr;
	@Override
	public List<PurchaseDetails> getAllpurchasedetails() {
		// TODO Auto-generated method stub
		return pdr.findAll();
	}

	@Override
	public PurchaseDetails savePurchase(PurchaseDetails purchasedetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseDetails getPurchaseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
