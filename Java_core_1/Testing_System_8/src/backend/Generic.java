package backend;

import entity.Generic.Employee;
import entity.Generic.Student;

public class Generic {
	public void Question1() {
		// tạo student có id là int
		Student<Integer> student1 = new Student<Integer>(1, "Chinh");
		// tạo student có id là float
		Student<Float> student2 = new Student<Float>(2.3f, "Mai");
		// tạo student có id là double
		Student<Double> student3 = new Student<Double>(39.9, "Lan");
		System.out.println("In student:");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

	}

	public void Question2() {
		Student<Float> student1 = new Student<Float>(2.3f, "Mai");
		print(student1);
		print(4);
		print(4.0);
	}

	public <T> void print(T a) {
		System.out.println(a);
	}

	public void Question4() {
		Integer[] arrayInt = { 1, 17, 2145 };
		Float[] arrayFloat = { 6.98f, 45.9f, 1.09f };
		Double[] arrayDouble = { 567.2, 87.8, 45.99 };
		System.out.println("in array:");
		printArray(arrayInt);
		printArray(arrayFloat);
		printArray(arrayDouble);

	}

	public <T> void printArray(T[] arrays) {
		for (T arr : arrays) {
			System.out.print(arr + " ");
		}
		System.out.println("");
	}

}
