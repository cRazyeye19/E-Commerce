package com.group3sd3.E_commerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.group3sd3.E_commerce.model.Cart;
import com.group3sd3.E_commerce.model.Product;
import com.group3sd3.E_commerce.model.User;
import com.group3sd3.E_commerce.repository.CartRepository;
import com.group3sd3.E_commerce.repository.ProductRepository;
import com.group3sd3.E_commerce.repository.UserRepository;
import com.group3sd3.E_commerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
	private CartRepository cartRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductRepository productRepository;

    @Override
	public Cart saveCart(Integer productId, Integer userId) {

		User userDtls = userRepository.findById(userId).get();
		Product product = productRepository.findById(productId).get();

		Cart cartStatus = cartRepository.findByProductIdAndUserId(productId, userId);

		Cart cart = null;

		if (ObjectUtils.isEmpty(cartStatus)) {
			cart = new Cart();
			cart.setProduct(product);
			cart.setUser(userDtls);
			cart.setQuantity(1);
			cart.setTotalPrice(1 * product.getDiscountPrice());
		} else {
			cart = cartStatus;
			cart.setQuantity(cart.getQuantity() + 1);
			cart.setTotalPrice(cart.getQuantity() * cart.getProduct().getDiscountPrice());
		}
		Cart saveCart = cartRepository.save(cart);

		return saveCart;
	}

    @Override
	public List<Cart> getCartsByUser(Integer userId) {
		return null;
	}
}
