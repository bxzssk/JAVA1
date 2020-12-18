package com.qa.springboot.service;

import com.qa.springboot.pojo.User;

public interface UserService {
	//登录
	User login(String username,String password);
	//验证账号是否存在
	boolean checkLogname(String name);
	
	//注册、
	void addUser(User user);
}
