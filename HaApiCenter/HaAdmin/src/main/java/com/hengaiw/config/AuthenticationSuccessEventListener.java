package com.hengaiw.config;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;
/**
 * 登录成功的监听
 * @author jianhuizhang
 *
 */
@Component 
public class AuthenticationSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent> {

	@Override
	public void onApplicationEvent(AuthenticationSuccessEvent e) {
		// TODO Auto-generated method stub
		WebAuthenticationDetails auth = (WebAuthenticationDetails)   
		          e.getAuthentication().getDetails();  
		System.out.println(auth.getRemoteAddress()+":success:"+e.getAuthentication().getPrincipal());
	}

}
