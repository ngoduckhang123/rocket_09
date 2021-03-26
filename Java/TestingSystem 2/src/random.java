import java.util.Random;
import java.util.Scanner;


public class random {
	public static void main(String[] args) {
		Random random = new Random();
	String[] fullNames= {"java","develop","androi","ip"};
	int b= fullNames.length;
	int a = random.nextInt(b);
	System.out.println(fullNames[a]);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("x=");
	int a = scanner.nextInt("nhap so nguyen x :");
	}
	
	
}

  