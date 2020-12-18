package com.qa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.mapper.GoodsimageMapper;
import com.qa.springboot.pojo.Goodsimage;
@Service
public class GoodsImageServiceImpl implements GoodsImageService{

	@Autowired
	GoodsimageMapper gm;
	
	@Override
	public List<Goodsimage> queryAll(int offset, int limit) {
		
		return gm.selectImgs(offset, limit);
	}

	@Override
	public Goodsimage queryGoodsImage(int gdid) {
		
		return gm.selectGoodsImageByGdid(gdid);
	}

}
