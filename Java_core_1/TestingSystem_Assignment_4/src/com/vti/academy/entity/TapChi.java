package com.vti.academy.entity;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi(String id, String nxb, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(id, nxb, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "TapChi{" + "soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", id='" + id + '\''
				+ ", nxb='" + nxb + '\'' + ", soBanPhatHanh='" + soBanPhatHanh + '\'' + '}';
	}

}
