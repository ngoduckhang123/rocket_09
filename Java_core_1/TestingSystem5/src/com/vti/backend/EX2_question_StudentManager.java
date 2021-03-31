package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.PolymorP.Student;

public class EX2_question_StudentManager {
	private ArrayList<Student> students = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public void createStudent() {
		System.out.println("Nhap so sinh vien muon nhap:");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
			Student student = new Student();
			student.inputInfo();
			students.add(student);

		}

	}

	public void showInfoStudent() {
		for (com.vti.entity.PolymorP.Student student : students) {
			student.showInfo();
		}
	}

	public void isHocBong() {
		System.out.println("Nhập tên sinh viên muốn xét hoc bong:");
		String name = scanner.nextLine();

		for (Student student : students) {
			if (student.getName().equals(name)) {
				if (student.isGetHocBong()) {
					System.out.println("Được học bổng !");
				} else {
					System.out.println("Không được học bổng !");
				}
				break;
			}
		}
	}

}
