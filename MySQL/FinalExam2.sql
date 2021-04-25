create database QLUV;
use QLUV;

drop table Employee;
create table if not exists Employee(
    IdEmployee     tinyint auto_increment primary key,
    FullName      varchar(50) not null ,
    Email         varchar(50) not null,
    Passwords     varchar(50) not null,
    ProjectId     tinyint not null,
    ProSkill      enum('dev','test','java','sql')
    );

create table if not exists Manager(
   IdManager    tinyint auto_increment primary key,
   FullName     varchar(50) not null ,
   Email        varchar(50) not null,
   Passwords    varchar(50) not null,
   ExpInYear    tinyint not null
);

create table if not exists Project(
ProjectId tinyint auto_increment primary key,
TeamSize tinyint not null,
IdManager tinyint not null,
IdEmployee tinyint not null,
foreign key(IdManager) references Manager(IdManager),
foreign key(IdEmployee) references Employee(IdEmployee));

-- add data Employee 
insert into Employee(IdEployee,FullName,Email,Passwords,ProjectId,ProSkill)
value(1,'Ngo Duc Khang','ndk@gmai.com','123456',2,dev);

-- add data Manager
insert into Manager(IdManager,FullName,Email,Passwords,ExpInyear)
value(1,"Tran Manh Tuan","tmt@gmail.com","123456",4);

-- add data Project
insert into Project(ProjectId,TeamSize,IdManager,IdEmployee)
value(2,4,1,1);


