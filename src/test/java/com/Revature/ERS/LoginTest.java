package com.Revature.ERS;

import junit.framework.TestCase;

public class LoginTest extends TestCase {

	// test CTOR creates proper object
	public void testCTOR() {
		Login tester = new Login();
		assertEquals(tester.getUsername(), "blank");
		assertEquals(tester.getPassword(), "blank");
	}

	public void testCTORwithVals() {
		Login tester = new Login("nope", "nope");
		assertEquals(tester.getUsername(), "nope");
		assertEquals(tester.getPassword(), "nope");
	}

	// test get and set for username
	public void testgetsetUsername() {
		Login tester = new Login();

		String check = tester.getUsername();
		assertEquals(tester.getUsername(), check);

		tester.setUsername("test");
		assertEquals(tester.getUsername(), "test");
	}

	// test get and set for password
	public void testgetsetPassword() {
		Login tester = new Login();

		String check = tester.getPassword();
		assertEquals(tester.getPassword(), check);

		tester.setPassword("test");
		assertEquals(tester.getPassword(), "test");
	}
}
