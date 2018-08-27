package com.chenyuantech.lotterydraw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.lotterydraw.bean.DRAW_USER;
import com.chenyuantech.lotterydraw.bean.Msg;
import com.chenyuantech.lotterydraw.service.DRAW_USER_Service;

/**
 * 
 * @author yongmao.wu
 *
 */
@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private DRAW_USER_Service draw_USER_Service;
	
	@RequestMapping("/getuser")
	@ResponseBody
	public DRAW_USER getUser(String ZX01){
		return draw_USER_Service.getDRAW_USER(ZX01);
	}
 

	/**
	 * 修改密码Controller
	 * @param rq
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateuser", method = RequestMethod.POST)
	@ResponseBody
	public Msg upateUser(HttpServletRequest rq, DRAW_USER user) {
		if (user == null) {
			return Msg.fail().add("error", "用户信息未空");

		} else {
			if (user.getPASSWORD() == null) {
				return Msg.fail().add("error", "密码为空");
			} 
			if (draw_USER_Service.update(user)>0) {
				return Msg.success();
			} else {
				return Msg.fail().add("error", "用户信息未空");
			}

		}

	}

	/**
	 * 用户登录Controller
	 * @param rq
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/checklogin", method = RequestMethod.POST)
	@ResponseBody
	public Msg checklogin(HttpServletRequest rq, DRAW_USER user) {

		if (user == null) {
			return Msg.fail().add("error", "输入为空");
		} else {

			if (user.getZX01() == null) {
				return Msg.fail().add("error", "账号为空");
			}

			if (user.getPASSWORD() == null) {
				return Msg.fail().add("error", "密码为空");
			}

		}

		if (draw_USER_Service.checkUser(user)) {

			user = draw_USER_Service.getDRAW_USER(user.getZX01());

			SecurityUtils.getSubject().login(new UsernamePasswordToken(user.getZX01(), user.getPASSWORD()));

			HttpSession session = rq.getSession();
			session.setAttribute("loginuser", user);
			SecurityUtils.getSubject().getSession().setTimeout(-1000l);
			return Msg.success();

		} else {
			if (user.getPASSWORD().trim().length() == 0 || user.getZX01().trim().length() == 0) {
				return Msg.fail().add("error", "账号或密码为空");

			} else {

				return Msg.fail().add("error", "账号或密码输入错误");
			}

		}

	}

	/**
     * 获取登录用户的session
     * @param rq
     * @return
     */
	@RequestMapping(value = "/getlogin")
	@ResponseBody
	public DRAW_USER  getlogin(HttpServletRequest rq){
	   return 	(DRAW_USER)rq.getSession().getAttribute("loginuser");
	}
	

}
