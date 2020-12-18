package com.qa.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.Goodsinfo;
import com.qa.springboot.pojo.Goodssize;
import com.qa.springboot.pojo.Storeinfo;
import com.qa.springboot.service.GoodsInfoService;
import com.qa.springboot.service.GoodsPriceService;
import com.qa.springboot.service.GoodsSizeService;
import com.qa.springboot.service.StoreInfoService;

@RestController
@RequestMapping("/goodsInfoPage")
public class GoodsInfoPage {
	
	@Autowired
	GoodsInfoService gs;
	
	@Autowired
	GoodsPriceService gps;
	
	@Autowired
	StoreInfoService ss;
	
	@Autowired
	GoodsSizeService gss;
	
	@RequestMapping("/goodsinfo")
	public Map<String, Object> goodsinfo(@RequestParam("gdid")Integer gdid,@RequestParam(value="utid",required=false)Integer utid){
		
		System.out.println(gdid+","+utid);
		
		Map<String, Object> map = new HashMap<>();
		//获取商品详情对象
		Goodsinfo goodsinfo = gs.queryGoodsInfoByGdid(gdid);
		//获取商品价格
		//折后价
		Double zprice=null;
		if(utid!=null){
			
			zprice = gps.queryPrice(gdid, utid);
		}
		//原价
		Double yprice = gps.queryPrice(gdid, 1);
		//获取所属店铺对象
		Integer stid = goodsinfo.getStid();
		
		Storeinfo storeinfo = ss.queryStoreInfo(stid);
		
		//获取全尺码
		List<Goodssize> sizes = gss.queryAllSize();
		
	
		map.put("goodsinfo", goodsinfo);
		map.put("zprice", zprice);
		map.put("yprice", yprice);
		map.put("storeinfo", storeinfo);
		map.put("sizes", sizes);
		
		return map;
	}
}
