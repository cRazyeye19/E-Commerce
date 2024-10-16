package com.group3sd3.E_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group3sd3.E_commerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
