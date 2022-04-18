package training.sample.collections;

import java.util.Iterator;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		DepartmentService service = new DepartmentService();
		service.addDepartment(new Department(100, "EEE"));
		service.addDepartment(new Department(200, "ECE"));
		service.addDepartment(new Department(300, "CSE"));

		Set<Department> dpartments = service.getDepartment();
		Iterator<Department> itr = dpartments.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------------");
		
		service.addEmpToDept(100, new Employee(10,"Ajay",1000));
		service.addEmpToDept(100, new Employee(20,"Vjay",3000));
		service.addEmpToDept(200, new Employee(30,"Sjay",2000));
		service.addEmpToDept(300, new Employee(40,"Cjay",5000));
		
		for(Employee emp:service.getEmployeesInDept(100)) {
			System.out.println(emp);
		}
	}
}
