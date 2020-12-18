package com.qa.springboot.service;

import com.qa.springboot.pojo.Goodsinfo;

public interface GoodsInfoService {
	//根据商品ID查询商品对象
	Goodsinfo queryGoodsInfoByGdid(int gdid);
}
