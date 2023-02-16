package problem4;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Student> mp = new HashMap<>();
		mp.put("India", new Student(71, "Prathmesh", "pratham@gmail.com", 550));
		mp.put("America", new Student(74, "Ramesh", "pratham@gmail.com", 890));
		mp.put("Englan", new Student(60, "Shubham", "pratham@gmail.com", 878));
		mp.put("Norway", new Student(88, "Rajesh", "pratham@gmail.com", 677));
		mp.put("Japan", new Student(34, "Mukund", "pratham@gmail.com", 454));
		mp.put("New Zeeland", new Student(67, "Sara", "pratham@gmail.com", 777));
		mp.put("Zimbamve", new Student(89, "Alia", "pratham@gmail.com", 686));
		mp.put("Antartika", new Student(68, "Dipika", "pratham@gmail.com", 879));
		mp.put("Thailand", new Student(39, "Varun", "pratham@gmail.com", 437));
		mp.put("Korea", new Student(56, "Salman", "pratham@gmail.com", 789));
		
//		for(Map.Entry<String, Student> el : mp.entrySet())
		System.out.println(mp);

	}

}
