package com.example.productserviceusingdb.services;

import com.example.productserviceusingdb.models.Cart;
import com.example.productserviceusingdb.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart CreateCart(Cart cart){
        return cartRepository.save(cart);
    }
}
