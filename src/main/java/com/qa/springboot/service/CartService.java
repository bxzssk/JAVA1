package com.qa.springboot.service;

import java.util.List;

import com.qa.springboot.pojo.Cart;

public interface CartService {
	//添加购物车
	void addCart(Cart c);
	
	//根据用户ID查询
	List<Cart> queryCart(int userid);
}
