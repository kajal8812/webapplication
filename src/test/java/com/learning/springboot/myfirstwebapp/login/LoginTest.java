package com.learning.springboot.myfirstwebapp.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoginTest {

	private LoginController loginController = new LoginController();

	@Test
	void test() {
		//		fail("Not yet implemented");
		String login = loginController.login();
		assertEquals("Loginpage", login);
	}

}
