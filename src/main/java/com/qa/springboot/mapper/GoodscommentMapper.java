package com.qa.springboot.mapper;

import com.qa.springboot.pojo.Goodscomment;
import com.qa.springboot.pojo.GoodscommentExample;
import com.qa.springboot.pojo.GoodscommentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodscommentMapper {
    int countByExample(GoodscommentExample example);

    int deleteByExample(GoodscommentExample example);

    int deleteByPrimaryKey(GoodscommentKey key);

    int insert(Goodscomment record);

    int insertSelective(Goodscomment record);

    List<Goodscomment> selectByExampleWithBLOBs(GoodscommentExample example);

    List<Goodscomment> selectByExample(GoodscommentExample example);

    Goodscomment selectByPrimaryKey(GoodscommentKey key);

    int updateByExampleSelective(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByExample(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByPrimaryKeySelective(Goodscomment record);

    int updateByPrimaryKeyWithBLOBs(Goodscomment record);

    int updateByPrimaryKey(Goodscomment record);
}