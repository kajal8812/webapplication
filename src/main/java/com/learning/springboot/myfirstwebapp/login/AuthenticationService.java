package com.learning.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean u = username.equalsIgnoreCase("learning");
		boolean p = password.equalsIgnoreCase("ngu");
		return u && p;

	}

}
