package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.NhanVien;

public class QLCB {
	private List<CanBo> canbos;
	private Scanner scanner;

	public QLCB() {
		canbos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void themCanBo() {
		System.out.println("Bạn muốn thêm cán bộ nào: \n" + "1.Nhân viên \n" + "2.Công nhân \n" + "3.Kỹ Sư");
		int choose = scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			NhanVien c = new NhanVien();
			canbos.add(c);
			System.out.println("thêm thành công!");

			break;
		case 2:

			break;
		case 3:

			break;
		default:
		
		}
	}
	public void timKiemTheoTen() {
//		System.out.println("Tìm kiếm theo họ tên");
//		int choose = scanner.nextInt();
	}

	public void hienThiThongTinCanBo() {
		System.out.println("Hiện thị thông tin về danh sách các cán bộ.");
	}

	public void xoaCanBo() {
		System.out.println("Nhập vào tên của cán bộ và delete cán bộ đó");
	}
}
