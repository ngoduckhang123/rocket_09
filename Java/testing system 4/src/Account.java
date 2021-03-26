

public class Account {
	int id;
	String email;
	String usename;
	String firstName;
	String lastName;
	String fullName;
	Position position;
	LocalDate createDate;

	public void Account() {
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

	public Account(int id, String email, String usename, String fullname, Position position) {
		this.id = id;
		this.email = email;
		this.usename = usename;
		this.fullName = "Họ tên:" + firstName + lastName;
		this.position = position;
		this.createDate = createDate;
	}
}
