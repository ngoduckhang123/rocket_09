package com.vti.academy.entity;

import java.time.LocalDateTime;

public class Question {
	int questionId;
	String content;
	CategoryQuestion categoryQ;
	TypeQuestion typeQ;
	int creatorId;
	LocalDateTime createDate;

}
