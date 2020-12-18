package com.qa.springboot.service;

import com.qa.springboot.pojo.Userinfo;

public interface UserInfoService {
	//根据用户ID查询用户详情
	Userinfo queryUserInfo(int userid);
	
	//注册
	void addUserinfo(Userinfo userinfo);
}
