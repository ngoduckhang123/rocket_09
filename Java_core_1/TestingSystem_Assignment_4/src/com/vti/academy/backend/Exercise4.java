package com.vti.academy.backend;

import com.vti.academy.entity.Student;

public class Exercise4 {
	public void question1() {
		Student student = new Student("Khang","Bắc Ninh");
		student.setdiemHocLuc((float) 7.8);
		
		student.studentPrinter(student);
	}

}
