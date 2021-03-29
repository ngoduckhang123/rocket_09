package com.vti.academy.entity;

public class TaiLieu {
	protected String id;
    protected String nxb;
    protected int soBanPhatHanh;

    public TaiLieu(String id, String nxb, int soBanPhatHanh) {
        this.id = id;
        this.nxb = nxb;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }


}
