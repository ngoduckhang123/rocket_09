package com.vti.entity.Abstraction;

public class KhoiThi {
	private String tenKhoiThi;
    private String tenMonThi;

    public KhoiThi() {
    }

    public KhoiThi(String tenKhoiThi, String tenMonThi) {
        this.tenKhoiThi = tenKhoiThi;
        this.tenMonThi = tenMonThi;
    }

    public String getTenMonThi() {
        if(tenKhoiThi.equals("A"))
            tenMonThi="Toan, Ly, Hoa";
        else if(tenKhoiThi.equals("B"))
            tenMonThi="Toan, Hoa, SInh";
        else if(tenKhoiThi.equals("C"))
            tenMonThi="Van, Su, Dia";
        return tenMonThi;
    }

    public void setTenMonThi(String tenMonThi) {
        this.tenMonThi = tenMonThi;
    }

    
    public String getTenKhoiThi() {
        return tenKhoiThi;
    }

    public void setTenKhoiThi(String tenKhoiThi) {
        this.tenKhoiThi = tenKhoiThi;
    }

}
