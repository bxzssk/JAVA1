package com.qa.springboot.service;

import java.util.List;

import com.qa.springboot.pojo.Goodsimage;

public interface GoodsImageService {
	//获取所有图片
	List<Goodsimage> queryAll(int offset,int limit);
	//根据gdid查询
	Goodsimage queryGoodsImage(int gdid);
}
