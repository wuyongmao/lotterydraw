package com.chenyuantech.lotterydraw.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;

import javax.servlet.http.HttpServletRequest;

public class Tools {
	public static String getDateTime(String pattern) {
		SimpleDateFormat dateFormater = new SimpleDateFormat(pattern);
		Date date = new Date();
		return dateFormater.format(date);
	}
	
	public static Date getDate(String dateStr,String pattern) {
		try {
			SimpleDateFormat dateFormater = new SimpleDateFormat(pattern);
			return dateFormater.parse(dateStr);
		} catch (ParseException e) {
			return null;
		}
	}

	int number;

	Tools increment() {
		this.number++;
		return this;
	}

	private void print() {
		System.out.println("number=" + this.number);
	}

	public static void main(String... args) {

		Tools tt = new Tools();
		tt.increment().increment().increment().print();

		/*
		 * Animal animal = null; try { animal = new Cat(); animal.makeSound(); }
		 * catch (Exception e) { System.out.print("E."); } finally{
		 * System.out.print("F."); }
		 */

	}

	public static String isEmpty(Stack<String> stack) {
		return stack.empty() ? "empty" : "not empty";
	}

	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	public static String getExceptionDetail(Exception e) {

		StringBuffer msg = new StringBuffer("null");

		if (e != null) {
			msg = new StringBuffer("");

			String message = e.toString();

			int length = e.getStackTrace().length;

			if (length > 0) {

				msg.append(message + "\n");

				for (int i = 0; i < length; i++) {

					msg.append("\t" + e.getStackTrace()[i] + "\n");

				}
			} else {

				msg.append(message);
			}

		}
		return msg.toString();

	}

	public static String getWeekOfDate(Date dt) {
		String[] weekDays = { "閺勭喐婀￠弮锟�", "閺勭喐婀℃稉锟�", "閺勭喐婀℃禍锟�", "閺勭喐婀℃稉锟�", "閺勭喐婀￠崶锟�", "閺勭喐婀℃禍锟�", "閺勭喐婀￠崗锟�" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0) {
			w = 0;
		}
		return weekDays[w];
	}
}
