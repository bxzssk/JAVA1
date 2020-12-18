package com.qa.springboot.service;

import com.qa.springboot.pojo.Storeinfo;

public interface StoreInfoService {
	//根据店铺ID获取店铺对象
	Storeinfo queryStoreInfo(int stid);
}
