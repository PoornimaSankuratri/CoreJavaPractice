package EmployeeManagementSystem;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private String designation;
	private int Salary;
	Designation designations;
	
	public Designation getDesignations() {
		return designations;
	}
	public void setDesignations(Designation designations) {
		this.designations = designations;
	}
	public int getId() {
		return id;
	}
	public void setId(int employeeid) {
		id = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public String toString() {
		return "Employee [Employeeid=" + id + ", name=" + name + ", gender=" + gender + ", designation="
				+ designation + ", Salary=" + Salary + "]";
	}
	

}
