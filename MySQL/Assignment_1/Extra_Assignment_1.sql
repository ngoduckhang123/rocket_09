create database Quan_ly_Fresher;

use Quan_ly_Fresher;

create table Trainee (
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
      