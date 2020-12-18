package com.qa.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.User;
import com.qa.springboot.pojo.Userinfo;
import com.qa.springboot.pojo.Usertype;
import com.qa.springboot.service.UserInfoService;
import com.qa.springboot.service.UserService;
import com.qa.springboot.service.UserTypeService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	UserService us;
	@Autowired
	UserInfoService uis;
	@Autowired
	UserTypeService uts;
	
	@RequestMapping("/lg")
	public Map<String, Object> login(String username,String password){
		
		System.out.println(username+","+password);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		User user = us.login(username, password);
		if(user!=null){
			//用户ID
			Integer userid = user.getUserid();
			//用户等级ID
			Integer utid = user.getUtid();
			
			Userinfo userInfo = uis.queryUserInfo(userid);
			
			Usertype userType = uts.queryUserType(utid);
			
			map.put("userinfo", userInfo);
			
			map.put("usertype", userType);
		}else{
			map.put("msg", "账号或密码错误");
		}
		
		return map;
	}
}
