package com.ecom.ProductCatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ProductCatalogue.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
	
	

}
