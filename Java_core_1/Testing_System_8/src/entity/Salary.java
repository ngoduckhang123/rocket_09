package entity;

public class Salary<N extends Number> {
	private N id;

	public Salary(N id) {
		this.id = id;
	}

//	public Salary() {
//		// TODO Auto-generated constructor stub
//	}

	public N getId() {
		return id;
	}

	public void setId(N id) {
		this.id = id;
	}

}
