package com.chenyuantech.lotterydraw.dao;

import com.chenyuantech.lotterydraw.bean.DRAW_USER;
import com.chenyuantech.lotterydraw.bean.DRAW_USERExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DRAW_USERMapper {
    long countByExample(DRAW_USERExample example);

    int deleteByExample(DRAW_USERExample example);

    int deleteByPrimaryKey(String ZX01);

    int insert(DRAW_USER record);

    int insertSelective(DRAW_USER record);

    List<DRAW_USER> selectByExample(DRAW_USERExample example);

    DRAW_USER selectByPrimaryKey(String ZX01);

    int updateByExampleSelective(@Param("record") DRAW_USER record, @Param("example") DRAW_USERExample example);

    int updateByExample(@Param("record") DRAW_USER record, @Param("example") DRAW_USERExample example);

    int updateByPrimaryKeySelective(DRAW_USER record);

    int updateByPrimaryKey(DRAW_USER record);
}