package com.vti.entity.PolymorP;

public class Student1 implements IStudent{
	private int id;
    private String name;
    private int group;

    public Student1() {
    }
    
    public Student1(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
    
    private Student1[] students;
    public void createStudent(){
        students=new Student1[10];
         students[0]=new Student1(10, "Tuyet", 1);
        students[1]=new Student1(1, "Chinh", 1);
        students[2]=new Student1(2, "lan", 2);
        students[3]=new Student1(3, "Mia", 3);
        students[4]=new Student1(4, "Anh", 3);
        students[5]=new Student1(5, "Tuan", 2);
        students[6]=new Student1(6, "Quoc", 2);
        students[7]=new Student1(7, "Dai", 3);
        students[8]=new Student1(8, "Linh", 1);
        students[9]=new Student1(9, "Thuy", 1);
       
        System.out.println("Da tao 10 hoc sinh");
        
    }
    public void caLopDiDiemDanh(){
        for(int i=0; i<10;i++){
            students[i].DiemDanh();
        }
    }
    public void nhom1DiHocBai(){
        for(int i=0; i<10;i++){
            if(students[i].group==1)
            {
                students[i].HocBai();
            }
        }
    }
    public void nhom2DiDonVS(){
        for(int i=0; i<10;i++){
            if(students[i].group==2)
            {
                students[i].DiDonVS();
            }
        }
    }
    @Override
    public void DiemDanh() {
        System.out.println(name+" dang diem danh");
    }

    @Override
    public void HocBai() {
        System.out.println(name+" dang hoc bai");
    }

    @Override
    public void DiDonVS() {
        System.out.println(name+" dang di don ve sinh");
    }
    

}
