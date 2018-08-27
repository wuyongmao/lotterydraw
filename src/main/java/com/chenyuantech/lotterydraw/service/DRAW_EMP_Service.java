package com.chenyuantech.lotterydraw.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chenyuantech.lotterydraw.bean.DRAW_EMP;
import com.chenyuantech.lotterydraw.dao.DRAW_EMPMapper;
import com.chenyuantech.lotterydraw.dao.DRAW_EMP_ExtMapper;

/**
 * 员工部门信息表 姓名 工号 部门 有效标记
 * 
 * @author yongmao.wu
 *
 */
@Service
public class DRAW_EMP_Service {

	@Autowired
	private DRAW_EMPMapper draw_empMapper;
	@Autowired
	private DRAW_EMP_ExtMapper draw_EMP_ExtMapper;

	public List<String> getemp() {
		return draw_EMP_ExtMapper.getemp();
	}

	public DRAW_EMP getDRAW_EMP(String GEN01) {
		return draw_empMapper.selectByPrimaryKey(GEN01);
	}

	/**
	 * 员工添加
	 * 
	 * @param record
	 * @return
	 */
	public int insert(DRAW_EMP record) {
		return draw_empMapper.insertSelective(record);
	}

	/**
	 * 员工更新
	 * 
	 * @param record
	 * @return
	 */
	public int update(DRAW_EMP record) {
		return draw_empMapper.updateByPrimaryKeySelective(record);

	}

	/**
	 * 删除
	 * 
	 * @param record
	 * @return
	 */
	public int delete(String GEN01) {
		return draw_empMapper.deleteByPrimaryKey(GEN01);
	}

	/**
	 * 员工查询
	 * 
	 * @param record
	 * @return
	 */
	public List<DRAW_EMP> getEMPS( ) {

		return draw_empMapper.selectByExample(null);
	}

}
