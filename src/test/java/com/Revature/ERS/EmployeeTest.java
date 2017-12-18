package com.Revature.ERS;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

	// test CTOR creates proper object
	public void testCTOR() {
		Employee tester = new Employee();
		assertEquals(tester.getFirst_name(), "No one");
		assertEquals(tester.getLast_name(), "No one");
		assertEquals(tester.getDepartment_Num(), 0);
	}

	public void testCTORwithVals() {
		Employee tester = new Employee("test firstname", "test lastname", 1);
		assertEquals(tester.getFirst_name(), "test firstname");
		assertEquals(tester.getLast_name(), "test lastname");
		assertEquals(tester.getDepartment_Num(), 1);
	}

	// test get and set for first name
	public void testgetsetFirst_name() {
		Employee tester = new Employee();

		String check = tester.getFirst_name();
		assertEquals(tester.getFirst_name(), check);

		tester.setFirst_name("test");
		assertEquals(tester.getFirst_name(), "test");
	}

	// test get and set for last name
	public void testgetsetLast_name() {
		Employee tester = new Employee();

		String check = tester.getLast_name();
		assertEquals(tester.getLast_name(), check);

		tester.setLast_name("test");
		assertEquals(tester.getLast_name(), "test");
	}

	// test get and set for department number
	public void testgetsetDepartment_num() {
		Employee tester = new Employee();

		int check = tester.getDepartment_Num();
		assertEquals(tester.getDepartment_Num(), check);

		tester.setDepartment_Num(5);
		assertEquals(tester.getDepartment_Num(), 5);
	}
}
