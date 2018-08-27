package com.chenyuantech.lotterydraw.utils;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;

public class WeChat {

	public static void main(String[] args) {
		// 测试文本消息发送功能
		JsonObject tokenObj = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET));
		String tk = WeChat.ACCESS_TOKEN = tokenObj.get("access_token").getAsString();
		System.out.println(tk);
		StringBuilder msg = new StringBuilder();
		msg.append("test2(资讯部微信群发消息测试.如有打扰，请谅解)");
		String responseMsg = sendTextMsgToAll( msg);
		System.out.println(responseMsg);

		// System.out.println(WeChat.getUserIdByCode("YH8cqXBFHUoHl3d8G_-nRG4m2H2Co3Gp7QC0AmGZl8A")
		// );
	}

	// wxe810662bcb34521e
	// wxe810662bcb34521e

	// 通知测试
	// FVHHIQWrOesHe7fzd-mvHqzaDkQwEyUpmNTGSHn3ex0

	// 访客
	// H3SLNJEX0_ANfXepfO4Z4bF1Nrj_AjvETgb1Mj7kqYY

	public static final String CORPID = "wxe810662bcb34521e";
	public static final int AGENTID = 1000004;
	public static final String SECRET = "FVHHIQWrOesHe7fzd-mvHqzaDkQwEyUpmNTGSHn3ex0";
	// 发送消息的接口
	private static final String MSGSENDURI = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=MYACCESSTOKEN";

	// 获取TOKEN的接口
	public static final String GETTOKENURI = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=MYCORPID&corpsecret=MYSECRECT";

	
	// 获取用户信息的接口
	 public static final String userget = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=MYACCESSTOKEN&userid=USERID";

		
	
	// 通过code获取用户信息的接口
	private static final String GETUSERINFOBYCODE = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=MYACCESSTOKEN&code=MYCODE";

	private static final String DOMAIN = "https%3a%2f%2fwww.chenyuantech.com";
	// 消息内容中的连接导向
	// 导向待审题核页面
	// public static final String TOMYJOBS1 =
	// "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+CORPID+"&redirect_uri="+DOMAIN+"%2flotterydraw%2fw_winning.html%26response_type%3dcode%26state%3d1%26scope%3dsnsapi_base%23wechat_redirect";
	// public static final String TOMYJOBS1 =
	// "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+CORPID+"&redirect_uri="+DOMAIN+"%2flotterydraw%2fw_winning.html%26response_type%3dcode%26state%3d1%26scope%3dsnsapi_base%23wechat_redirect";
	// 导向已审核页面
	public static final String TOMYJOBS1 = "https://www.chenyuantech.com/lotterydraw/w_emps.html";
	public static final String TOMYJOBS4 = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + CORPID + "&redirect_uri=" + DOMAIN
			+ "%2flotterydraw%2fw_winning.html&response_type=code&state=1&scope=snsapi_base#wechat_redirect";
	public static final String TOMYJOBS5 = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + CORPID + "&redirect_uri=" + DOMAIN
			+ "%2flotterydraw%2fw_emps.html&response_type=code&state=1&scope=snsapi_base#wechat_redirect";
	// 导向接待中页面
	public static final String TOMYJOBS3 = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + CORPID + "&redirect_uri=" + DOMAIN
			+ "%2fvisitormgr%2fmytask.html&response_type=code&state=3&scope=snsapi_base#wechat_redirect";
	// 导向获取二维码界面
	public static final String TOQR = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + CORPID + "&redirect_uri=" + DOMAIN
			+ "%2fvisitormgr%2fqr.html&response_type=code&state=MYPICID~~MYAPPLYID&scope=snsapi_base#wechat_redirect";

	// 导向我的申请页面
	public static final String TOMYAPPLICATION = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + CORPID + "&redirect_uri=" + DOMAIN
			+ "%2fvisitormgr%2fsign.html&response_type=code&scope=snsapi_base#wechat_redirect";

	public static String ACCESS_TOKEN = "";

	public static String getUserIdByCode(String code) {
		return weixin_get(GETUSERINFOBYCODE.replace("MYACCESSTOKEN", ACCESS_TOKEN).replace("MYCODE", code)).get("UserId").getAsString();
	}

	public static String sendTextMsg(String toUser, StringBuilder msg, String toURL) {
		// 1.为消息休添加链接
		if (!toURL.equals("")) {
			msg.append("<a href='" + toURL + "'>详情</a>");
		}

		// 2.组织消息体
		JsonObject json = createNews(toUser, "", MSGSENDURI, msg.toString());

		// 3.发送消息
		JsonObject responsedObj = weixin_post(MSGSENDURI.replace("MYACCESSTOKEN", ACCESS_TOKEN), json.toString());

		// 4.解析返回的消息
		return responsedObj.get("errmsg").getAsString();

	}

	/**
	 * 群发消息
	 * 
	 * @param msg
	 * @return
	 */
	public static String sendTextMsgToAll(StringBuilder msg) {

		// 1.组织消息体
		JsonObject json = createNews("@all", "", MSGSENDURI, msg.toString());

		// 2.发送消息
		JsonObject responsedObj = weixin_post(MSGSENDURI.replace("MYACCESSTOKEN", ACCESS_TOKEN), json.toString());

		// 3.解析返回的消息
		return responsedObj.get("errmsg").getAsString();

	}

	/**
	 * 指定user发送消息
	 * 
	 * @param msg
	 * @return
	 */
	public static String sendTextMsgToUser(String suser, StringBuilder msg) {

		// 1.组织消息体
		JsonObject json = createNews(suser, "", MSGSENDURI, msg.toString());

		// 2.发送消息
		JsonObject responsedObj = weixin_post(MSGSENDURI.replace("MYACCESSTOKEN", ACCESS_TOKEN), json.toString());

		// 3.解析返回的消息
		return responsedObj.get("errmsg").getAsString();

	}

	public static JsonObject createNews(String touser, String toparty, String p_url, String textContent) {
		/*
		 * 官方范例 { "touser": "UserID1|UserID2|UserID3", "toparty":
		 * " PartyID1 | PartyID2 ", "totag": " TagID1 | TagID2 ", "msgtype":
		 * "text", "agentid": 1, "text": { "content":
		 * "Holiday Request For Pony(http://xxxxx)" }, "safe":0 }
		 */

		JsonObject jsonObject = new JsonObject();
		if (!touser.equals("")) {
			jsonObject.addProperty("touser", touser);
		}
		if (!toparty.equals("")) {
			jsonObject.addProperty("toparty", toparty);
		}
		jsonObject.addProperty("msgtype", "text");
		jsonObject.addProperty("agentid", AGENTID);

		JsonObject content = new JsonObject();
		content.addProperty("content", textContent);

		jsonObject.add("text", content);
		return jsonObject;
	}

	public static JsonObject weixin_get(String uri) {
		HttpClient client = new DefaultHttpClient();

		HttpGet request = new HttpGet(uri);

		try {
			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			String v_get = EntityUtils.toString(entity, "UTF-8");
			request.abort();
			return GSon.parseJson(v_get);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static JsonObject weixin_post(String uri, String json) {
		HttpClient client = new DefaultHttpClient();

		HttpPost request = new HttpPost(uri);
		StringEntity stringEntity = new StringEntity(json, "UTF-8");
		stringEntity.setContentType("application/json;charset=utf-8");
		request.setEntity(stringEntity);

		try {
			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			String v_post = EntityUtils.toString(entity, "UTF-8");
			request.abort();
			return GSon.parseJson(v_post);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
