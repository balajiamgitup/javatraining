package training.sample.collections;

public class Department {

	private int deptId;
	private String deptNm;

	public Department() {

	}

	public Department(int deptId, String deptNm) {
		super();
		this.deptId = deptId;
		this.deptNm = deptNm;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptNm() {
		return deptNm;
	}

	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptNm=" + deptNm + "]";
	}

}
