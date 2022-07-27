package Encapsulation;

public class EmployeeData {

	// private data variables
	private int ssn;
	private String empName;
	private int empAge;

	// public methods - to set and get values of fields
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeData emp = new EmployeeData();
		emp.setEmpName("TOM Peter");
		emp.setEmpAge(29);
		emp.setSsn(123456);

		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpAge());
		System.out.println(emp.getSsn());

	}

}
