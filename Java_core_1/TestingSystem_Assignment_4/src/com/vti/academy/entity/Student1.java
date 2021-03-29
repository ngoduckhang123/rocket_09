package com.vti.academy.entity;

import javax.management.remote.SubjectDelegationPermission;

public abstract class Student1 extends Person {
	protected int id;

	public Student1(String name,int id){
		super(name);
		this.id=id;
	}

}
