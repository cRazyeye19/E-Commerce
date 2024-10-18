package com.group3sd3.E_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group3sd3.E_commerce.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    public Cart findByProductIdAndUserId(Integer productId, Integer userId);
    
}
