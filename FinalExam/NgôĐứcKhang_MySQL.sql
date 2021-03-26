-- tạo cơ sở dữ liệu  

drop database if exists thuctap1;
create database if not exists ThucTap1;
use ThucTap1;

-- Question1
-- Tạo bảng giảng viên

drop table if exists GiangVien;
create table if not exists GiangVien
(
        magv              tinyint auto_increment primary key,
        hoten             varchar(50) not null,
        luong             float
);

-- tạo bảng sinh viên

drop table if exists SinhVien;
create table if not exists SinhVien
(
        masv            tinyint auto_increment primary key,
        namsinh         year,
	    hoten           varchar(50) not null,
        quequan         varchar(100) not null
);

-- Tạo bảng đề tài

drop table if exists DeTai;
create table if not exists DeTai
(
		madt            tinyint auto_increment primary key,
        tendt           varchar(100) not null,
        kinhphi         int,
        noithuctap      varchar(100) 
);

-- Tạo bảng hướng dẫn

drop table if exists HuongDan;
create table if not exists HuongDan
(
		id             tinyint auto_increment primary key,
        masv           tinyint not null,
        madt           tinyint not null,
        magv           tinyint not null,
        ketqua         enum('Đạt','Trượt'),
        foreign key (masv) references SinhVien(masv),
        foreign key (madt) references DeTai(madt),
        foreign key (magv) references GiangVien(magv)
);

-- Thêm bản ghi vào bảng giảng viên
insert into GiangVien(magv,hoten,luong)
values (1,"Nguyễn Văn Hùng",10000000.0);
insert into GiangVien(magv,hoten,luong)
values (2,"Trần Thị Thùy Dung",12000000.0);
insert into GiangVien(magv,hoten,luong)
values (3,"Lê Cẩm Giang",20000000.0);
insert into GiangVien(magv,hoten,luong)
values (4,"Đào Hồng Lương",22000000.0);

select * from GiangVien;

-- Thêm bản ghi vào bảng sinh viên
insert into SinhVien(masv,namsinh,hoten,quequan)
values (1,1999,"Nguyễn Duy Phúc","Bắc Ninh");
insert into SinhVien(masv,namsinh,hoten,quequan)
values (2,1999,"Ngô Văn Hồng Sơn","Bắc Ninh");
insert into SinhVien(masv,namsinh,hoten,quequan)
values (3,2000,"Trần Kim Dung","Bắc Ninh");
insert into SinhVien(masv,namsinh,hoten,quequan)
values (4,1999,"Ngô Minh Nguyệt","Hải Phòng");

select*from SinhVien;

-- Thêm bản ghi vào bảng đề tài
insert into DeTai(madt,tendt,kinhphi,noithuctap)
values (1,"Xây dựng cửa hàng bánh mì",200000000,"Bắc Ninh");
insert into DeTai(madt,tendt,kinhphi,noithuctap)
values (2,"Xây dựng tiệm bánh sinh nhật",100000000,"Ninh Bình");
insert into DeTai(madt,tendt,kinhphi,noithuctap)
values (3,"Quản lý hệ thống cửa hàng quần áo",500000000,"Hà Nội");
insert into DeTai(madt,tendt,kinhphi,noithuctap)
values (4,"Demo game new",600000000,"Hà Nội");

select*from DeTai;

-- Thêm bản ghi vào bảng hướng dẫn
insert into HuongDan(id,masv,madt,magv,ketqua)
values(01,2,3,4,'Đạt');
insert into HuongDan(id,masv,madt,magv,ketqua)
values(02,1,1,3,'Trượt');
insert into HuongDan(id,masv,madt,magv,ketqua)
values(03,3,4,2,'Đạt');
insert into HuongDan(id,masv,madt,magv,ketqua)
values(04,4,2,1,'Đạt');

select*from HuongDan;

-- Question2
-- a)
select * from SinhVien
where not exists(
select HuongDan.madt from HuongDan,DeTai
where HuongDan.madt= DeTai.madt);
-- b)
select count(SinhVien.masv) 
from SinhVien
	inner join HuongDan on SinhVien.masv = HuongDan.masv
	inner join DeTai on HuongDan.madt = Detai.madt
    where 
    DeTai.tendt ="Demo game new"
    group by SinhVien.masv;
-- Question 3
create view SinhVienInfo 
as
select SinhVien.masv,SinhVien.hoten,DeTai.tendt
from SinhVien,DeTai
   inner join HuongDan on SinhVien.masv = HuongDan.masv
   inner join DeTai on HuongDan.madt = Detai.madt;

select* from SinhVienInfo;
-- Question 4 
create trigger triger_sv
after insert
on SinhVien
for each row
insert into tsv;

     
     

