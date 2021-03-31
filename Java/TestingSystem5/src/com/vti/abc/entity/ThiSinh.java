package com.vti.abc.entity;

import java.util.Scanner;

public abstract class ThiSinh {
	private int sbd;
	private String hoTen;
	private String diaChi;
	private String mucUuTien;

	public ThiSinh(int sbd, String hoTen, String diaChi, String mucUuTien) {
		this.sbd = sbd;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;

	}

	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap so bao danh:");
		sbd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten:");
		hoTen = sc.nextLine();
		System.out.println("Nhap dia chi:");
		diaChi = sc.nextLine();
		System.out.println("Nhap muc uu tien:");
		mucUuTien = sc.nextLine();
	}
	public void hienThongTin() {
		System.out.println("sbd"+sbd);
		System.out.println("hoten"+hoTen);
		System.out.println("dia chi"+diaChi);
		System.out.println("muc uu tien"+mucUuTien);
		
	}
}
