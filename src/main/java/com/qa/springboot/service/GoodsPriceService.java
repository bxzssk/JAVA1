package com.qa.springboot.service;

public interface GoodsPriceService {
	//根据商品ID和用户等级查询商品价格
	Double queryPrice(int gdid,int utid);
}
