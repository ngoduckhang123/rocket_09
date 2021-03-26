package com.vti.entity;
import java.time.LocalDate;
//import java.time.LocalDateTime;

public class Account {
	int accountId;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;
	Group[] groups;

}
