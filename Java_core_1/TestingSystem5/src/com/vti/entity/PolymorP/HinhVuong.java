package com.vti.entity.PolymorP;

public class HinhVuong extends HinhChuNhat {
	@Override
	public float tinhDienTich(float a, float b) {

		return super.tinhDienTich(a, b);
	}

	public float tinhDienTich(float a) {

		return this.tinhDienTich(a, a);
	}

	@Override
	public float tinhChuVi(float a, float b) {

		return super.tinhChuVi(a, b);
	}

	public float tinhChuVi(float a) {

		return this.tinhChuVi(a, a);
	}

}
