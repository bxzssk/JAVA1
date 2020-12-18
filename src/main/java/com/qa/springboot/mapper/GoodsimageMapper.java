package com.qa.springboot.mapper;

import com.qa.springboot.pojo.Goodsimage;
import com.qa.springboot.pojo.GoodsimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsimageMapper {
    int countByExample(GoodsimageExample example);

    int deleteByExample(GoodsimageExample example);

    int deleteByPrimaryKey(Integer gimgid);

    int insert(Goodsimage record);

    int insertSelective(Goodsimage record);

    List<Goodsimage> selectByExample(GoodsimageExample example);

    Goodsimage selectByPrimaryKey(Integer gimgid);

    int updateByExampleSelective(@Param("record") Goodsimage record, @Param("example") GoodsimageExample example);

    int updateByExample(@Param("record") Goodsimage record, @Param("example") GoodsimageExample example);

    int updateByPrimaryKeySelective(Goodsimage record);

    int updateByPrimaryKey(Goodsimage record);
    
    List<Goodsimage> selectImgs(@Param("offset")int offset,@Param("limit")int limit);
    
    Goodsimage selectGoodsImageByGdid(int  gdid);
}