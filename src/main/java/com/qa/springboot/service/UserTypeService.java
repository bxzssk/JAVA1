package com.qa.springboot.service;

import com.qa.springboot.pojo.Usertype;

public interface UserTypeService {
	//根据用户等级ID查询等级
	Usertype queryUserType(int utid);
}
