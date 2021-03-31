package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	private ArrayList<ThiSinh> thiSinhs = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	@Override
	public void addThiSinh() {
		System.out.println("Ban muon nhap bao nhieu thi sinh");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thi sinh thu " + (i + 1) + ":");
			ThiSinh thiSinh = new ThiSinh();
			thiSinh.inputInfor();
			thiSinhs.add(thiSinh);

		}
	}

	@Override
	public void viewThiSinh() {
		for (ThiSinh thiSinh : thiSinhs) {
			System.out.println(thiSinh.toString());
		}
	}

	@Override
	public void searchThiSinh() {
		System.out.println("Nhập sbd thi sinh cần tìm: ");
		String sbd = scanner.nextLine();

		for (ThiSinh thiSinh : thiSinhs) {
			if (thiSinh.getSbd().equals(sbd)) {
				System.out.println(thiSinh);
			}
		}
	}

}
