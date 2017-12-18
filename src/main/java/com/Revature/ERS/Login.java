package com.Revature.ERS;

public class Login {
	private String username;
	private String password;

	// CTOR
	Login() {
		username = "blank";
		password = "blank";
	}

	Login(String urn, String pswd) {
		this.username = urn;
		this.password = pswd;
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

}
