package com.qa.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.UsertypeMapper;
import com.qa.springboot.pojo.Usertype;
@Service
public class UserTypeServiceImpl implements UserTypeService{

	@Autowired
	UsertypeMapper um;
	
	@Override
	public Usertype queryUserType(int utid) {
		
		return um.selectByPrimaryKey(utid);
	}

}
