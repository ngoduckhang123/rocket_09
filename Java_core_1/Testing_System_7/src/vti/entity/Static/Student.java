package vti.entity.Static;

public class Student {
	private int id;
	private static String name;
	private static String college;
	private static int moneyGroup;
	public static int count = 0;

	public Student() {
		count++;
	}

	public static int getMoneyGoup() {
		return moneyGroup;
	}

	public static void setMoneyGoup(int moneyGoup) {
		Student.moneyGroup = moneyGoup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.college = "Đại học Bách Khoa";
		moneyGroup += 100;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + ", college='" + college + ", moneyGroup='" + moneyGroup
				+ '\'' + '}';
	}

}
