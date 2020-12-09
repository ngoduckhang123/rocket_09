create database if not exists ThucTap;
use ThucTap;
 create table if not exists Country(
 country_id           int auto_increment primary key,
 country_name         varchar(50));
 create table if not exists Location(
 location_id          int auto_increment primary key,
 street_address       varchar(100),
 postal_code          varchar(50),
 country_id           int,
 foreign key (country_id) references Country(country_id));
 create table if not exists Employee(
 employee_id          int auto_increment primary key,
 full_name            varchar(50),
 email                varchar(50),
 location_id          int,
 foreign key (location_id) references Location(location_id));
 
 insert into Country(country_id,country_name)
 values            (1,'Việt Nam');
 insert into Country(country_id,country_name)
 values            (2,'Nhật Bản'),
				   (3,'Hàn Quốc');
                   
select *from Country;

insert into Location(location_id, street_address, postal_code, country_id)
values              (1,'Hà Nội','A007',1);
insert into Location(location_id, street_address, postal_code, country_id)
values              (2,'Osaka','A002',2),
					(3,'Busan','A005',3);
                    
select * from Location;

insert into Employee(employee_id, full_name, email, location_id)
values              (1,'ngo duc khang','ndk@gmail.com',1);
insert into Employee(employee_id, full_name, email, location_id)
values              (2,'ngo van hong son','nvhs@gmail.com',2),
                    (3,'nguyen duy phuc','ndp@gmai.com',3);
select*from Employee;
--a

select * from Employee
inner join Location on Employee.location_id = Location.location_id
inner join Country on Location.country_id = Country.country_id
where Country.country_name = 'Hàn Quốc';

--b

select country_name from Country
inner join Location on Country.country_id = Location.country_id
inner join Employee on  Location.location_id= Employee.location_id
where  Employee.email='ndp@gmai.com';

--c

select count(employee_id) from Country,Location
inner join Location on Employee.location_id = Location.location_id
inner join Country on Location.country_id = Country.country_id
where 





