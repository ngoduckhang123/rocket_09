package com.vti.academy.fontend;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập chức năng muốn sử dụng: \n " + "1.Thêm mới cán bộ. \n"
				+ "2.Tìm kiếm theo họ tên. \n" + "3.Hiện thị thông tin về danh sách các cán bộ.\r\n"
				+ "4.Nhập vào tên của cán bộ và delete cán bộ đó \n" + "5.Thoát khỏi chương trình");
		while (true) {
			System.out.println("Mời bạn nhập chức năng:");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Thêm mới cán bộ.");
				break;
			case 2:
				System.out.println("Tìm kiếm theo họ tên.");
				break;
			case 3:
				System.out.println("Hiện thị thông tin về danh sách các cán bộ.");
				break;
			case 4:
				System.out.println("Nhập vào tên của cán bộ và delete cán bộ đó.");
				break;
			case 5:
				System.out.println("Thoát khỏi chương trình.");
				scanner.close();
				return;

			default:
				break;
			}
		}
	}

}
