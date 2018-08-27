package com.chenyuantech.lotterydraw.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.lotterydraw.bean.DRAW_RECORD;
import com.chenyuantech.lotterydraw.service.DRAW_RECORD_Service;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Controller
public class DRAW_RECORD_Controller {
	@Autowired
	private DRAW_RECORD_Service draw_RECORD_Service;

	@RequestMapping("/getrecord")
	@ResponseBody
	public List<String> getrecoList() {
		return draw_RECORD_Service.getRecordList();
	}

	@RequestMapping("/getrecord4")
	@ResponseBody
	public List<String> getrecoList4(int nd,String level) {
		return draw_RECORD_Service.getRecordList4(nd  , level);
	}
	@RequestMapping("/getrecord2")
	@ResponseBody
	public List<LinkedHashMap<String, Object>> getrecoList2() {
		return draw_RECORD_Service.getRecordList2();
	}

 	@RequestMapping(value = "/updaterecord", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public int updaterecord(@RequestBody DRAW_RECORD record) {

		return draw_RECORD_Service.update(record);
	}

	@RequestMapping(value = "/addrecord", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public int insertRecord(@RequestBody DRAW_RECORD record) {
		//System.out.println(record);

		return draw_RECORD_Service.insert(record);
	}

}
