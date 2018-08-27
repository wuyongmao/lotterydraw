package com.chenyuantech.lotterydraw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.lotterydraw.bean.DRAW_AWARD;
import com.chenyuantech.lotterydraw.bean.DRAW_RECORD;
import com.chenyuantech.lotterydraw.bean.DRAW_USER;
import com.chenyuantech.lotterydraw.service.DRAW_AWARD_Service;
import com.chenyuantech.lotterydraw.service.DRAW_EMP_Service;

@Controller
public class DRAW_AWARD_Controller {
	@Autowired
	private DRAW_AWARD_Service draw_AWARD_Service;

	@RequestMapping("/getaward")
	@ResponseBody
	public List<DRAW_AWARD> getaward() {
		return draw_AWARD_Service.getAwardAll();
	}

	
	
	
	@RequestMapping("/getaward2")
	@ResponseBody
	public List<DRAW_AWARD> getaward2() {
		return draw_AWARD_Service.selectDRAW_AWARDS();
	}
	
	
	@RequestMapping(value = "/addaward", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public int insertAward(@RequestBody DRAW_AWARD record) {
		//System.out.println(record);

		return draw_AWARD_Service.insert(record);
	}

	@RequestMapping(value = "/updateaward", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public int updatetAward(@RequestBody DRAW_AWARD record) {
		//System.out.println(record);

		return draw_AWARD_Service.update(record);
	}

}
