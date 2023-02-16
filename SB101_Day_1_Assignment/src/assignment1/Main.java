package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1234, "prathmesh", "maharashtra", 4000));
		list.add(new Employee(3242, "ramesh", "buldhana", 4500));
		list.add(new Employee(4353, "ritesh", "chandigarh", 6000));
		list.add(new Employee(1231, "salman", "panjab", 5000));
		list.add(new Employee(5644, "shahrukh", "karnataka", 7000));
		list.add(new Employee(2342, "narendra", "bengluru",3500));
		list.add(new Employee(2311, "uddhav", "pune", 6500));
		list.add(new Employee(2341, "raj", "mumbai", 4000));
		list.add(new Employee(3245, "shardchandra", "kolkatta", 8000));
		list.add(new Employee(5466, "aniket", "amritsar", 3000));
		list.add(new Employee(3432, "bhairav", "ladakh", 4500));
		System.out.println(list.toString());
		
		Increment is = (Employee e)->{
			if(e.getSalary()<5000) {
				e.setSalary(e.getSalary()+1000);
			}
		};
		
		for(Employee el : list) {
			is.increseSalary(el);
		}
		
		System.out.println(list);
		
	}

}
