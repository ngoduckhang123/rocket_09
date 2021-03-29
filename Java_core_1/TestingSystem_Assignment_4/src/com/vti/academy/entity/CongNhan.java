package com.vti.academy.entity;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;
	private Scanner scanner;
	
	public CongNhan() {
		scanner = new Scanner(System.in);
		inputInfo();
	}
	
	
	public CongNhan(String hoTen, int tuoi, boolean gioiTinh, int bac) {
		super(hoTen, tuoi, gioiTinh);
		this.bac = bac;
	}
	public int getbac() {
		return bac;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Mời bạn nhập vào bac: ");
		bac = scanner.nextInt();
	}

}
