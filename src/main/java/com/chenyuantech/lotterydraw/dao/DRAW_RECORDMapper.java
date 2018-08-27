package com.chenyuantech.lotterydraw.dao;

import com.chenyuantech.lotterydraw.bean.DRAW_RECORD;
import com.chenyuantech.lotterydraw.bean.DRAW_RECORDExample;
import com.chenyuantech.lotterydraw.bean.DRAW_RECORDKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DRAW_RECORDMapper {
    long countByExample(DRAW_RECORDExample example);

    int deleteByExample(DRAW_RECORDExample example);

    int deleteByPrimaryKey(DRAW_RECORDKey key);

    int insert(DRAW_RECORD record);

    int insertSelective(DRAW_RECORD record);

    List<DRAW_RECORD> selectByExample(DRAW_RECORDExample example);

    DRAW_RECORD selectByPrimaryKey(DRAW_RECORDKey key);

    int updateByExampleSelective(@Param("record") DRAW_RECORD record, @Param("example") DRAW_RECORDExample example);

    int updateByExample(@Param("record") DRAW_RECORD record, @Param("example") DRAW_RECORDExample example);

    int updateByPrimaryKeySelective(DRAW_RECORD record);

    int updateByPrimaryKey(DRAW_RECORD record);
}