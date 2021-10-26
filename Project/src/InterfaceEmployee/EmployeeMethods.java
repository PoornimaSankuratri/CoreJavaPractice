package InterfaceEmployee;

public interface EmployeeMethods {
	public boolean addEmployee(Employee ee);

	public Employee getEmployee(int id);

	public void removeEmployee(int id);

	public void getAllEmployees();

	public void replaceEmployee(int id, Employee newemployee);

	public Employee updateSalary(int id, int salary);
}
