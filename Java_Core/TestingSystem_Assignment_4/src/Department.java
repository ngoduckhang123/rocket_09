import java.time.LocalDateTime;

import com.vti.entity.Account;

public class Department {
	int id;
	String name;

	public void Department() {
		int id;
		String name;
	}

	public Department() {
		Department();
	}

	public Department(String nameDepartment) {
		this.name = nameDepartment;
		this.id = 0;
	}

	public class Account {
		int id;
		String email;
		String usename;
		String firstName;
		String lastName;
		String fullName;

		public void Account() {
			int id;
			String email;
			String usename;
			String firstName;
			String lastName;
			String fullName;
		}

		public Account() {
			Account();
		}

		public Account(int id, String email, String usename, String firstname, String lastName) {
			this.id = id;
			this.email = email;
			this.usename = usename;
			this.firstName = firstname;
			this.lastName = lastName;
			this.fullName = "Họ tên:" + firstname + lastName;
		}
	}

	public class Group {
		String groupName;
		String creator;
		LocalDateTime createD;
		Account[] accounts;

		public void Group() {
			String groupName;
			String creator;
			LocalDateTime createD;
			Account[] accounts;
		}

		public Group() {
			Group();
		}
	}
}