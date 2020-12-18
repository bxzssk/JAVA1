package com.qa.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.Cart;
import com.qa.springboot.service.CartService;

@RestController
@RequestMapping("/addCartController")
public class AddCartController {
	
	@Autowired
	CartService cs;
	
	
	@RequestMapping("/addcart")
	public String add(Cart c){
		int ctid=(int)(Math.random()*100000);
		c.setCtid(ctid);
		
		cs.addCart(c);
		
		return "";
	}
}
