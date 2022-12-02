package com.adminon.sporty.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;
import com.adminon.sporty.entity.Products;
import com.adminon.sporty.repository.ProductRepository;
import com.adminon.sporty.service.ProductService;
@Service
public class ProductServiceImplementation implements ProductService {
	private ProductRepository pr;
	 public ProductServiceImplementation(ProductRepository pr) {
		super();
		this.pr = pr;
	}
	 @Override
		public List<Products> getAllProducts() {
			return pr.findAll();
		}
	 @Override
		public Products getProductsById(Long id) {
			// TODO Auto-generated method stub
		 return pr.findById(id).get();
		}
		@Override
		public Products saveProducts(Products product) {
			// TODO Auto-generated method stub
			return pr.save(product);
		}
		@Override
		public Products updateProducts(Products product) {
			// TODO Auto-generated method stub
			return pr.save(product);
		}
		@Override
		public void deleteProductsById(Long id) {
			// TODO Auto-generated method stub
			pr.deleteById(id);
		}
		

	
	 
	
}
