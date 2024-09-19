package collection.set;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	
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
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		return this.employeeID - e1.employeeID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, employeeID, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && employeeID == other.employeeID
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	

}
