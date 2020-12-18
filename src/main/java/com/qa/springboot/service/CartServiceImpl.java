package com.qa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.CartMapper;
import com.qa.springboot.pojo.Cart;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartMapper cm;
	
	@Override
	public void addCart(Cart c) {
		
		cm.insert(c);
		
	}

	@Override
	public List<Cart> queryCart(int userid) {
		
		return cm.selectCartByUserid(userid);
	}

}
