package day.six.collection;

public class Employee implements Comparable<Employee>{
	
	private int employeeID;
	private String name;
	private String designation;
	private double salary;
	public Employee(int employeeID, String name, String designation, double salary) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.employeeID - o.employeeID;
	}
	
	

}
