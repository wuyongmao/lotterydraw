package com.chenyuantech.lotterydraw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface DRAW_EMP_ExtMapper {
	/**
	 * 获取抽奖名单列表排除已中奖名单
	 * 
	 * @return
	 */
	@Select(" SELECT  SUBSTR(e.gem02 ,5)|| '#'|| e.gen02 || '#'|| e.gen01 || '#' AS emp FROM draw_emp e  WHERE    e.gen01 NOT IN (  SELECT r.gen01 FROM DRAW_RECORD r  ) AND e.genacti='Y'  ")
	List<String> getemp();

}