package com.ecom.ProductCatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ProductCatalogue.model.Product;
import com.ecom.ProductCatalogue.repository.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productrepository;

	public List<Product> getAllProducts() {
		return productrepository.findAll();
	}

	public List<Product> getAllProductsByCategory(Long byCategoryId) {
		return productrepository.getProductsByCategoryId(byCategoryId);
	}

}
