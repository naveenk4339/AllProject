package com.java.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//set you configuration on the auth object
		/*
		 * auth.inMemoryAuthentication().withUser("naveen")
		 * .password("mouni").roles("ADMIN") .and().withUser("mam") .password("user")
		 * .roles("USER");
		 */
		
		/*
		 * auth.jdbcAuthentication() .dataSource(dataSource) .withDefaultSchema()
		 * .withUser( User.withUsername("user") .password("USER") .roles("USER") )
		 * .withUser(User.withUsername("mouni") .password("pass") .roles("ADMIN"));
		 */
		
		//real world we will do as shown below
		auth.jdbcAuthentication().dataSource(dataSource);
		
		//if i want to differnt scehama not with default table then i can use as following
		auth.jdbcAuthentication().dataSource(dataSource).
		usersByUsernameQuery("Select usename ,passpword,enabled"
				+"from users"
				+"where username = ?")
		.usersByUsernameQuery("Select usename ,authority"
				+"from authorities"
				+"where username = ?");
		
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		/*
		 * http.authorizeRequests()
		 * .antMatchers("/","static/css","static/js").permitAll()
		 * .antMatchers("/**").hasAnyRole("ADMIN") .and().formLogin();
		 */
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}

}
