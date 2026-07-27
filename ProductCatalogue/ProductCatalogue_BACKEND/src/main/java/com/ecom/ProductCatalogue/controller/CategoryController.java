package com.ecom.ProductCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ProductCatalogue.model.Category;
import com.ecom.ProductCatalogue.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping
	public List<Category> getAllCategories(){
		return categoryservice.getAllCategories();
	}

}
