package com.hengaiw.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private CustomAnthencationProder authenticationProvider;
	@Autowired
    private AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> authenticationDetailsSource;
	
	@Bean
	CustomAnthencationProder authenticationProvider() {
		return new CustomAnthencationProder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
            .antMatchers(
                "/css/**",
                "/plugins/**",
                "/images/**",
                "/datas/**",
                "/js/**",
                "/logo/**",
                "/qr/**",
                "/web/**/**")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
        .formLogin()
            .loginPage("/admin/login.html")
            .permitAll()
            .defaultSuccessUrl("/admin/main.html",true)
            .failureUrl("/admin/login?error=true")
            .authenticationDetailsSource(authenticationDetailsSource)
        .and()
            .logout()
            .logoutUrl("/admin/logout.html")
            .logoutRequestMatcher(new AntPathRequestMatcher("/admin/logout.html"))
            .logoutSuccessUrl("/admin/login.html")
            .and()
        .csrf().disable()
        .headers().frameOptions().sameOrigin();
	}
}