package com.ecommerce.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
        .antMatchers("/user/*").permitAll()
				.antMatchers("/product/*").permitAll()
				.anyRequest()
		.authenticated()
		.and().httpBasic()
		.and().csrf().disable();
		return http.build();
	}
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.csrf().disable()
//				// dont authenticate this particular request
//				.authorizeRequests().antMatchers("/authenticate", "/register").permitAll().
//				// all other requests need to be authenticated
//				anyRequest().authenticated().and().
//				// make sure we use stateless session; session won't be used to
//				// store user's state.
//				exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
//				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		return httpSecurity.build();
//	}

}
