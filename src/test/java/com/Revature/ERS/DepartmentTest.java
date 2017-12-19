package com.Revature.ERS;

import junit.framework.TestCase;

public class DepartmentTest extends TestCase {

	// test CTOR creates proper object
	public void testCTOR() {
		Department tester = new Department();
		assertEquals(tester.getDeparment_name(), "Nothing");
		assertEquals(tester.getDID(), 0);
	}

	public void testCTORwithVals() {
		Department tester = new Department("Yes", 3);
		assertEquals(tester.getDeparment_name(), "Yes");
		assertEquals(tester.getDID(), 3);
	}
	
	public void testgetsetDepartmentname() {
		Department tester = new Department();
		assertEquals(tester.getDeparment_name(), "Nothing");
		
		tester.setDeparment_name("Tim");
		assertEquals(tester.getDeparment_name(), "Tim");
	}
	
	public void testgetsetDID() {
		Department tester = new Department();
		assertEquals(tester.getDID(), 0);
		
		tester.setDID(3);
		assertEquals(tester.getDID(), 3);
	}
}
