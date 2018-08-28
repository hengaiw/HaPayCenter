package com.hengaiw.config;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;
/**
 * 登录失败的监听
 * @author jianhuizhang
 *
 */
@Component 
public class AuthenticationFailureListener implements ApplicationListener<AuthenticationFailureBadCredentialsEvent> {

	@Override
	public void onApplicationEvent(AuthenticationFailureBadCredentialsEvent e) {
		// TODO Auto-generated method stub
		WebAuthenticationDetails auth = (WebAuthenticationDetails)   
		          e.getAuthentication().getDetails();  
		e.getException().getMessage();
		System.out.println(auth.getRemoteAddress()+":error:"+e.getException().getMessage());
	}

}
