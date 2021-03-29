package com.vti.academy.entity;

public class Newpaper extends TaiLieu {
	private int ngayPhatHanh;

    public Newpaper(String id, String nxb, int soBanPhatHanh, int ngayPhatHanh) {
        super(id, nxb, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + ngayPhatHanh +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + soBanPhatHanh + '\'' +
                '}';
    }


}
