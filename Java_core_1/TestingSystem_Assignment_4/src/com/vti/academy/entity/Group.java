package com.vti.academy.entity;

import java.time.LocalDateTime;

public class Group {
	int groupId;
	String groupName;
	int creatorId;
	LocalDateTime createD;
	Account[] accounts;

}
