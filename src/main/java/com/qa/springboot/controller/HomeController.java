package com.qa.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.Goodsimage;
import com.qa.springboot.service.GoodsImageService;

@RestController
@RequestMapping("/homeController")
public class HomeController {
	
	@Autowired
	GoodsImageService gs;
	
	@RequestMapping("/home")
	public Map<String, Object> home(Integer offset,Integer limit){
		
		System.out.println(offset+","+limit);
		
		Map<String, Object> map = new HashMap<>();
		
		List<Goodsimage> list = gs.queryAll(offset, limit);
		
		map.put("imgs", list);
		
		return map;
	}
}
