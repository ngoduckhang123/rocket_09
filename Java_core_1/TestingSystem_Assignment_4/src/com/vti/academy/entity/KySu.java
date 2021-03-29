package com.vti.academy.entity;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nghanhDaoTao;
	private Scanner scanner;
	
	public KySu() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public KySu(String hoTen, int tuoi, boolean gioiTinh, String nghanhDaoTao) {
		super(hoTen, tuoi, gioiTinh);
		this.nghanhDaoTao = nghanhDaoTao;
	}

	public String getNghanhDaoTao() {
		return nghanhDaoTao;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Mời bạn nhập vào nghành đào tạo: ");
		nghanhDaoTao = scanner.nextLine();

}
}
