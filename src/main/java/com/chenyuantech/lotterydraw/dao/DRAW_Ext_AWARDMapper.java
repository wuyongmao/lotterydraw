package com.chenyuantech.lotterydraw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chenyuantech.lotterydraw.bean.DRAW_AWARD;


public interface DRAW_Ext_AWARDMapper  { 
	
/*	
	@Select(" WITH rd AS  (SELECT r.nd,r.award_level ,COUNT(1) nums "
			+ "FROM draw_record  r GROUP BY  r.nd,r.award_level ) "
			+ " SELECT a.nd,  a.award_level, a.award,  a.award_num - nvl(nums,0) AS  \"award_NUM\",       "
			+ " a.item, a.flag, a.everynum,  a.manager  FROM DRAW_AWARD a                          "
			+ " LEFT JOIN  rd ON a.nd=rd.nd AND a.award_level=rd.award_level ORDER BY a.item       " )*/
	List<DRAW_AWARD> selectDRAW_AWARDS();
	
	
	  
	
}