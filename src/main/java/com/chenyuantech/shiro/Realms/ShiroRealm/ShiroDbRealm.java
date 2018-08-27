package com.chenyuantech.shiro.Realms.ShiroRealm;

 
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.chenyuantech.lotterydraw.bean.DRAW_USER;
import com.chenyuantech.lotterydraw.service.DRAW_USER_Service;
 
  
public class ShiroDbRealm extends AuthorizingRealm {  
    @Autowired  
	private DRAW_USER_Service draw_USER_Service;
    public static final String SESSION_USER_KEY = "gray";  
  
    /** 
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用,负责在应用程序中决定用户的访问控制的方法 
     */   
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {  
        DRAW_USER user = (DRAW_USER) SecurityUtils.getSubject().getSession().getAttribute(ShiroDbRealm.SESSION_USER_KEY);  
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();  
//        info.addRole(user.getRole().trim());  
        info.addRole("admin");
        return info;  
    }  
  
    /** 
     * 认证回调函数，登录信息和用户验证信息验证 
     */  
    @Override  
    protected AuthenticationInfo doGetAuthenticationInfo(  
            AuthenticationToken authcToken) throws AuthenticationException {  
        // 把token转换成User对象  
    	DRAW_USER userLogin = tokenToUser((UsernamePasswordToken) authcToken);  
        // 验证用户是否可以登录  
        boolean ui = draw_USER_Service.checkUser(userLogin);  
        if(ui == false)  
            return null; // 异常处理，找不到数据  
        // 设置session  
        Session session = SecurityUtils.getSubject().getSession();  
        session.setAttribute(ShiroDbRealm.SESSION_USER_KEY, userLogin);   
        //当前 Realm 的 name  
        String realmName = this.getName();  
        //登陆的主要信息: 可以是一个实体类的对象, 但该实体类的对象一定是根据 token 的 username 查询得到的.  
//      Object principal = ui.getUsername();  
        Object principal = authcToken.getPrincipal();  
        return new SimpleAuthenticationInfo(principal, userLogin.getPASSWORD(), realmName);  
    }  
  
    private DRAW_USER tokenToUser(UsernamePasswordToken authcToken) {  
    	DRAW_USER user = new DRAW_USER();  
    	user.setZX01(authcToken.getUsername());  
        user.setPASSWORD(String.valueOf(authcToken.getPassword()) );;
        return user;  
    }  
  
    
}  