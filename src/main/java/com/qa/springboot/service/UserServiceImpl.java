package com.qa.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.UserMapper;
import com.qa.springboot.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper um;
	
	@Override
	public User login(String username, String password) {
		
		return um.selectUserByUsernameAndPassword(username, password);
	}

	@Override
	public boolean checkLogname(String name) {
		User user = um.checkLogName(name);
		if(user!=null){
			return false;
		}
		return true;
	}

	@Override
	public void addUser(User user) {
		um.insert(user);
		
	}

}
