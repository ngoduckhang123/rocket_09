import java.util.Date;

public class program {
	public static void main(String[] args) {
		department department1 = new department();
		department1.id = 1;
		department1.name ="Sale";
		
		department department2 = new department();
		department2.id = 2;
		department2.name ="Marketing";
		
		position position1 = new position();
		position1.id = 1;
		position1.name="";
		
		account account1 = new account();
		account1.id=1;
		account1.email= "ndk@gmail.com";
		account1.userName = "khang";
		account1.fullName = "ngo duc khang";
		account1.department = department1;
		account1.position = position1;
		account1.createDate =new Date("2021/01/22");
		
		account account2 = new account();
		account2.id=2;
		account2.email= "ndp@gmail.com";
		account2.userName = "phuc";
		account2.fullName = "nguyenduyphuc";
		account2.department = department2;
		account2.position = position1;
		account2.createDate =new Date("2021/01/1");
		
		group group1 =new group();
		group1.id= 1;
		group1.name="VTI1";
		
		group group2 =new group();
		group2.id= 2;
		group2.name="VTI2";
		
		groupaccount groupaccount1 = new groupaccount();
		groupaccount1.account = account1;
		groupaccount1.group = group1;
		groupaccount1.joinDate = new Date();
		
		groupaccount groupaccount2 = new groupaccount();
		groupaccount2.account = account1;
		groupaccount2.group = group2;
		groupaccount2.joinDate = new Date();
		
		groupaccount[] groupaccounts = {groupaccount1,groupaccount2};
		account1.groups = groupaccounts;
		
		
		System.out.println("account1 :"+ account1.fullName);
		
	}
}
