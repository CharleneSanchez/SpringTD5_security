package com.inti.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class SpringSecuConfig extends WebSecurityConfiguration{
	
	//@Override
	protected void configure(HttpSecurity http)throws Exception 
	{
		http
			.authorizeRequests()
			.antMatchers("/hello").permitAll()
			.anyRequest().authenticated()
			.and()
	        .formLogin();
	}


	

}
