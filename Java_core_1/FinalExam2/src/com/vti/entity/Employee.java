package com.vti.entity;

public class Employee extends User {
	private int projectId;
	private String proskill;

	public Employee(int id, String fullName, String email, String password, int projectId, String proskill) {
		super(id, fullName, email, password);
		this.projectId = projectId;
		this.proskill = proskill;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProskill() {
		return proskill;
	}

	public void setProskill(String proskill) {
		this.proskill = proskill;
	}
	

}
