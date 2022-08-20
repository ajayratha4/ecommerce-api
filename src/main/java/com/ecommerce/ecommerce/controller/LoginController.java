package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.common.Response;
import com.ecommerce.ecommerce.entity.User;
import com.ecommerce.ecommerce.service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/signup")
	public ResponseEntity<Response> signUp(@RequestBody User user) {

		Response response = loginService.signup(user);

		return ResponseEntity.status(response.getStatus()).body(response);
	}

	@GetMapping("/login")
	public ResponseEntity<Response> logIn(@RequestParam String username, String password) {

		Response response = loginService.login(username, password);

		return ResponseEntity.status(response.getStatus()).body(response);
	}
}
