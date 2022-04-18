package training.sample.collections;

public class Employee {

	private int empId;
	private String empNm;
	private double salary;

	public Employee() {
	}

	public Employee(int empId, String empNm, double salary) {
		super();
		this.empId = empId;
		this.empNm = empNm;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNm=" + empNm + ", salary=" + salary + "]";
	}

}
