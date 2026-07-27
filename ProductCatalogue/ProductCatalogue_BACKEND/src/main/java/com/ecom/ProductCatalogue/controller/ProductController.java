package com.ecom.ProductCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ProductCatalogue.model.Product;
import com.ecom.ProductCatalogue.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productservice.getAllProducts();
	}
	
	@GetMapping("/category/{ByCategoryId}")
	public List<Product> getAllProductsByCategory(@PathVariable Long ByCategoryId ){
		return productservice.getAllProductsByCategory(ByCategoryId);
	}
}
