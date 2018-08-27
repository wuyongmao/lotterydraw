package com.chenyuantech.lotterydraw.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.lotterydraw.bean.DRAW_RECORD;
import com.chenyuantech.lotterydraw.service.DRAW_EMP_Service;
import com.chenyuantech.lotterydraw.service.DRAW_RECORD_Service;
import com.chenyuantech.lotterydraw.service.DRAW_USER_Service;
import com.chenyuantech.lotterydraw.utils.WeChat;

/**
 * 
 * @author yongmao.wu
 *
 */
@RequestMapping("/wechar")
@Controller
public class WecharController {
	@Autowired
	private DRAW_USER_Service draw_USER_Service;
	@Autowired
	private DRAW_RECORD_Service record_Service;

	@Autowired
	DRAW_EMP_Service draw_EMP_Service;

	@RequestMapping("/touser")
	@ResponseBody
	public String wecharTouser(@RequestBody DRAW_RECORD record) {
		// 测试文本消息发送功能
		WeChat.ACCESS_TOKEN = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET))
				.get("access_token").getAsString();
		if (record != null) {
			// System.out.print("推送人--------------" + record);
			StringBuilder msg = new StringBuilder();

			msg.append("恭喜您，你中了" + record.getAWARD_LEVEL() + " )");

			// return WeChat.sendTextMsg("6066", msg, WeChat.TOMYJOBS4);
			return WeChat.sendTextMsg(record.getGEN01(), msg, WeChat.TOMYJOBS4);

		}
		return "fail";

	}

	/**
	 * 微信全部推送
	 * 
	 * @param record
	 * @return
	 */
	@RequestMapping("/tousers")
	@ResponseBody
	public String wecharTousers(@RequestBody DRAW_RECORD record) {
		// 测试文本消息发送功能
		WeChat.ACCESS_TOKEN = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET))
				.get("access_token").getAsString();
		List<DRAW_RECORD> rList = record_Service.selectByExample(record);
		int count = 0;
		for (DRAW_RECORD r : rList) {
			StringBuilder msg = new StringBuilder();
			msg.append(r.getGEN01() + "恭喜您，你中了" + r.getAWARD_LEVEL() + "");
			// System.out.println(msg);

			if (WeChat.sendTextMsg(r.getGEN01(), msg, WeChat.TOMYJOBS4).equalsIgnoreCase("ok")) {
				count++;
			}

		}
		if (count > 2) {
			return "success";
		} else {
			return "fail";
		}

	}

	/**
	 * 微信全部推送(按照奖项推送)
	 * 
	 * @param record
	 * @return
	 */
	@RequestMapping("/tousers2")
	@ResponseBody
	public String wecharTousers2(@RequestBody DRAW_RECORD record) {
		// 测试文本消息发送功能
		WeChat.ACCESS_TOKEN = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET))
				.get("access_token").getAsString();
		List<DRAW_RECORD> rList = record_Service.selectByExample2(record);
		StringBuilder msg = new StringBuilder();
		StringBuilder user = new StringBuilder();

		for (DRAW_RECORD r : rList) {
			user.append("|").append(r.getGEN01());
		}
		msg.append("恭喜您，你中了" + record.getAWARD_LEVEL() + "");
		if (WeChat.sendTextMsg(user.toString(), msg, WeChat.TOMYJOBS4).equalsIgnoreCase("ok")) {

			return "success";
		}
		return "fail";

	}

	/**
	 * 微信全部推送(按照奖项推送,名单)
	 * 
	 * @param record
	 * @return
	 */
	@RequestMapping("/tousers3")
	@ResponseBody
	public String wecharTousers3(@RequestBody DRAW_RECORD record) {
		if (record == null) {
			return "fail";
		}
		{
			if (record.getAWARD_LEVEL() == null) {
				return "fail";
			}
		}

		// 测试文本消息发送功能
		WeChat.ACCESS_TOKEN = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET))
				.get("access_token").getAsString();

		String ttString = record.getAWARD_LEVEL();
		StringBuilder user = new StringBuilder();
		StringBuilder user2 = new StringBuilder();

		String response = "fail";

		user.append(ttString + "中奖名单:\n");
		System.out.println(user);
		List<LinkedHashMap<String, Object>> lls = record_Service.getRecordList3(ttString);
		int count = 1;
		int count_size = 0;
		for (LinkedHashMap<String, Object> llHashMap : lls) {
			user2.append(  llHashMap.get("GEM02") + "   " + llHashMap.get("GEN01") + "  " + llHashMap.get("GEN02") + "  \n");
			count++;
			count_size++;

			if (count > 50) {
				user = new StringBuilder(ttString + "中奖名单:\n");
				 user.append(user2) ;
				 //response=WeChat.sendTextMsgToUser("6066", user);
				 response=WeChat.sendTextMsgToAll(  user);
				user2 = new StringBuilder();
				count = 1;

			} else {
				if (lls.size() == count_size) {
					user = new StringBuilder(ttString + "中奖名单:\n");
					 user.append(user2) ;
					 //response=WeChat.sendTextMsgToUser("6066", user);
						response=WeChat.sendTextMsgToAll(  user);

				}

			}

		}
		if (response.equalsIgnoreCase("ok")) {
			return "success";
		}
		return "fail";

	}

}
