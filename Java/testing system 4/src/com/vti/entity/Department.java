package com.vti.entity;

public class Department {
	int id;
	private String name;

	public Department() {

	}

	public Department(String nameDepartment) {
		this.name = nameDepartment;
		this.id = 0;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
}
