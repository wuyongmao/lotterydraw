package com.chenyuantech.lotterydraw.service;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.lotterydraw.bean.DRAW_RECORD;
import com.chenyuantech.lotterydraw.bean.DRAW_RECORDExample;
import com.chenyuantech.lotterydraw.dao.DRAW_Ext_RECORDMapper;
import com.chenyuantech.lotterydraw.dao.DRAW_RECORDMapper;

/**
 * 员工中奖纪录
 * @author yongmao.wu
 *
 */
@Service
public class DRAW_RECORD_Service {

	@Autowired
	private DRAW_RECORDMapper draw_RECORDMapper;
	
	@Autowired
	DRAW_Ext_RECORDMapper draw_Ext_RECORDMapper;
	
	@Autowired
	DRAW_RECORDExample example;

	 
	
 


	/**
	 * 查询中奖纪录  前台抽奖名单
	 * @return
	 */
	public List<String> getRecordList( ) {
		
		return draw_Ext_RECORDMapper.getrecode();
	}
	
	/**
	 * 查询中奖纪录  前台抽奖名单
	 * @param level 
	 * @param bigDecimal 
	 * @return
	 */
	public List<String> getRecordList4(  int nd,String level ) {
		
		return draw_Ext_RECORDMapper.getrecode4(nd, level);
	}
	
	/**
	 * 查询中奖纪录  后台维护展示
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getRecordList2( ) {
		
		return draw_Ext_RECORDMapper.getrecode2();
	}
	
	/**
	 * 查询中奖纪录  微信推送展示
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getRecordList3(String award_level ) {
		 
		return draw_Ext_RECORDMapper.getrecode3(award_level);
	}
	
	

	/**
	 * 查询中奖纪录    
	 * @return
	 */
	public List<DRAW_RECORD> getDRAW_RECORDS( ) {
		return draw_RECORDMapper.selectByExample(null);
	}
	
	
	public List<DRAW_RECORD> selectByExample(DRAW_RECORD record){
		example.clear();
		example.createCriteria().andNDEqualTo(record.getND()).andFLAGEqualTo(record.getFLAG());
		return draw_RECORDMapper.selectByExample(example);
	}
	
	
	public List<DRAW_RECORD> selectByExample2(DRAW_RECORD record){
		example.clear();
		example.createCriteria().andNDEqualTo(record.getND()).andFLAGEqualTo(record.getFLAG())
		.andAWARD_LEVELEqualTo(record.getAWARD_LEVEL());
		return draw_RECORDMapper.selectByExample(example);
	}

	/**
	 * 中奖纪录添加
	 * 
	 * @param record
	 * @return
	 */
	public int insert(DRAW_RECORD record) {
		return draw_RECORDMapper.insertSelective(record);
	}

	/**
	 * 员工更新
	 * 
	 * @param record
	 * @return
	 */
	public int update(DRAW_RECORD record) {
		return draw_RECORDMapper.updateByPrimaryKeySelective(record);

	}

	/**
	 * 中奖纪录删除
	 * 
	 * @param record
	 * @return
	 */
	public int delete(DRAW_RECORD record) {
		return draw_RECORDMapper.deleteByPrimaryKey(record);
	}

	/**
	 * 中奖纪录查询
	 * 
	 * @param record
	 * @return
	 */
	public List<DRAW_RECORD> getAwards(DRAW_RECORD record) {

		return draw_RECORDMapper.selectByExample(null);
	}

}
