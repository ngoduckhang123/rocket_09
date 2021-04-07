import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		int age;
		int[] numbers = { 1, 2, 3 };
		System.out.println(numbers[10]);
		try {
			float result = dilide(7, 0);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("cannot dilide 0!");
		} finally {
			System.out.println("divide completed!");
		}

	}

	private static int inputAge() throws Exception {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			int age = scanner.nextInt();
			
			if(age<0) {
				System.out.println("Wrong inputing! The age must be greater than 0, please input again");
			}
			scanner.close();
			return age;
		} catch (Exception e) {
			throw new Exception("Nhap so nguyen");
		}
		
	}

	private static float dilide(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}
