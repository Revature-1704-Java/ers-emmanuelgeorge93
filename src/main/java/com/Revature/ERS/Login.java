package com.Revature.ERS;

public class Login {
	private String username;
	private String password;
	private int lID; //login id
	private int eID; //employee id

	// CTOR
	Login() {
		username = "blank";
		password = "blank";
		lID = 0;
		eID = 0;
	}

	Login(String urn, String pswd, int lid, int eid) {
		this.username = urn;
		this.password = pswd;
		this.lID = lid;
		this.eID = eid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getLID() {
		return lID;
	}

	public void setLID(int lid) {
		this.lID = lid;
	}
	
	public int getEID() {
		return eID;
	}

	public void setEID(int eid) {
		this.eID = eid;
	}

}
