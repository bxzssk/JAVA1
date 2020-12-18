package com.qa.springboot.mapper;

import com.qa.springboot.pojo.Keywordinfo;
import com.qa.springboot.pojo.KeywordinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordinfoMapper {
    int countByExample(KeywordinfoExample example);

    int deleteByExample(KeywordinfoExample example);

    int deleteByPrimaryKey(Integer kwid);

    int insert(Keywordinfo record);

    int insertSelective(Keywordinfo record);

    List<Keywordinfo> selectByExample(KeywordinfoExample example);

    Keywordinfo selectByPrimaryKey(Integer kwid);

    int updateByExampleSelective(@Param("record") Keywordinfo record, @Param("example") KeywordinfoExample example);

    int updateByExample(@Param("record") Keywordinfo record, @Param("example") KeywordinfoExample example);

    int updateByPrimaryKeySelective(Keywordinfo record);

    int updateByPrimaryKey(Keywordinfo record);
}