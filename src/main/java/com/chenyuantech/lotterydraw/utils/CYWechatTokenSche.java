package com.chenyuantech.lotterydraw.utils;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.google.gson.JsonObject;

@Component
@EnableAsync
@EnableScheduling
public class CYWechatTokenSche {

	@Scheduled(initialDelay = 1000, fixedDelay = 7000 * 1000)
	public void getACCESS_TOKEN() {
		// 1.获取access_token
		JsonObject tokenObj = WeChat.weixin_get(WeChat.GETTOKENURI.replace("MYCORPID", WeChat.CORPID).replace("MYSECRECT", WeChat.SECRET));
		WeChat.ACCESS_TOKEN = tokenObj.get("access_token").getAsString();
		System.out.println("-----" + WeChat.ACCESS_TOKEN);
		 
		

	}

}
