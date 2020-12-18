package com.qa.springboot.mapper;

import com.qa.springboot.pojo.Goodsprice;
import com.qa.springboot.pojo.GoodspriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodspriceMapper {
    int countByExample(GoodspriceExample example);

    int deleteByExample(GoodspriceExample example);

    int deleteByPrimaryKey(Integer gpid);

    int insert(Goodsprice record);

    int insertSelective(Goodsprice record);

    List<Goodsprice> selectByExample(GoodspriceExample example);

    Goodsprice selectByPrimaryKey(Integer gpid);

    int updateByExampleSelective(@Param("record") Goodsprice record, @Param("example") GoodspriceExample example);

    int updateByExample(@Param("record") Goodsprice record, @Param("example") GoodspriceExample example);

    int updateByPrimaryKeySelective(Goodsprice record);

    int updateByPrimaryKey(Goodsprice record);
    
    Double selectPrice(@Param("gdid")int gdid,@Param("utid")int utid);
}