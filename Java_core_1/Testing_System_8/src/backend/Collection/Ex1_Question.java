package backend.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Ex1_Question {
	public void Question3(){

    }
    public void Question67() {
    	Map<Integer, String> students = new HashMap<>();
        students.put(1, "Khang");
        students.put(2, "Dung");
        students.put(3, "Chinh");
        students.put(4, "Nam");
        //in key
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey());

        }
        System.out.println("cau b");
        //in value
        System.out.println(students.get(1));
        System.out.println(students.get(2));
        System.out.println(students.get(3));
        System.out.println(students.get(4));

        //get key and value
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " , " + "Name: " + entry.getValue());
        }
        //sort theo ten student
        System.out.println("cau c");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " , " + "Name: " + entry.getValue());
        }
        //chuyen sang set
        Set<Integer> set =students.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + students.get(key));
        }
    }

}
