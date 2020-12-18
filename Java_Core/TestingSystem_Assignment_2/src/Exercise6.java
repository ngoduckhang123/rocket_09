
public class Exercise6 {
	public static void main(String[] args) {
		soChanND();
		soNguyenDuong();
	}
	
	//Question1
	public static void soChanND() {
		System.out.println("Số chẵn nguyên dương nhỏ hơn 10:");
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	//Question 3
	public static void soNguyenDuong() {
		System.out.println("Số nguyên dương nhỏ hơn 10:");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

}
