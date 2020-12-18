import java.sql.Date;
import java.util.Locale;

public class Exercise2 {

	public static void main(String[] args) {
//Question 1
	
	System.out.printf("Số nguyên : %d%n",5);
//Question 2
	System.out.printf(Locale.US,"%,d%n",100000000);
//Question 3	
	System.out.printf("%.4f%n",5.567098 );
//Question 4
	String string = "'Nguyễn Văn A'";
	System.out.printf("%s\n","Tôi tên là "+string+" và tôi đang độc thân");
//Question 5
	Date date = new Date(0);
	System.out.printf("%1$td/%1$tm/%1$ty  %tHh: %tMp: %tSs%n",date,date,date,date);
//Question6
	}
	
}
