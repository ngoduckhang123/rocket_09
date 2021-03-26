package com.vti.backend;

import com.vti.entity.Student;

public class Exercise4 {
	public void question1() {
		Student student = new Student("Khang","Bắc Ninh");
		student.setdiemHocLuc((float) 7.8);
		
		student.studentPrinter(student);
	}

}
