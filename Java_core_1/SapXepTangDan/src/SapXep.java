import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SapXep {
	public static void Question1() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(9);
		int b = 2;

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > b) {
				numbers.add(i, b);
				break;
			}
		}
		for (Integer i : numbers) {
			System.out.println(i + "");
		}
	}

}