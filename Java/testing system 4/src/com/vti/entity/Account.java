package com.vti.entity;

public class Account {
	int id;
	private String email;
	private String useName;
	String firstName;
	String lastName;
	String fullName;

	public void Account() {
	}

	public Account() {
		Account();
	}

	public Account(int id, String email, String useName, String firstname, String lastName) {
		this.id = id;
		this.email = email;
		this.useName = useName;
		this.firstName = firstname;
		this.lastName = lastName;
		this.fullName = "Họ tên:" + firstname + lastName;
	}

	public Account(int id, String email, String usename, String fullname) {
		this.id = id;
		this.email = email;
		this.useName = usename;
		this.fullName = "Họ tên:" + firstName + lastName;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getuseName() {
		return useName;
	}

	public void setuseName(String useName) {
		this.useName = useName;
	}
}