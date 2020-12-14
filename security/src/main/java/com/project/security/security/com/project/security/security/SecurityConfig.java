package com.project.security.security.com.project.security.security;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource ;
	
	@SuppressWarnings("deprecation")
	@Autowired
	 protected void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
		.dataSource(dataSource)
		.usersByUsernameQuery("select username , password , enabled from userdetails where username=?") 
		.authoritiesByUsernameQuery("select username ,role from userdetails where username=?");
	}
	
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http
	         .authorizeRequests()
	         .anyRequest().authenticated()
	         .and()
	         .formLogin()
	         .loginPage("/login").defaultSuccessUrl("/home" ,true)
	         .permitAll().and()
	         .logout().permitAll() ;
	}
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("user")
//				.password("password")
//				.roles("USER")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
}
