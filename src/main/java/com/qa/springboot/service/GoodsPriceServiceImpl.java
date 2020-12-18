package com.qa.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.GoodspriceMapper;

@Service
public class GoodsPriceServiceImpl implements GoodsPriceService{
	
	@Autowired
	GoodspriceMapper gm;
	
	@Override
	public Double queryPrice(int gdid, int utid) {
		
		return gm.selectPrice(gdid, utid);
	}

}
