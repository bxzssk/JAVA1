package com.qa.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.UserinfoMapper;
import com.qa.springboot.pojo.Userinfo;
@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	UserinfoMapper um;
	
	@Override
	public Userinfo queryUserInfo(int userid) {
		
		return um.selectByPrimaryKey(userid);
	}

	@Override
	public void addUserinfo(Userinfo userinfo) {
		um.insert(userinfo);
		
	}

}
