import java.security.Timestamp;
import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {
		// Question1
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);
		// Question2
		float y = random.nextFloat();
		System.out.println(y);
		// Question3

//	  String[] ten = random.toString();
//	  ten = new String[4];
//	  ten[0] ="Khang"; 
//	  ten[1] ="Trang"; 
//	  ten[2] ="Chinh"; 
//	  ten[3] ="Nam"; 
//	 System.out.println(ten);
		// Question 4
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
		// Question 7
		int bachuso = random.nextInt((100) + 900);
		System.out.println(bachuso);

	}
}
