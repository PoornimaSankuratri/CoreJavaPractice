package OOPS;

public class Main {
	public static void main(String args[]) {
		College c = new College();
		c.Collegename = "Vasavi";
		c.Villagename = "Tadepalligudem";
		c.branches = "cse";
		c.branches = "ece";
		c.branches = "eee";
		c.branches = "civil";
		c.branches = "mechanical";
		c.branches = "IT";
		c.university = "JNTUK";
		c.numberofblocks = 10;
		c.numberofcanteens = 3;
		System.out.println(c.Collegename + " " + c.Villagename + " " + c.branches + " " + c.university + " "
				+ c.numberofblocks + " " + c.numberofcanteens);
		Student s = new Student();
		s.id = 1;
		s.name = "Poornima";
		s.gender = "Female";
		s.branch = "CSE";
		s.section = 'A';
		s.percentage = 69.66;
		s.grade = 'A';
		System.out.println(s.id + " " + s.name + " " + s.gender + " " + s.branch + " " + s.section + " " + s.percentage
				+ " " + s.grade);
		Branch b = new Branch();
		b.branchname = "CSE";
		b.Numberofsections = 12;
		b.Numberoffaculty = 33;
		b.Numberoflabs = 4;
		b.Numberofstudents = 20000;
		System.out.println(b.branchname + " " + b.Numberofsections + " " + b.Numberoffaculty + " " + b.Numberoflabs
				+ " " + b.Numberofstudents);
		Company c1 = new Company();
		c1.Companyname = "Cognizant";
		c1.Numberofblocks = 2;
		c1.NumberofEmployess = 10000;
		c1.Numberofgates = 3;
		c1.Numberofcanteens = 10;
		System.out.println(c1.Companyname + " " + c1.Numberofblocks + " " + c1.NumberofEmployess + " "
				+ c1.Numberofgates + " " + c1.Numberofcanteens);
		Employee e = new Employee();
		e.Employeeid = 80842;
		e.name = "S.Poornima";
		e.gender = "Female";
		e.designation = "PA";
		e.Salary = 35000;
		System.out.println(e.Employeeid + " " + e.name + " " + e.gender + " " + e.designation + " " + e.Salary);
		Human h = new Human();
		h.gender = "Female";
		h.numberofparts = 20;
		h.numberofeyes = 2;
		h.numberoflegs = 2;
		h.numberofhands = 2;
		System.out.println(h.gender + " " + h.numberofparts + " " + h.numberofeyes + " " + h.numberoflegs + " " +h.numberofhands);
		Designation d = new Designation();
		d.Designationname = "ProgramAnalyst";
		d.minsalary = 30000;
		d.maxsalary = 50000;
		d.permanentemployee = true;
		System.out.println(d.Designationname  + " " + d.minsalary + " " + d.maxsalary + " " + d.permanentemployee );
		
	}
}
