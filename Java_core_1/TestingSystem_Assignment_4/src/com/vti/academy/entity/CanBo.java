package com.vti.academy.entity;

import java.util.Scanner;

public class CanBo {
	protected String hoTen;
	protected int tuoi;
	protected boolean gioiTinh;
	private Scanner scanner;

	public CanBo() {

	}

	public CanBo(String hoTen, int tuoi, boolean gioiTinh) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		scanner = new Scanner(System.in);

	}

	public String getTen() {
		return hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void inputInfo() {
		scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập vào tên: ");
		hoTen = scanner.nextLine();
		System.out.print("Mời bạn nhập vào tuổi: ");
		tuoi = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Mời bạn nhập vào giới tính (nam/nu): ");
		String gt = scanner.nextLine();
		gioiTinh = gt.equals("nam") ? true : false;

	}

}
