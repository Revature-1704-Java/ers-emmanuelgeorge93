package com.Revature.ERS;

import junit.framework.TestCase;

public class ReimbursementTest extends TestCase {

	// test CTOR creates proper object
	public void testCTOR() {
		Reimbursement tester = new Reimbursement();
		assertEquals(tester.getAmount(), 0.00);
		assertEquals(tester.getRID(), 0);
		assertEquals(tester.getEID(), 0);
	}

	public void testCTORwithVals() {
		Reimbursement tester = new Reimbursement(5.99, 1, 1);
		assertEquals(tester.getAmount(), 5.99);
		assertEquals(tester.getRID(), 1);
		assertEquals(tester.getEID(), 1);
	}

	public void testgetsetAmount() {
		Reimbursement tester = new Reimbursement();

		double check = tester.getAmount();
		assertEquals(tester.getAmount(), check);

		tester.setAmount(5.99);
		assertEquals(tester.getAmount(), 5.99);
	}
	
	public void testgetsetRID() {
		Reimbursement tester = new Reimbursement();

		int check = tester.getRID();
		assertEquals(tester.getRID(), 0);

		tester.setRID(1);
		assertEquals(tester.getRID(), 1);
	}
	
	public void testgetsetEID() {
		Reimbursement tester = new Reimbursement();

		int check = tester.getEID();
		assertEquals(tester.getEID(), 0);

		tester.setEID(1);
		assertEquals(tester.getEID(), 1);
	}
}
