package com.vti.backend;

import java.util.Date;

import com.vti.entity.Student;

public class Ex2_Annotation {
	@SuppressWarnings("deprecation")
	public void Question1() {
		Date date = new Date(2020, 05, 18);
		System.out.println(date);

	}

	public void Question2() {
		Student student = new Student("Nguyen Van A");
		System.out.println(student.getName());

		System.out.println(student.getId());
		System.out.println(student.getID2());
	}

}
