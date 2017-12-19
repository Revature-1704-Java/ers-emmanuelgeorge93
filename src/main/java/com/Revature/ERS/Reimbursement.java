package com.Revature.ERS;

public class Reimbursement {
	private double amount; //amount of reimbursement
	private int rID; //reimbursement id
	private int eID; //id of employ for reimbursement

	Reimbursement() {
		amount = 0.00;
		rID = 0;
		eID = 0;
	}
	
	Reimbursement(double amnt, int rid, int eid){
		this.amount = amnt;
		this.rID = rid;
		this.eID = eid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getRID() {
		return rID;
	}

	public void setRID(int rid) {
		this.rID = rid;
	}
	
	public int getEID() {
		return eID;
	}

	public void setEID(int eid) {
		this.eID = eid;
	}
}
