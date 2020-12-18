package com.qa.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.StoreinfoMapper;
import com.qa.springboot.pojo.Storeinfo;
@Service
public class StoreInfoServiceImpl implements StoreInfoService{
	
	@Autowired
	StoreinfoMapper sm;
	
	@Override
	public Storeinfo queryStoreInfo(int stid) {
		
		return sm.selectByPrimaryKey(stid);
	}

}
