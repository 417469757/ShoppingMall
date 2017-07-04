package com.tangz.shoppingmall.service.impl;

import com.tangz.shoppingmall.dao.CartDao;
import com.tangz.shoppingmall.meta.ShoppingCart;
import com.tangz.shoppingmall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartDao cartDao;

    public int insertCart(ShoppingCart shoppingCart) {
        return cartDao.insertCart(shoppingCart);
    }

    public ShoppingCart findByUserId(int userId) {
        ShoppingCart cart = cartDao.findByUserId(userId);
        return cart;
    }

    public int updateCart(ShoppingCart cart) {
        return cartDao.updateCart(cart);
    }

}
