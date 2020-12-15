
import java.util.Date;
 

public class Program {
	public static void main() {
		// create department
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Tài chính";

		// create position
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;
		
		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.MASTER;
		
		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.TEST;

		// create_acccount
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "ngoduckhang@gmail.com";
		account1.userName = "khang";
		account1.fullName = "ngoduckhang";
		account1.departmentID = department1;
		account1.positionID = position1;
		account1.creatDate = new Date();
		
		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "nguyenduyphuc@gmail.com";
		account2.userName = "phuc";
		account2.fullName = "nguyenduyphuc";
		account2.departmentID = department2;
		account2.positionID = position2;
		account2.creatDate = new Date();
		
		Account account3 = new Account();
		account3.accountID = 3;
		account3.email = "ngominhtien@gmail.com";
		account3.userName = "tien";
		account3.fullName = "ngominhtien";
		account3.departmentID = department3;
		account3.positionID = position3;
		account3.creatDate = new Date();
		
		//create 
	};

}
