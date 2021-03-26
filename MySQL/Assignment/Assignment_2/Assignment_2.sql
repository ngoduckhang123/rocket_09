
create database Quan_ly_Fresher;

use Quan_ly_Fresher;

create table if not exists Trainee (
       TraineeID                int auto_increment primary key,
       FullName                 varchar(50),
       BirthDay                 date,
       Gender                   enum ('male', 'female', 'unknow'),
       ET_IQ                    tinyint unsigned,
       ET_Gmath                 tinyint unsigned,
       ET_English               tinyint unsigned,
       Training_Class           varchar(10),
       Evaluation_Notes         text
       );
Alter table Trainee add VTI_Account varchar(30) NOT NULL unique;

create table DataType1(
       ID1               int auto_increment primary key,
       Name1             char(50),
       Code1             varchar(5),
       ModifiedDate      datetime
       );
       
create table DataType2(
      ID2                int auto_increment primary key,
      Name2              char(50),
      BirthDate          date,
      Gender             enum('0','1','Null'),
      IsDeleteFlag       enum('0','1')
      );
alter table Trainee drop VTI_Account  ;
truncate table Trainee;

INSERT INTO Trainee
VALUES (1, 'Đình Tuấn', '1999-07-23', 'Male', 20, 20, 50, 'A007', 'Perfect'),
       (2, 'Bảo Anh', '1999-10-05', 'Male', 10, 10, 25, 'A007', 'Mischief'),
       (3, 'Thùy Dương', '1999-12-03', 'Female', 14, 16, 45, 'A002', 'Docile'),
	   (4, 'Quỳnh Anh', '1999-12-10', 'Female', 10, 20, 15, 'A001', 'Docile'),
	   (5, 'Đình Tú', '2002-01-22', 'Male', 9, 10, 36, 'A004', 'Mischief'),
       (6, 'Đậu Hiền', '1999-06-14', 'Female', 3, 10, 50, 'A002', 'Docile'),
       (7, 'Đắc Công', '1999-01-01', 'Male', 10, 10, 16, 'A006', 'Mischief'),
       (8, 'Trà My', '1999-03-05', 'Female', 12, 14, 35, 'A001', 'Docile'),
       (9, 'Phan Ngọc', '1977-06-01', 'Female', 20, 20, 40, 'A003', 'Perfect'),
       (10, 'Nguyễn Ngân', '1999-07-23', 'Female', 15, 12, 25, 'A005', 'Docile'),
       (11, 'Nguyễn Thảo', '1999-11-19', 'Female', 1, 2, 25, 'A003', 'Mischief'),
       (12, 'Phương Hoa', '1999-04-16', 'Female', 5, 2, 29, 'A004', 'Docile'),
       (13, 'Đức Vượng', '1999-07-19', 'Male', 15, 12, 45, 'A005', 'Docile');

select * from Trainee;

select 
       FullName,month(BirthDay),BirthDay
from 
       Trainee
where 
       ET_IQ >10
group by 
	   month(BirthDay);
       
--Câu3 

select * from Trainee
where length(FullName) = (select max(length(FullName)) from Trainee);

-Cau4
select * from Trainee
where ET_IQ >=8 and ET_Gmath >=8 and ET_English >=18 and ET_IQ + ET_Gmath >= 20;

--Cau5
delete from trainee where TraineeID = 3;

--Cau6
update trainee set Training_Class =A002 where TraineeID =5; 

drop table merchandise;
create table if not exists merchandise(
merchansise_number varchar(50) primary key,
merchandise_name   varchar(50),
unit_price int);
drop table orders;
create table if not exists orders(
customer_name varchar(50) ,
merchansise_number varchar(50),
foreign key(merchansise_number) references merchandise(merchansise_number));

insert into merchandise(merchansise_number,merchandise_name,unit_price)
value ('tv28','28-inch television','250000');
insert into merchandise(merchansise_number,merchandise_name,unit_price)
value ('tv28w','28-inch television','250000');
insert into merchandise(merchansise_number,merchandise_name,unit_price)
value ('tv32','32-inch television','300000');
insert into merchandise(merchansise_number,merchandise_name,unit_price)
value ('tv32w','32-inch television','300000');


insert into orders(customer_name,merchansise_number)
value('OyamaShoten','TV28');
insert into orders(customer_name,merchansise_number)
value('OyamaShoten','TV28w');
insert into orders(customer_name,merchansise_number)
value('OyamaShoten','TV32');
insert into orders(customer_name,merchansise_number)
value('OyamaShokai','TV32');
insert into orders(customer_name,merchansise_number)
value('OyamaShokai','TV32w');


SELECT DISTINCT customer_name, merchandise_name, unit_price
FROM orders, merchandise
WHERE orders.merchansise_number = merchandise.merchansise_number

