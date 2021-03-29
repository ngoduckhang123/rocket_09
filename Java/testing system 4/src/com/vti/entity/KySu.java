package com.vti.entity;

public class KySu extends CanBo {
	private String nghanhDaoTao;

	public KySu(String ten, int tuoi, boolean gioiTinh, String nghanhDaoTao) {
		super(ten, tuoi, gioiTinh);
		this.nghanhDaoTao = nghanhDaoTao;
	}

	public String getNghanhDaoTao() {
		return nghanhDaoTao;
	}

}
