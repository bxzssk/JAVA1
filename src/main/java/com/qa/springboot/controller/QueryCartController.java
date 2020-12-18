package com.qa.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.Cart;
import com.qa.springboot.pojo.Goodsimage;
import com.qa.springboot.pojo.Goodsinfo;
import com.qa.springboot.pojo.Storeinfo;
import com.qa.springboot.service.CartService;
import com.qa.springboot.service.GoodsImageService;
import com.qa.springboot.service.GoodsInfoService;
import com.qa.springboot.service.GoodsPriceService;
import com.qa.springboot.service.GoodsSizeService;
import com.qa.springboot.service.StoreInfoService;

@RestController
@RequestMapping("/queryCartController")
public class QueryCartController {
	
	@Autowired
	CartService cs;
	
	@Autowired
	StoreInfoService ss;
	
	@Autowired
	GoodsInfoService gis;
	
	@Autowired
	GoodsImageService gs;
	
	@Autowired
	GoodsPriceService gps;
	
	@Autowired
	GoodsSizeService gss;
	
	@RequestMapping("/cart")
	public Map<String, Object> query(Integer userid,Integer utid){
		Map<String, Object> map = new HashMap<>();
			
		List<Cart> list = cs.queryCart(userid);
		//店铺对象集合
		List<Storeinfo> storeinfos= new ArrayList<>();
		//商品详情对象集合
		List<Goodsinfo> goodsinfos= new ArrayList<>();
		//商品图片对象集合
		List<Goodsimage> goodsimages= new ArrayList<>();
		//原价集合
		List<Double> yprices= new ArrayList<>();
		//折后价集合
		List<Double> zprices= new ArrayList<>();
		//数量集合
		List<Integer> counts= new ArrayList<>();
		//尺码集合
		List<String> sizes= new ArrayList<>();
		//存储店铺ID
		Set<Integer> sid=new HashSet<>();
		
		if(list!=null){
			for (Cart cart : list) {
				//店铺对象集合
				Integer stid = cart.getStid();
				sid.add(stid);
				//商品详情对象集合
				Integer gdid = cart.getGdid();
				Goodsinfo goodsinfo = gis.queryGoodsInfoByGdid(gdid);
				goodsinfos.add(goodsinfo);
				//商品图片对象集合
				Goodsimage goodsimage = gs.queryGoodsImage(gdid);
				goodsimages.add(goodsimage);
				//原价集合
				Double uprice = gps.queryPrice(gdid, 1);
				yprices.add(uprice);
				//折后价集合
				Double zprice = gps.queryPrice(gdid, utid);
				zprices.add(zprice);
				//数量集合
				Integer gdcount = cart.getGdcount();
				counts.add(gdcount);
				//尺码集合
				Integer gsid = cart.getGsid();
				String size = gss.querySize(gsid);
				sizes.add(size);
			}
		}
		for (Integer id : sid) {
			Storeinfo storeinfo = ss.queryStoreInfo(id);
			storeinfos.add(storeinfo);
		}
		
		map.put("storeinfos", storeinfos);
		map.put("goodsinfos", goodsinfos);
		map.put("goodsimages", goodsimages);
		map.put("yprices", yprices);
		map.put("zprices", zprices);
		map.put("counts", counts);
		map.put("sizes", sizes);
		return map;
		
	}
}
