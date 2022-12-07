package com.adminon.sporty.service;
import java.util.List;
import com.adminon.sporty.entity.Products;
public interface ProductService {
	
    List<Products> getAllProducts();
	
	Products saveProducts(Products product);
	
	Products getProductsById(Long id);
	
	Products updateProducts(Products product);
	
	void deleteProductsById(Long id);
}
