import java.time.LocalDate;

public class Exercise1 {
	public class Department {
		int id;
		String name;

		public void Department() {

		}

		public Department(String nameDepartment) {
			this.name = nameDepartment;
			this.id = 0;
		}
	}

	public class Account {
		int id;
		String email;
		String userName;
		String firstName;
		String lastName;
		String fullName;
		Position position;
		LocalDate createDate;
		Group[] groups;

		public void Account() {
		}

		public void Acount(int id, String email, String usename, String firstname, String lastName) {
			this.id = id;
			this.email = email;
			this.userName = usename;
			this.firstName = firstname;
			this.lastName = lastName;
			this.fullName = "Họ tên:" + firstname + lastName;
		}

		Account(String email, String username, String firstName, String lastName, Position position) {
			this.email = email;
			this.userName = username;
			this.fullName = firstName + " " + lastName;
			this.position = position;
			this.createDate = LocalDate.now();
		}

		Account(int id, String email, String username, String firstName, String lastName, Position position,
				LocalDate createDate) {
			this.id = id;
			this.email = email;
			this.userName = username;
			this.fullName = firstName + " " + lastName;
			this.position = position;
			this.createDate = createDate;
		}
	}

	public class Group {
		String name;
		String creator;
		String userName;
		Account[] account;
		String[] string;
		LocalDate createDate;

		Group() {

		}

		Group(String name, String creator, Account[] account, LocalDate createDate) {
			this.name = name;
			this.creator = creator;
			this.account = account;
			this.createDate = createDate;

		}

		Group(String name, String creator, Account[] account, String[] string, LocalDate createDate) {
			this.name = name;
			this.creator = creator;
			this.account = account;
			this.string = string;
			this.createDate = createDate;

		}
	}
}