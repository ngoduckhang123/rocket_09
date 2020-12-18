import java.time.LocalDate;
import java.time.LocalDateTime;


public class Exercise1 {
	public void main(String[] args) {
		// create Department
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "room1";

		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "room2";

		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "room3";

		// create Position
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = PositionName.MASTER;

		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = PositionName.TEST;

		// create Account
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
		account2.createDate = LocalDate.of(2020, 6, 10);

		Account account3 = new Account();
		account3.accountId = 1;
		account3.email = "nguyensontung@gmail.com";
		account3.userName = "tung";
		account3.fullName = "nguyensontung";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.of(2020, 5, 11);

		// create Group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Anti-Fan";
		group1.creatorId = 1;
		group1.createD = LocalDateTime.now();

		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "Fan";
		group2.creatorId = 2;
		group2.createD = LocalDateTime.now();

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "VBIT";
		group3.creatorId = 3;
		group3.createD = LocalDateTime.now();

		Group[] groupAcc1 = { group1, group2 };
		account1.groups = groupAcc1;

		Group[] groupAcc2 = { group2, group3 };
		account2.groups = groupAcc2;

		Group[] groupAcc3 = { group1, group2, group3 };
		account3.groups = groupAcc3;

		Account[] accountGroup1 = { account1 };
		group1.accounts = accountGroup1;

		Account[] accountGroup2 = { account2 };
		group2.accounts = accountGroup2;

		Account[] accountGroup3 = { account3 };
		group3.accounts = accountGroup3;

		// Question1
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là" + account2.department.departmentName);
		}

		// Question2

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length == 1 || account2.groups.length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");

		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

		}
		// Question3
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là" + account2.department.departmentName);

		// Question4
		System.out.println(account1.position.positionName == PositionName.DEV ? "Đây là Developer"
				: "Người này không phải là Developer");
		// Question5
		int x = group1.accounts.length;
		switch (x) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");

		}
		
		//Question6
		int y = account2.groups.length;
		switch(y) {
		case 0:
			System.out.println("Nhân viên này chưa có Group");
			break;
		case 1:
		case 2:
			System.out.println("Group của nhân viên này là");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng tham gia nhiều Group");
			break;
		case 4:
			System.out.println("Nhân viên này là người hóng chuyện");
			break;
			
		}
		
		//Question 7 
		
		switch(account1.position.positionName) {
		case DEV: 
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Đây không phải là Developer");
		}
		//Question 8
		//String[] accounts = {Account.this.email,Account.this.fullName,Department.this.departmentName};
		//for ( String account : accounts) {
		//	System.out.println(accounts);
		//}
		
		//Question 9
		//In ra thông tin các phòng ban bao gồm: id và name
        
		//Question 15
		int i;
		for(i=2;i<=20;i++)
		{
			if(i%2==0)
				System.out.println("Số chẵn nhỏ hơn hoặc bằng 20 là:");
		}
		
		//Question 16
		int so=2;
		System.out.println("Số chẵn nhỏ hơn hoặc bằng 20 là:");
		while(so<=20) {
			System.out.println(so);
			so +=2;
		}
		

	}
}
