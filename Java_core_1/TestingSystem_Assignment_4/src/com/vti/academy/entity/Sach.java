package com.vti.academy.entity;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;

public Sach(String id, String nxb, int soBanPhatHanh, String tenTacGia, int soTrang) {
    super(id, nxb, soBanPhatHanh);
    this.tenTacGia = tenTacGia;
    this.soTrang = soTrang;
}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Sach{" + "tentacgia='" + tenTacGia + '\'' + ", sotrang=" + soTrang + ", id='" + id + '\'' + ", nxb='"
				+ nxb + '\'' + ", Sobanphathanh='" + soBanPhatHanh + '\'' + '}';
	}

}
