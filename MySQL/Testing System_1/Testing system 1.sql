create database Testing_system_assignment_1;

use Testing_system_assignment_1;

create table Department(
     DepartmentID            int auto_increment primary key,
     DepartmentName          varchar(50)
     );
create table Position (
     PositionID              int auto_increment primary key,
     PositionName            enum('Dev', 'Test', 'Scrum Master', 'PM')
     );
create table Account1 (
     AccountID               int auto_increment primary key,
     Email                   varchar(50),
     Usename                 varchar(20),
     Fullname                varchar(50),
     DepartmentID            int,
     PositionID              int,
     CreateDate              date,
     foreign key (DepartmentID) references Department(DepartmentID),
     foreign key (PositionID) references Position (PositionID)
     );
create table Group1(
     GroupID                int auto_increment primary key,
     GroupName              varchar(50),
     CreatorID              int,
     CreateDate             date
     );
create table GroupAccount (
    GroupID                 int,
    AccountID               int,
    JoinDate                date,
    foreign key (GroupID) references Group1 (GroupID),
    foreign key (AccountID) references Account1 (AccountID)
    );
create table TypeQuestion (
    TypeID                  int auto_increment primary key,
    TypeName                enum('Essay', 'Multiple-Choice')
    );
create table CategoryQuestion (
    CategoryID              int auto_increment primary key,
    CategoryName            varchar(30)
    );
create table Question (
    QuestionID             int auto_increment primary key,
    Content                text,
    CategoryID             int,
    TypeID                 int,
    CreatorID              int,
    CreateDate             date,
    foreign key (CategoryID) references CategoryQuestion (CategoryID),
    foreign key (TypeID) references TypeQuestion (TypeID)
    );
create table Answer (
    AnswerID               int auto_increment primary key,
    Content                text,
    QuestionID             int,
    isCorrect              enum ('True','False'),
    foreign key (QuestionID) references Question (QuestionID)
    );
create table Exam (
    ExamID                 int auto_increment primary key,
    Code1                  varchar(10),
    Title                  text,
    CategoryID             int,
    Duration               int,
    CreatorID              int,
    CreateDate             date
    );
create table ExamQuestion (
    ExamID                 int,
    QuestionID             int,
    foreign key (ExamID) references Exam (ExamID),
    foreign key (QuestionID) references Question(QuestionID)
    );
    
insert into Department(DepartmentID, DepartmentName)
values                (1, 'Sale'     ),
					  (2, 'Marketing'),
                      (3, 'Bảo vệ'   ),
                      (4, 'Giám đốc' ),
                      (5, 'Tài chính');
		
insert into Position  (PositionID, PositionName)
values                (1, 'Dev'         ),
                      (2, 'Test'        ),
                      (3, 'Scrum Master'),
                      (4, 'PM'          ),
                      (5, 'PM'          );
                  
insert into Account1 (AccountID, Email, Usename, Fullname,DepartmentID, PositionID, CreateDate)
values               (1,N'ndk@gmail.com', N'Khang', N'Ngô Đức Khang'  ,4, 2,2020/11/2  ),
					 (2,N'nvs@gmail.com', N'Sơn'  , N'Ngô Văn Sơn'    ,2, 1,2020/11/11  ),
					 (3,N'ndp@gmail.com', N'Phúc' , N'Nguyễn Duy Phúc',5, 5,2020/11/19  ),
					 (4,N'tst@gmail.com', N'Tùng' , N'Trần Sơn Tùng'  ,1, 3,2020/11/10  ),
					 (5,N'nmt@gmail.com', N'Tiến' , N'Ngô Minh Tiến'  ,3, 4,2020/11/20  );
                      
insert into Group1   (GroupID, GroupName, CreatorID,CreateDate)
values               (1,'AntiFan',2, null),
                     (2,'Fan'    ,3, null),
                     (3,'Miss'   ,1, null),
                     (4,'Mixi'   ,4, null),
                     (5,'Game'   ,5, null);
                     select * from GroupAccount;
insert into GroupAccount (GroupID, AccountID, JoinDate)
values              (1,2,11/10/2020),
					(3,1,11/10/2020),
                    (2,4,11/10/2020),
                    (4,5,11/10/2020),
                    (5,3,11/10/2020);
insert into TypeQuestion (TypeID, TypeName)
values              (1, N'Essay'          ),
					(2, N'Multiple-Choice'),
                    (3, N'Essay'          ),
                    (4, N'Multiple-Choice'),
                    (5, N'Essay'          );
select*from TypeQuestion;
insert into CategoryQuestion (CategoryID, CategoryName)
values              (1, N'Java'   ),
                    (2, N'.NET'   ),
                    (3, N'SQL'    ),
                    (4, N'Postman'),
                    (5, N'Ruby'   );
insert into Question (QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
values              (1,null,2,3,2, 25/11/2020),
					(2,null,4,1,2, 25/11/2020),
					(3,null,1,3,2, 25/11/2020),
					(4,null,5,2,2, 25/11/2020),
					(5,null,3,3,2, 25/11/2020);
insert into Answer ( AnswerID, Content, QuestionID, isCorrect)
values             (1,null,2),
                   (2,null,3),
                   (10,null,4),
                   (8,null,2),
                   (4,null,5);
insert into Exam (ExamID, Code1, Title, CategoryID, Duration, CreatorID, CreateDate)
values           (1, A1, null, 2, 60 ,3, 26/10/2020 ),
                 (2, A2, null, 2, 60 ,3, 26/10/2020 ),
                 (3, A3, null, 2, 60 ,3, 26/10/2020 ),
                 (4, A4, null, 2, 60 ,3, 26/10/2020 ),
                 (5, A5, null, 2, 60 ,3, 26/10/2020 );
insert into ExamQuestion (ExamID, QuestionID)
values           (2,3),
				 (3,3),
				 (1,3),
				 (4,3),
				 (5,3);

                    
