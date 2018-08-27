package com.chenyuantech.lotterydraw.dao;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DRAW_Ext_RECORDMapper {

	/**
	 * 中奖人员名单---抽奖展示
	 * 
	 * @return
	 */
	@Select(" SELECT SUBSTR(E.GEM02, 5) || '#' || E.GEN02 || '#' || E.GEN01 || '#'|| r.award_level as recode FROM DRAW_RECORD R "
			+ " LEFT JOIN DRAW_EMP E  ON R.GEN01 = E.GEN01 "
			+ "	LEFT JOIN draw_award  a ON a.nd=r.nd AND a.award_level=r.award_level  ORDER BY a.nd,a.item ")
	List<String> getrecode();

	
	/**
	 * 中奖人员名单---抽奖展示(根据参数nd  中奖等级)
	 * 
	 * @return
	 */
	@Select(" SELECT SUBSTR(E.GEM02, 5) || '#' || E.GEN02 || '#' || E.GEN01 || '#'|| r.award_level as recode FROM DRAW_RECORD R "
			+ " LEFT JOIN DRAW_EMP E  ON R.GEN01 = E.GEN01 "
			+ "	LEFT JOIN draw_award  a ON a.nd=r.nd AND a.award_level=r.award_level"
			+ " where a.nd=${nd} AND a.award_level='${level}'  "
			+ " ORDER BY r.bgdate, a.nd,a.item ")
	List<String> getrecode4(@Param("nd")int nd,@Param("level")String level);

	/**
	 * 中奖人员名单--后台维护展示
	 * 
	 * @return
	 */
	@Select("SELECT R.ND, R.AWARD_LEVEL, R.GEN01,a.AWARD, R.FLAG, E.GEN02, E.GEM02, E.GEN03 "
			+ " FROM DRAW_RECORD R  LEFT JOIN DRAW_EMP E ON R.GEN01 = E.GEN01"
			+ "  LEFT JOIN DRAW_AWARD a ON a.nd=r.nd AND a.award_level=r.award_level ORDER BY r.nd,a.item ")
	List<LinkedHashMap<String, Object>> getrecode2();
	
	
	/**
	 * 中奖名单查询(有效)，按照等级查询
	 * @return
	 */
	@Select("  SELECT  r.gen01, e.gen02   ,  r.award_level ,SUBSTR( e.gem02,5) GEM02  FROM draw_record r LEFT JOIN draw_emp e ON e.gen01=r.gen01 " 
			+ "   AND r.flag='Y'  WHERE r.award_level='${award_level}' AND r.flag='Y'  ORDER BY r.gen01    "  )
	List<LinkedHashMap<String, Object>> getrecode3(@Param("award_level" ) String award_level);

	
	
	

}