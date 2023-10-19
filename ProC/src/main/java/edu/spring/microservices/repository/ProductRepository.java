package edu.spring.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.microservices.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByProductcategory(String productcategory);

}
