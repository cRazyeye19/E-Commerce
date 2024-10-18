package com.group3sd3.E_commerce.service;

import java.util.List;

import com.group3sd3.E_commerce.model.Cart;

public interface CartService {

    public Cart saveCart(Integer productId, Integer userId);

    public List<Cart> getCartsByUser(Integer userId);
}
