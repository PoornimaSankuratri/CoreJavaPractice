package InterfaceEmployee;

public class Main {
	public static void main(String args[]) {
		Designation d1 = new Designation(1, "PAT", 20000, 30000, true);
		Designation d2 = new Designation(2, "PA", 35000, 50000, true);
		Designation d3 = new Designation(3, "Associate", 55000, 75000, false);
		Designation d4 = new Designation(4, "Senior Associate", 80000, 90000, false);
		Designation d5 = new Designation(5, "Manager", 95000, 150000, true);
		Designation d6 = new Designation(6, "Seenior Manager", 150000, 200000, true);

		DesignationMethods db = new DesignationBuilder();

		db.addDesignation(d1);
		db.addDesignation(d2);
		db.addDesignation(d3);
		db.addDesignation(d4);
		db.addDesignation(d5);
		db.addDesignation(d6);

		Employee e1 = new Employee(1, "POORNIMA", "FEMALE", 25000, db.getDesignation(1));
		Employee e = new Employee(1, "POORNIMA", "FEMALE", 25000, db.getDesignation(1));
		Employee e2 = new Employee(2, "HEMA", "FEMALE", 45000, db.getDesignation(2));
		Employee e3 = new Employee(3, "SWETHA", "FEMALE", 65000, db.getDesignation(3));
		Employee e4 = new Employee(4, "ANI", "MALE", 85000, db.getDesignation(4));
		Employee e5 = new Employee(5, "RAJENDRA", "MALE", 95000, db.getDesignation(5));
		Employee e6 = new Employee(6, "CHINTU", "FEMALE", 100000, db.getDesignation(6));

		EmployeeMethods eb = new EmployeeBuilder();

		eb.addEmployee(e1);
		eb.addEmployee(e2);
		eb.addEmployee(e3);
		eb.addEmployee(e4);
		eb.addEmployee(e5);
		eb.addEmployee(e6);

		eb.getAllEmployees();
		eb.updateSalary(1, 30000);
		eb.getAllEmployees();

		if (e1.equals(e)) {
			System.out.println("Objects are matching");
		} else {
			System.out.println("Objects are not matching");
		}
	}
}
