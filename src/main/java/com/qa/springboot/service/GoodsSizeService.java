package com.qa.springboot.service;

import java.util.List;

import com.qa.springboot.pojo.Goodssize;

public interface GoodsSizeService {
	//获取所有尺码
	List<Goodssize> queryAllSize();
	
	//根据ID获取尺码
	String querySize(int gsid);
}
