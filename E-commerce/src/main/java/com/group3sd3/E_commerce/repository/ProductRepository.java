package com.group3sd3.E_commerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group3sd3.E_commerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByIsActiveTrue();

	List<Product> findByCategory(String category);
}
