package com.chenyuantech.lotterydraw.utils;

import java.util.TimerTask;
import javax.servlet.ServletContext;

import com.google.gson.JsonObject;

public class CYWechatTokenTask extends TimerTask {
	private static boolean isRunning = false;

	private ServletContext context = null;

	public CYWechatTokenTask() {
		super();
	}

	public CYWechatTokenTask(ServletContext context) {
		this.context = context;
	}

	@Override
	public void run() {
		//1.获取access_token
		JsonObject tokenObj = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET));
		WeChat.ACCESS_TOKEN = tokenObj.get("access_token").getAsString();
	}
}





