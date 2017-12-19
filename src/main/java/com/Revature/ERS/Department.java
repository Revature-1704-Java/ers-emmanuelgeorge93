package com.Revature.ERS;

public class Department {
	private String deparment_name;
	private int dID; //id of department

	// CTOR
	Department() {
		deparment_name = "Nothing";
		dID = 0;
	}

	Department(String dname, int did) {
		this.deparment_name = dname;
		this.dID = did;
	}

	public String getDeparment_name() {
		return deparment_name;
	}

	public void setDeparment_name(String deparment_name) {
		this.deparment_name = deparment_name;
	}
	
	public int getDID() {
		return dID;
	}

	public void setDID(int did) {
		this.dID = did;
	}
}
