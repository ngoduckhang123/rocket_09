package com.vti.entity;

import java.util.Scanner;

public class CanBo {
	protected String ten;
	protected int tuoi;
	protected boolean gioiTinh;
	private Scanner scanner;

	public CanBo() {

	}

	public CanBo(String ten, int tuoi, boolean gioitinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioitinh;
		scanner = new Scanner(System.in);

	}

	public String getTen() {
		return ten;
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
		ten = scanner.nextLine();
		System.out.print("Mời bạn nhập vào tuổi: ");
		tuoi = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Mời bạn nhập vào giới tính (nam/nu): ");
		String gt = scanner.nextLine();
		gioiTinh = gt.equals("nam") ? true : false;

	}

}
