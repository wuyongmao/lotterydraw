package com.chenyuantech.lotterydraw.utils;

import javax.servlet.*;


public class CYContextListener implements ServletContextListener{
	public CYContextListener() {  
    }  
      
     private java.util.Timer timer = null;    
       
    /** 
     * 初始化定时器 
     * web 程序运行时候自动加载   
     */  
    public void contextInitialized(ServletContextEvent arg0) {  
         /**  
         * 设置一个定时器  
         */    
        timer = new java.util.Timer(true);    
            
        arg0.getServletContext().log("定时器已启动");   
    
        /**  
         * 定时器到指定的时间时,执行某个操作(如某个类,或方法)  
         */    
        //微信设定为7200秒之后过期，我们设定为提前100秒重新获取，重新计时。
        int period = 7100 * 1000;  
        //每天的date时刻执行task，每隔period时间重复执行  
        timer.schedule(new CYWechatTokenTask(arg0.getServletContext()), 1000, period);  
        //在 指定的date时刻执行task, 仅执行一次  
        //timer.schedule(new DelFileTask(arg0.getServletContext()), date);  
        arg0.getServletContext().log("已经添加任务调度表");    
    }  
  
    /** 
     * 销毁 
     */  
    public void contextDestroyed(ServletContextEvent arg0){  
        timer.cancel();  
        arg0.getServletContext().log("定时器销毁");  
    } 
}
