package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float diemHocLuc;
	

	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.diemHocLuc = 0;

	}

//	public void setdiemHocLuc() {
//		return diemHocLuc;
//
//	}
	public void setdiemHocLuc(float diemHocLuc) {
		if(diemHocLuc >0 && diemHocLuc<10) {
			this.diemHocLuc=diemHocLuc;
		}else {
			this.diemHocLuc=0;
		}
			
	}
	
	public void adddiemHocLuc(float diemHocLuc) {
		this.diemHocLuc += diemHocLuc;
	}
	
	public String diemBangChu (float diemHocLuc) {
		if(diemHocLuc < 4 ) return "Yếu";
		if(diemHocLuc < 6 ) return "Trung bình";
		if(diemHocLuc < 8 ) return "Khá";
		return "Giỏi";
		
	}
	 public void studentPrinter(Student student) {
		 System.out.println("Họ tên " + student.name);
		 System.out.println("Xếp loại học lực" + diemBangChu(student.diemHocLuc));
		 
	 }
}
