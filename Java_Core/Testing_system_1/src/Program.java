//import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
	public static void main(String[] args) {
		//create Department
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "room1";
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "room2";
		
		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "room3";
		
		//create Position
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.DEV;
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = PositionName.MASTER;
		
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = PositionName.TEST;
		
		//create Account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "ngoduckhang@gmail.com";
		account1.userName = "khang";
		account1.fullName = "ngoduckhang";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.of(2020, 4, 20);
		
		
		Account account2 = new Account();
		account2.accountId = 1;
		account2.email = "nguyenduyphuc@gmail.com";
		account2.userName = "phuc";
		account2.fullName = "nguyenduyphuc";
		account2.department = department2;
		account2.position = position2;
		account2.createDate =LocalDate.of(2020, 6, 10);
		
		Account account3 = new Account();
		account3.accountId = 1;
		account3.email = "nguyensontung@gmail.com";
		account3.userName = "tung";
		account3.fullName = "nguyensontung";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.of(2020, 5, 11);
		
	
		
		//create Group
		Group group1 = new Group();
		group1.groupId =1;
		group1.groupName="Anti-Fan";
		group1.creatorId = 1;
		group1.createD = LocalDateTime.now();
		
		
		Group group2 = new Group();
		group2.groupId =2;
		group2.groupName="Fan";
		group2.creatorId = 2;
		group2.createD = LocalDateTime.now();
		
		Group group3 = new Group();
		group3.groupId =3;
		group3.groupName="VBIT";
		group3.creatorId = 3;
		group3.createD = LocalDateTime.now();
		
		Group[] groupAcc1 = {group1,group2};
		account1.groups = groupAcc1;
		
		Group[] groupAcc2 = {group2,group3};
		account2.groups = groupAcc2;
		
		Group[] groupAcc3 = {group1,group2,group3};
		account3.groups = groupAcc3;
		
		Account[] accountGroup1 = {account1};
		group1.accounts = accountGroup1;
		
		Account[] accountGroup2 = {account2};
		group2.accounts = accountGroup2;
		
		Account[] accountGroup3 = {account3};
		group3.accounts = accountGroup3;
		
		//create TypeQuestion
		TypeQuestion typequestion1 = new TypeQuestion();
		typequestion1.typeId=1;
		typequestion1.typeName=TypeName.ESSAY;
		
		TypeQuestion typequestion2 = new TypeQuestion();
		typequestion2.typeId=2;
		typequestion2.typeName=TypeName.MULTIPLECHOICE;
	
		
		//create CategoryQuestion
		CategoryQuestion categoryquestion1 = new CategoryQuestion();
		categoryquestion1.categoryId=1;
		categoryquestion1.categoryName="Java"; 
		
		CategoryQuestion categoryquestion2 = new CategoryQuestion();
		categoryquestion2.categoryId=2;
		categoryquestion2.categoryName="MySQL";
		
		CategoryQuestion categoryquestion3 = new CategoryQuestion();
		categoryquestion3.categoryId=3;
		categoryquestion3.categoryName="Git";
		
		//create question
		Question question1 = new Question();
		question1.questionId =1;
		question1.content="Hướng đối tượng là gì";
		question1.categoryQ = categoryquestion1;
		question1.typeQ = typequestion1;
		question1.creatorId =1;
		question1.createDate=LocalDateTime.now();
		
		Question question2 = new Question();
		question2.questionId =2;
		question2.content="Định nghĩa View";
		question2.categoryQ = categoryquestion2;
		question2.typeQ = typequestion1;
		question2.creatorId =2;
		question2.createDate=LocalDateTime.now();
		
		Question question3 = new Question();
		question3.questionId =3;
		question3.content="Các bước up git";
		question3.categoryQ = categoryquestion3;
		question3.typeQ = typequestion2;
		question3.creatorId =3;
		question3.createDate=LocalDateTime.now();
		
		//create Answer
		Answer answer1 = new Answer();
		answer1.answerId =1;
		answer1.content="...";
		answer1.question=question1;
		answer1.isCorrect=true;
		
		Answer answer2 = new Answer();
		answer2.answerId =2;
		answer2.content="...";
		answer2.question=question2;
		answer2.isCorrect=true;
		
		Answer answer3 = new Answer();
		answer3.answerId =3;
		answer3.content="...";
		answer3.question=question3;
		answer3.isCorrect=false;
		
		//create Exam 
		Exam exam1 = new Exam();
		exam1.examId=1;
		exam1.code="m1";
		exam1.title="kiem tra giua ky";
		exam1.creatorId=1;
		exam1.duration=45;
		exam1.categoryId=1;
		exam1.createDate=LocalDateTime.now();
		
		Exam exam2 = new Exam();
		exam2.examId=2;
		exam2.code="m2";
		exam2.title="kiem tra cuoi ky";
		exam2.creatorId=2;
		exam2.duration=90;
		exam2.categoryId=2;
		exam2.createDate=LocalDateTime.now();
		
		Question[] questionExam1= {question1,question2};
		exam1.questions=questionExam1;
		
		Question[] questionExam2= {question3,question2};
		exam2.questions=questionExam2;
		
		//print
		// Department
		System.out.println("Thông tin phòng 1:");
		System.out.println("id:"+ department1.departmentId);
		System.out.println("name:"+ department1.departmentName);
		System.out.println("Thông tin phòng 2:");
		System.out.println("id:"+ department2.departmentId);
		System.out.println("name:"+ department2.departmentName);
		System.out.println("Thông tin phòng 3:");
		System.out.println("id:"+ department3.departmentId);
		System.out.println("name:"+ department3.departmentName);
		System.out.println("\n");
		
		//Position
		System.out.println("Position ID 1: "+ position1.positionId);
        System.out.println("Position Name: "+ position1.positionName);
        System.out.println("Position ID 2: "+ position2.positionId);
        System.out.println("Position Name: "+ position2.positionName);
        System.out.println("Position ID 3: "+ position3.positionId);
        System.out.println("Position Name: "+ position3.positionName);
        System.out.println("\n");
        
        //Account
        System.out.println("Account ID 1: "+account1.accountId);
        System.out.println("Email: "+account1.email);
        System.out.println("Full Name: "+account1.fullName);
        System.out.println("Department Name: "+account1.department.departmentName);
        System.out.println("Position Name: "+account1.position.positionName);
        System.out.println("Create date: "+account1.createDate);
        System.out.println("groupAcc1: ");
        for(int i=0;i<account1.groups.length;i++){
            System.out.println(account1.groups[i].groupName);
        }
        System.out.println("\n");
        
        //Group
        System.out.println("Group ID 1: "+group1.groupId);
        System.out.println("Group Name: "+group1.groupName);
        System.out.println("Creator: "+group1.creatorId);
        System.out.println("Create Date: "+group1.createD);
        System.out.println("Accounts of group1: ");
        for(int i=0;i<group1.accounts.length;i++){
            System.out.println(group1.accounts[i].fullName);
        }
        System.out.println("\n");
        
        //TypeQuestion
        System.out.println("Type ID 1: "+typequestion1.typeId);
        System.out.println("TypeQuestion Name: "+ typequestion1.typeName);
        System.out.println("\n");
        
        //CategoryQuestion
        System.out.println("categoryQ ID 1: "+ categoryquestion1.categoryId);
        System.out.println("categoryQ Name: "+ categoryquestion1.categoryName);
        System.out.println("\n");
        
        //Question
        System.out.println("Question ID 1: "+ question1.questionId);
        System.out.println("Content : "+ question1.content);
        System.out.println("category Question : "+ question1.categoryQ.categoryName);
        System.out.println("typeQuestion : "+ question1.typeQ.typeName);
        System.out.println("creatorID : "+ question1.creatorId);
        System.out.println("Create date : "+ question1.createDate);       
        System.out.println("\n");
        
      // Answer
        System.out.println("Answer id 1: "+answer1.answerId);
        System.out.println("Content: "+ answer1.content);
        System.out.println("Question: "+ answer1.question.content);
        System.out.println("is Correct: "+answer1.isCorrect);
        System.out.println("\n");
        
        // Exam
        System.out.println("Exam id 1: "+exam1.examId);
        System.out.println("title : "+ exam1.title);
        System.out.println("duration : "+ exam1.duration);
        System.out.println("creatDate : "+ exam1.createDate);
        System.out.println("Questions of exam : ");
        for(int i=0;i<exam1.questions.length;i++){
            System.out.println(exam1.questions[i].content);
	}
	}
}
