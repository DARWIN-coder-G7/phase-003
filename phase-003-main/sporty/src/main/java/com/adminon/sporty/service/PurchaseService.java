package com.adminon.sporty.service;

import java.util.List;

import com.adminon.sporty.entity.PurchaseDetails;

public interface PurchaseService {
List<PurchaseDetails>getAllpurchasedetails();

PurchaseDetails savePurchase(PurchaseDetails purchasedetails);
PurchaseDetails getPurchaseById(Long id);


}
