package com.chenyuantech.lotterydraw.dao;

import com.chenyuantech.lotterydraw.bean.DRAW_AWARD;
import com.chenyuantech.lotterydraw.bean.DRAW_AWARDExample;
import com.chenyuantech.lotterydraw.bean.DRAW_AWARDKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DRAW_AWARDMapper {
    long countByExample(DRAW_AWARDExample example);

    int deleteByExample(DRAW_AWARDExample example);

    int deleteByPrimaryKey(DRAW_AWARDKey key);

    int insert(DRAW_AWARD record);

    int insertSelective(DRAW_AWARD record);

    List<DRAW_AWARD> selectByExample(DRAW_AWARDExample example);

    DRAW_AWARD selectByPrimaryKey(DRAW_AWARDKey key);

    int updateByExampleSelective(@Param("record") DRAW_AWARD record, @Param("example") DRAW_AWARDExample example);

    int updateByExample(@Param("record") DRAW_AWARD record, @Param("example") DRAW_AWARDExample example);

    int updateByPrimaryKeySelective(DRAW_AWARD record);

    int updateByPrimaryKey(DRAW_AWARD record);
}