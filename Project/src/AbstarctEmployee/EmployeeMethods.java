package AbstarctEmployee;

public abstract class EmployeeMethods {
	abstract boolean addEmployee(Employee ee);

	abstract Employee getEmployee(int id);

	abstract void removeEmployee(int id);

	abstract void getAllEmployees();

	abstract void replaceEmployee(int id, Employee newemployee);

	abstract Employee updateSalary(int id, int salary);
}
