package training.collections;

public class Employee implements Comparable<Employee> {
	public int empId;
	public String empNm;

	public Employee() {

	}

	public Employee(int empId, String empNm) {
		super();
		this.empId = empId;
		this.empNm = empNm;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNm=" + empNm + "]";
	}

	@Override
	public int compareTo(Employee o) {

		return this.empId > o.empId ? 1 : (this.empId < o.empId ? -1 : 0);
	}

}
