package com.Revature.ERS;

import junit.framework.TestCase;

public class LoginTest extends TestCase {

	// test CTOR creates proper object
	public void testCTOR() {
		Login tester = new Login();
		assertEquals(tester.getUsername(), "blank");
		assertEquals(tester.getPassword(), "blank");
		assertEquals(tester.getLID(), 0);
		assertEquals(tester.getEID(), 0);
	}

	public void testCTORwithVals() {
		Login tester = new Login("nope", "nope", 2, 2);
		assertEquals(tester.getUsername(), "nope");
		assertEquals(tester.getPassword(), "nope");
		assertEquals(tester.getLID(), 2);
		assertEquals(tester.getEID(), 2);
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

	// test get and set for LID
	public void testgetsetLID() {
		Login tester = new Login();

		int check = tester.getLID();
		assertEquals(tester.getLID(), check);

		tester.setLID(5);
		assertEquals(tester.getLID(), 5);
	}

	// test get and set for LID
	public void testgetsetEID() {
		Login tester = new Login();

		int check = tester.getEID();
		assertEquals(tester.getEID(), check);

		tester.setEID(5);
		assertEquals(tester.getEID(), 5);
	}
}
