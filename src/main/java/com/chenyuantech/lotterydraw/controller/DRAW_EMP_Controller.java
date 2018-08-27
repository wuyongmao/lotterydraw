package com.chenyuantech.lotterydraw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.lotterydraw.bean.DRAW_EMP;
import com.chenyuantech.lotterydraw.bean.DRAW_RECORD;
import com.chenyuantech.lotterydraw.bean.DRAW_USER;
import com.chenyuantech.lotterydraw.service.DRAW_EMP_Service;

@Controller
public class DRAW_EMP_Controller {
	@Autowired
	private DRAW_EMP_Service draw_EMP_Service;

	@RequestMapping("/emp")
	@ResponseBody
	public List<String> getemp() {
		return draw_EMP_Service.getemp();
	}

	@RequestMapping(value = "/addemp", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public int insertRecord(@RequestBody DRAW_EMP record) {
		// //System.out.println(record);

		return draw_EMP_Service.insert(record);
	}

	@RequestMapping(value = "/updateemp", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public int updateempRecord(@RequestBody DRAW_EMP record) {
		//System.out.println(record);

		return draw_EMP_Service.update(record);
	}

	@RequestMapping(value = "/delemp", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public int delempRecord(@RequestBody DRAW_EMP record) {
 
		return draw_EMP_Service.delete(record.getGEN01());
	}

	@RequestMapping(value = "/getemps")
	@ResponseBody
	public List<DRAW_EMP> getRecords() {

		return draw_EMP_Service.getEMPS();
	}

}
