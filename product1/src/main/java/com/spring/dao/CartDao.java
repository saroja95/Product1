package com.spring.dao;

import com.spring.model.Cart;

public interface CartDao {
Cart getCartByCartId(int cartId);
}
