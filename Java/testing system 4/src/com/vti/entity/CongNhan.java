package com.vti.entity;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;
	private Scanner scanner;
	
	public CongNhan() {
		scanner = new Scanner(System.in);
		inputInfo();
	}
	
	
	public CongNhan(String ten, int tuoi, boolean gioiTinh, int bac) {
		super(ten, tuoi, gioiTinh);
		this.bac = bac;
	}
	public int getbac() {
		return bac;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Mời bạn nhập vào công việc: ");
		bac = scanner.nextInt();
	}

}
