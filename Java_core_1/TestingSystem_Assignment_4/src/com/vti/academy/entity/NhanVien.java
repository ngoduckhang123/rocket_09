package com.vti.academy.entity;

import java.util.Scanner;

public class NhanVien extends CanBo {
private String congViec;
	
	private Scanner scanner;

	public NhanVien() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public NhanVien(String ten, int tuoi, boolean gioiTinh, String congViec) {
		super(ten, tuoi, gioiTinh);
		this.congViec = congViec;
		scanner = new Scanner(System.in);
	}

	public String getcongViec() {
		return congViec;
	}

	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Mời bạn nhập vào công việc: ");
		congViec = scanner.nextLine();
	}


}
