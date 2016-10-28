package com.spring.dao;

import com.spring.model.CartItem;

public interface CartItemDao {
void addCartItem(CartItem cartItem);

void removeCartItem(int cartItemId);
void removeAllCartItems(int cartId);
}
