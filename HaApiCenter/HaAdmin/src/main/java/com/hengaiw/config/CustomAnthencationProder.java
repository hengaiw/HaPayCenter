package com.hengaiw.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hengaiw.pay.model.dao.mapper.HaAdminMapper;
import com.hengaiw.pay.model.dao.model.HaAdmin;

public class CustomAnthencationProder implements AuthenticationProvider {

	@Autowired
	private HaAdminMapper adminMapper;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		// CustomWebAuthenticationDetails details =
		// (CustomWebAuthenticationDetails) authentication
		// .getDetails(); // 如上面的介绍，这里通过authentication.getDetails()获取详细信息
		// 用户名
		String username = authentication.getName();
		// 验证码
		String password = (String) authentication.getCredentials();
		HaAdmin admin=new HaAdmin();
		admin.setAdmin_name("admin");
		admin.setAdmin_password("admin");
		if(admin==null){
			System.out.println("login error");
			throw new UsernameNotFoundException(String.format("用户%s未找到！", username));
		}else{
			System.out.println("login success");
			UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
			return  authRequest;
		}
		// Customer user = userService.getUserByname(username);
		// List<SimpleGrantedAuthority> auths = new ArrayList<>();
		//// 游客=》提示用户去注册
		// if(user==null){
		// //授权
		// auths.add(new SimpleGrantedAuthority(Role.ROLE_TOURIST.toString()));
		// auths.add(new SimpleGrantedAuthority(username));
		// auths.add(new SimpleGrantedAuthority(password));
		// return new UsernamePasswordAuthenticationToken(new Customer(),
		// password,
		// auths);
		// }else{
		// //存在此用户，调用登录接口
		// String data = HttpRequest.sendGet(env.getProperty("login.url"),
		// "mobile=" + username+"&smsCode="+password);
		// JSONObject json = JSONObject.parseObject(data);
		// if(json.getBoolean("success")==true){
		// //验证码和手机号码正确,返回用户权限
		// switch(user.getRole()){
		// case 0:auths.add(new
		// SimpleGrantedAuthority(Role.ROLE_USER.toString()));
		// case 1:auths.add(new
		// SimpleGrantedAuthority(Role.ROLE_CHANNEL.toString()));
		// case 2:auths.add(new
		// SimpleGrantedAuthority(Role.ROLE_ADMIN.toString()));
		// }
		// }else{
		// //验证消息放到权限里面， 页面提示
		// auths.add(new
		// SimpleGrantedAuthority(Role.ROLE_WRONGCODE.toString()));
		// auths.add(new SimpleGrantedAuthority(username));
		// auths.add(new SimpleGrantedAuthority(password));
		// }
		// }
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);

	}

}
