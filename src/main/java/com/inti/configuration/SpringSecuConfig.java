package com.inti.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.inti.service.IUserDetailService;

@Configuration
@EnableWebSecurity
public class SpringSecuConfig extends WebSecurityConfiguration{
	@Autowired
	IUserDetailService iuds;
	//@Override
	protected void configure(HttpSecurity http)throws Exception 
	{
		http
			.authorizeHttpRequests() // autorise http
			.antMatchers("/hello","/inscription").permitAll() // acces a ses url autorisé a tt le monde
			.anyRequest().authenticated() // autorise tte les requete si authentifier
			.and()
	        .formLogin().loginPage("/login"); // acces pour se connecter
	
		@Bean
		public BCryptPasswordEncoder bCryptPasswordEncoder() {
			return new BCryptPasswordEncoder();
		}
		@Bean
		@Override
		public AuthenticationManager AuthenticationManagerBean ()throws Exception{
			return super.authenticationManagerBean(); 
		}
		
	}


	

}
