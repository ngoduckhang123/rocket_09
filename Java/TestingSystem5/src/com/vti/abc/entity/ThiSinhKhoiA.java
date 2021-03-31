package com.vti.abc.entity;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh {
	private String mon1;
	private String mon2;
	private String mon3;

	public ThiSinhKhoiA() {

	}

	public ThiSinhKhoiA(String mon1, String mon2, String mon3) {
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;

	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap mon 1:");
		mon1 = sc.nextLine();
		System.out.println("Nhap mon 2:");
		mon2 = sc.nextLine();
		System.out.println("Nhap mon 3:");
		mon3 = sc.nextLine();

	}

	public void hienThiThongTin() {
		super.hienThongTin();
		System.out.println("To hop mon" + mon1 + "-" + mon2 + "-" + mon3);
	}
}
