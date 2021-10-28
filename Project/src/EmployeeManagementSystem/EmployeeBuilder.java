package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBuilder {
	List<Employee> employees = new ArrayList<>();

	public boolean addEmployee(Employee ee) {
		for (Employee e : employees) {
			if (e.getId() == ee.getId()) {
				return false;
			}
		}
		employees.add(ee);
		return true;
	}

	public Employee getEmployee(int id) {
		for (Employee e : employees) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	public void removeEmployee(int id) {
		Employee temp = null;
		boolean find = false;
		for (Employee e : employees) {
			if (e.getId() == id) {
				temp = e;
				find = true;
				break;
			}
		}
		if (find) {
			employees.remove(temp);
		}
	}

	public void getAllEmployees() {
		System.out.println("Employees are ");
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	public void replaceEmployee(int id, Employee newemployee) {
		removeEmployee(id);
		addEmployee(newemployee);
	}

	public Employee updateSalary(int id, int salary) {
		Employee temp = null;
		for (Employee e : employees) {
			if (e.getId() == id) {
				e.setSalary(salary);
				temp = e;
			}
		}
		return temp;

	}
}
