package com.chenyuantech.lotterydraw.test;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
//import org.apache.commons.lang.StringUtils;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenyuantech.lotterydraw.bean.DRAW_EMP;
import com.chenyuantech.lotterydraw.dao.DRAW_EMP_ExtMapper;
import com.chenyuantech.lotterydraw.service.DRAW_AWARD_Service;
import com.chenyuantech.lotterydraw.service.DRAW_EMP_Service;
import com.chenyuantech.lotterydraw.service.DRAW_RECORD_Service;
import com.chenyuantech.lotterydraw.service.DRAW_USER_Service;
import com.chenyuantech.lotterydraw.utils.WeChat;
import com.google.gson.JsonObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

/**
 * 测试dao层的工作 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件 1、导入SpringTest模块 2、@ContextConfiguration指定Spring配置文件的位置
 * 3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	@Autowired
	private DRAW_USER_Service draw_USER_Service;

	@Autowired
	private DRAW_EMP_ExtMapper draw_EMP_ExtMapper;

	@Autowired
	private DRAW_EMP_Service servicee;

	@Autowired
	private DRAW_AWARD_Service draw_AWARD_Service;

	@Autowired
	private DRAW_RECORD_Service record_Service;

	 
	public void getUser() {
		// 测试文本消息发送功能
		JsonObject tokenObj = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET)
				.replace("USERID", "6066"));
		String tk = WeChat.ACCESS_TOKEN = tokenObj.get("access_token").getAsString();

		System.out.println(tk);
		System.out.println(WeChat.userget.replace("MYACCESSTOKEN", tk).replace("USERID", "6066"));

		JsonObject ju = WeChat.weixin_get(WeChat.userget.replace("MYACCESSTOKEN", tk).replace("USERID", "6066"));
		System.out.println(ju);
		System.out.println(ju.get("name").getAsString());
		System.out.println(ju.get("mobile").getAsString());

	}
	
	 
	public JsonObject getJsonObject() {
		// 测试文本消息发送功能
		JsonObject tokenObj = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET)
				.replace("USERID", "6066"));
		String tk = WeChat.ACCESS_TOKEN = tokenObj.get("access_token").getAsString();

		System.out.println(tk);
		System.out.println(WeChat.userget.replace("MYACCESSTOKEN", tk).replace("USERID", "6066"));

		JsonObject ju = WeChat.weixin_get(WeChat.userget.replace("MYACCESSTOKEN", tk).replace("USERID", "6593"));
	      return ju;

	}

	@Test
	public void getUserPic() {

		try {
			 
			String content = "BEGIN:VCARD\n" + "VERSION:3.0\n" + "N:吴永茂\n" + "EMAIL:1606841559@qq.com\n" + "TEL:12345678912" + "TEL;CELL:12345678912"
					+ "ADR:山东济南齐鲁软件园\n" + "ORG:" + "济南\n" + "TITLE:软件工程师\n" + "URL:http://blog.csdn.net/lidew521\n" + "NOTE:呼呼测试下吧。。。\n"
					+ "END:VCARD";
			String path = "E:/名片/";

//			
//			{"errcode":0,"errmsg":"ok","userid":"4897","name":"覃雪锋","department":[31,92]
//					,"position":"","mobile":"17089792673","gender":"2"
//						,"email":"","avatar":"http://shp.qpic.cn/bizmp/6FHxXoxTIrYjWHDCOdLicQS0h1rObR9TPv25jYm9GQExXgpf8vxFWgA/"
//							,"status":1,"isleader":0,"extattr":{"attrs":[{"name":"入职时间","value":""},{"name":"分机号","value":""}
//							,{"name":"短号","value":""},{"name":"阳历生日","value":""}
//							,{"name":"手机号所属运营商","value":""}]}
//			,"english_name":"","telephone":"","enable":1,"hide_mobile":0,"order":[0,0]}
			content="BEGIN:VCARD\n" + "VERSION:3.0\n" + "N:"+ getJsonObject().get("name").getAsString()+ "\n"+
 				//	"PHOTO;VALUE=uri:"+getJsonObject().get("avatar").getAsString()+"\n"+
					"TITLE:中山辰元"  +"\n"+
 					"TEL:"+ getJsonObject().get("mobile").getAsString()+"\nEND:VCARD";
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400, hints);
			File file1 = new File(path, getJsonObject().get("name").getAsString()+".jpg");

			MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);
			
			System.out.println(getJsonObject());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// @Test
	public void tetsda() {

		String ttString = "纪念奖";
		StringBuilder user = new StringBuilder();
		StringBuilder user2 = new StringBuilder();

		user.append(ttString + "中奖名单:\n");
		System.out.println(user);
		List<LinkedHashMap<String, Object>> lls = record_Service.getRecordList3(ttString);
		int count = 1;
		int count_size = 0;
		for (LinkedHashMap<String, Object> llHashMap : lls) {

			user2.append(count + " " + llHashMap.get("GEM02") + "   " + llHashMap.get("GEN01") + "  " + llHashMap.get("GEN02") + "  \n");
			count++;
			count_size++;

			if (count > 4) {
				user = new StringBuilder(ttString + "中奖名单:\n");
				System.out.println(user.append(user2));
				user2 = new StringBuilder();
				count = 1;

			} else {
				if (lls.size() == count_size) {
					user = new StringBuilder(ttString + "中奖名单:\n");
					System.out.println(user.append(user2));
				}

			}

		}

	}

	// @Test
	public void mainw() {
		// 测试文本消息发送功能
		JsonObject tokenObj = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET));
		String tk = WeChat.ACCESS_TOKEN = tokenObj.get("access_token").getAsString();
		System.out.println(tk);
		StringBuilder msg = new StringBuilder();
		msg.append("1月27日参加抽奖人员名单(此名单人员为2017年09月30日前入职，请知悉)");
		// String responseMsg = WeChat.sendTextMsg("6066",msg,WeChat.TOMYJOBS5);
		// System.out.println(responseMsg);

		List<DRAW_EMP> emps = servicee.getEMPS();
		for (DRAW_EMP e : emps) {
			msg = new StringBuilder();
			msg.append("1月27日参加抽奖人员名单(此名单人员为2017年09月30日前入职，请知悉)");
			String responseMsg = WeChat.sendTextMsg(e.getGEN01(), msg, WeChat.TOMYJOBS5);
			System.out.println(e.getGEN01() + "---" + responseMsg);

		}

		// System.out.println(WeChat.getUserIdByCode("YH8cqXBFHUoHl3d8G_-nRG4m2H2Co3Gp7QC0AmGZl8A")
		// );

	}

	// @Test
	public void getdraw_user() {
		System.out.print(draw_USER_Service.getDRAW_USER("2929"));
	}

	// @Test
	public void getemp() {
		List<String> ls = draw_EMP_ExtMapper.getemp();
		System.out.println(ls.size());
	}

}
