
public class Ex2 {
	public static void main(String[] args) {
		acc[] accs= new acc[5];
		for (int i = 0; i < accs.length; i++ ) {
			accs[i]= new acc();
			accs[i].email ="email"+(i+1);
			accs[i].fullName = "fullname"+(i+1);
		}
		for (int i=0;i<accs.length;i++) {
			System.out.println(accs[i].email);
			System.out.println(accs[i].fullName);
		}
	}

}
