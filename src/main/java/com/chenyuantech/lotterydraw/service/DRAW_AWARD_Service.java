package com.chenyuantech.lotterydraw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.lotterydraw.bean.DRAW_AWARD;
import com.chenyuantech.lotterydraw.bean.DRAW_AWARDExample;
import com.chenyuantech.lotterydraw.dao.DRAW_AWARDMapper;
import com.chenyuantech.lotterydraw.dao.DRAW_Ext_AWARDMapper;

/**
 * 奖项参数设定服务
 * 年度 奖项等级  奖品 数目
 * @author yongmao.wu
 *
 */
@Service
public class DRAW_AWARD_Service {

	@Autowired
	private DRAW_AWARDMapper draw_AWARDMapper;
	@Autowired
	private DRAW_Ext_AWARDMapper draw_Ext_AWARDMapper;	
	@Autowired
	DRAW_AWARDExample draw_AWARDExample;

	
	public List<DRAW_AWARD> selectDRAW_AWARDS() {
		return draw_Ext_AWARDMapper.selectDRAW_AWARDS();
	}
	
	/**
	 * 奖项添加
	 * @param record
	 * @return
	 */
	public int insert(DRAW_AWARD record) {
	 return	draw_AWARDMapper.insertSelective(record);
	}
	
	/**
	 * 奖项更新
	 * @param record
	 * @return
	 */
	public int update(DRAW_AWARD record){
		return draw_AWARDMapper.updateByPrimaryKeySelective(record);
		
		
	}
	
	/**
	 * 奖项删除
	 * @param record
	 * @return
	 */
	public int delete(DRAW_AWARD record) {
		return draw_AWARDMapper.deleteByPrimaryKey(record);
	}
	 
	/**
	 * 奖项查询
	 * @param record
	 * @return
	 */
	public List<DRAW_AWARD> getAwards(DRAW_AWARD record){
		draw_AWARDExample.clear(); 
		draw_AWARDExample.createCriteria().andNDEqualTo(record.getND());
		return draw_AWARDMapper.selectByExample(draw_AWARDExample);
	}
	
	 
		/**
		 * 奖项查询
		 * @param record
		 * @return
		 */
		public List<DRAW_AWARD> getAwardAll(){
			draw_AWARDExample.clear();   
			draw_AWARDExample.createCriteria().andFLAGEqualTo("Y");
			draw_AWARDExample.setOrderByClause("ITEM");
			 return draw_AWARDMapper.selectByExample(draw_AWARDExample);
		}
		
		
		
		
		
	
	
	
}
