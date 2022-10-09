package com.applicationweb.mairie.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("superUser").password(passwordEncoder().encode("1234"))
			.roles("USER")
			.and()
			.withUser("superAdmin").password(passwordEncoder().encode("1234"))
			.roles("ADMIN", "USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/birth").hasRole("SECRETAIRE");
//		.authorizeRequests().antMatchers("/saveBirth").hasRole("MAIRE");
//		.authorizeRequests().antMatchers("/naisance").hasRole("MAIRE");
		http
			.logout(logout -> logout                                                
	            .logoutUrl("/logout")                                            
	            .logoutSuccessUrl("/login")                                  
			)
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/login").permitAll()
//				.anyRequest().authenticated()
			.and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/sidebar");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	   return new BCryptPasswordEncoder();
	}

}
