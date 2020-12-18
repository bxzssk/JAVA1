package com.qa.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.GoodsinfoMapper;
import com.qa.springboot.pojo.Goodsinfo;
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{

	@Autowired
	GoodsinfoMapper gm;
	
	@Override
	public Goodsinfo queryGoodsInfoByGdid(int gdid) {
		
		return gm.selectByPrimaryKey(gdid);
	}

}
