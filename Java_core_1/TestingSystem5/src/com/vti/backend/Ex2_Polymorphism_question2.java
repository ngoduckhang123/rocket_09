package com.vti.backend;

import java.util.Scanner;

public class Ex2_Polymorphism_question2 {
	private Scanner scanner = new Scanner(System.in);

	public void Question2() {
		EX2_question_StudentManager studentManager = new EX2_question_StudentManager();
		int choose = 0;
		do {
			loadMenu();
			choose = scanner.nextInt();

			switch (choose) {
			case 1:
				studentManager.createStudent();
				break;
			case 2:
				studentManager.showInfoStudent();
				break;
			case 3:
				studentManager.isHocBong();
				break;

			}

		} while (choose != 3);
	}

	public static void loadMenu() {
		System.out.println("---------------");
		System.out.println("1 - Nhap thong tin student");
		System.out.println("2 - Show thong tin student");
		System.out.println("3 - Nhap vao ten 1 sv, xét học bong cua sinh vien ay");
		System.out.println("---------------");
	}

}
