package com.ecom.ProductCatalogue.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecom.ProductCatalogue.model.Category;
import com.ecom.ProductCatalogue.model.Product;
import com.ecom.ProductCatalogue.repository.CategoryRepository;
import com.ecom.ProductCatalogue.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productrepository;
	@Autowired
	private CategoryRepository categoryrepository;
	
	@Override
	public void run(String... args) throws Exception{
		//clear all existing data
		
		productrepository.deleteAll();
		categoryrepository.deleteAll();
		
		
		//create categories
		Category electronics=new Category();
		electronics.setName("Electronics");
		
		Category home=new Category();
		home.setName("Home");
		
		Category clothing=new Category();
		clothing.setName("Clothing");
		
		Category fashion=new Category();
		fashion.setName("Fashion");
		
		categoryrepository.saveAll(Arrays.asList(electronics,home,clothing,fashion));
		
		
		
		Product phone=new Product();
		phone.setDescription("Phone");
		phone.setImageUrl("https://placehold.co/600x400");
		phone.setName("Iphone");
		phone.setPrice(80000.0);
		phone.setCategory(electronics);
		
		
		Product laptop=new Product();
		laptop.setDescription("Laptop");
		laptop.setImageUrl("https://placehold.co/600x400");
		laptop.setName("DELL");
		laptop.setPrice(90000.0);
		laptop.setCategory(electronics);
		
		Product Blender=new Product();
		Blender.setDescription("Blender");
		Blender.setImageUrl("https://placehold.co/600x400");
		Blender.setName("BAJAJ");
		Blender.setPrice(9000.0);
		Blender.setCategory(electronics);
		
		
		Product Speaker=new Product();
		Speaker.setDescription("Speaker");
		Speaker.setImageUrl("https://placehold.co/600x400");
		Speaker.setName("BOAT");
		Speaker.setPrice(1500.0);
		Speaker.setCategory(electronics);
		
		
		Product Jacket=new Product();
		Speaker.setDescription("Jacket");
		Speaker.setImageUrl("https://placehold.co/600x400");
		Speaker.setName("Gucci");
		Speaker.setPrice(15000.0);
		Speaker.setCategory(clothing);
		
		
		productrepository.saveAll(Arrays.asList(phone,laptop,Blender,Speaker));
	}

}
