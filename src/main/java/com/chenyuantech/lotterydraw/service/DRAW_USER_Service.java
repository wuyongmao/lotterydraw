package com.chenyuantech.lotterydraw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.lotterydraw.bean.DRAW_USER;
import com.chenyuantech.lotterydraw.dao.DRAW_USERMapper;

/**
 * 用户信息维护
 * @author yongmao.wu
 *
 */
@Service
public class DRAW_USER_Service {

	@Autowired
	private DRAW_USERMapper draw_USERMapper;
	
	public DRAW_USER getDRAW_USER(String ZX01){
		return draw_USERMapper.selectByPrimaryKey(ZX01);
	}
	
	
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public int update(DRAW_USER record){
		return draw_USERMapper.updateByPrimaryKeySelective(record);

	}
	
	/**
	 * 新增用户
	 * @param record
	 * @return
	 */
	public int insert(DRAW_USER record){
		return draw_USERMapper.insertSelective(record);
	}
	
	/**
	 * 删除用户
	 * @param record
	 * @return
	 */
	public int delete(DRAW_USER record){
		return draw_USERMapper.deleteByPrimaryKey(record.getZX01());
	}


	public boolean checkUser(DRAW_USER user) {
		DRAW_USER user2= draw_USERMapper.selectByPrimaryKey(user.getZX01()) ;
		
		if( user2 !=null){
			if(user.getPASSWORD().equals(user2.getPASSWORD()) && user.getZX01().equals(user2.getZX01()) ){
				return true;
			}
			
		}
		
		return false;
	}
	
	
}
