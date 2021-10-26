package EmployeeManagementSystem;

public class Main {
	public static void main(String args[]) {
		DesignationBuilder db = new DesignationBuilder();
		EmployeeBuilder eb = new EmployeeBuilder();

		Designation d1 = new Designation(1, "PAT", 20000, 30000, true);
		Designation d2 = new Designation(2, "PA", 35000, 50000, true);
		Designation d3 = new Designation(3, "Associate", 55000, 75000, false);
		Designation d4 = new Designation(4, "Senior Associate", 80000, 90000, false);
		Designation d5 = new Designation(5, "Manager", 95000, 150000, true);
		Designation d6 = new Designation(6,"Seenior Manager",150000,200000,true);
		
		db.addDesignation(d1);
		db.addDesignation(d2);
		db.addDesignation(d3);
		db.addDesignation(d4);
		db.addDesignation(d5);
		db.addDesignation(d6); 
		
		
	}

}
