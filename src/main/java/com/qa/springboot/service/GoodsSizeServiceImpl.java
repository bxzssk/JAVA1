package com.qa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.GoodssizeMapper;
import com.qa.springboot.pojo.Goodssize;

@Service
public class GoodsSizeServiceImpl implements GoodsSizeService{
	
	@Autowired
	GoodssizeMapper gm;
	
	@Override
	public List<Goodssize> queryAllSize() {
		
		return gm.selectByExample(null);
	}

	@Override
	public String querySize(int gsid) {
		
		return gm.selectSizeByGsid(gsid);
	}

}
