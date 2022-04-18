package training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee(1, "java"));
		lst.add(new Employee(2, "oracle"));
		lst.add(new Employee(3, "java"));
		lst.add(new Employee(1, "java"));

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		System.out.println("-------------------------");
		Collections.sort(lst, new EmployeeComparator());
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}

	}
}
