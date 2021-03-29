package com.vti.academy.fontend;

import com.vti.academy.entity.HighschoolStudent;

public class ObjectHighschool {
	public static void main(String[] args) {
		HighschoolStudent highschhool = new HighschoolStudent(1, "Nam", "Chuyen Van", "Dai hoc Cong nghiep");
		highschhool.setId(1);
		highschhool.setName("Nam");
		highschhool.setClazz("Chuyen van");
		highschhool.setDesiredUniversity("Dai hoc Cong nghiep");
		System.out.println("id" + " " + highschhool.getId());
		System.out.println("ten" + " " + highschhool.getName());
		System.out.println("lop" + " " + highschhool.getClazz());
		System.out.println("Truong" + " " + highschhool.getDesiredUniversity());
	}

}
