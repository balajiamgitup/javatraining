package training.sample.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DepartmentService {

	Map<Department, List<Employee>> mp = new HashMap<>();

	String addDepartment(Department dept) {
		mp.put(dept, new ArrayList<>());
		return "Department added";
	}

	Set<Department> getDepartment() {
		Set<Department> departments = mp.keySet();
		return departments;
	}

	String addEmpToDept(int deptId, Employee emp) {
		Set<Department> departments = mp.keySet();
		Iterator<Department> itr = departments.iterator();
		while (itr.hasNext()) {
			Department dept = itr.next();
			if (dept.getDeptId() == deptId) {
				mp.get(dept).add(emp);
			}

		}
		return "Employee Added";

	};

	List<Employee> getEmployeesInDept(int deptId) {
		Set<Department> departments = mp.keySet();
		Iterator<Department> itr = departments.iterator();
		while (itr.hasNext()) {
			Department dept = itr.next();
			if (dept.getDeptId() == deptId) {
				return mp.get(dept);
			}

		}
		return null;
	}

}
