package com.chenyuantech.lotterydraw.dao;

import com.chenyuantech.lotterydraw.bean.DRAW_EMP;
import com.chenyuantech.lotterydraw.bean.DRAW_EMPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DRAW_EMPMapper {
    long countByExample(DRAW_EMPExample example);

    int deleteByExample(DRAW_EMPExample example);

    int deleteByPrimaryKey(String GEN01);

    int insert(DRAW_EMP record);

    int insertSelective(DRAW_EMP record);

    List<DRAW_EMP> selectByExample(DRAW_EMPExample example);

    DRAW_EMP selectByPrimaryKey(String GEN01);

    int updateByExampleSelective(@Param("record") DRAW_EMP record, @Param("example") DRAW_EMPExample example);

    int updateByExample(@Param("record") DRAW_EMP record, @Param("example") DRAW_EMPExample example);

    int updateByPrimaryKeySelective(DRAW_EMP record);

    int updateByPrimaryKey(DRAW_EMP record);
}