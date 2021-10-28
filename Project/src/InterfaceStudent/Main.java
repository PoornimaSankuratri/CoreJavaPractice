package InterfaceStudent;

public class Main {
	public static void main(String args[]) {

		Branch b1 = new Branch(1, "CSE");
		Branch b2 = new Branch(2, "ECE");
		Branch b3 = new Branch(3, "EEE");
		Branch b4 = new Branch(4, "CIVIL");
		Branch b5 = new Branch(5, "MECH");
		Branch b6 = new Branch(6, "IT");

		
		BranchMethods bm = new BranchBuilder();

		bm.addBranch(b1);
		bm.addBranch(b2);
		bm.addBranch(b3);
		bm.addBranch(b4);
		bm.addBranch(b5);
		bm.addBranch(b6);

		Student s1 = new Student(1, "HEMA", "Female", 'A', 65.5, 'A', bm.getBranch(1));
		Student s2 = new Student(2, "POORNIMA", "Female", 'A', 69.5, 'A', bm.getBranch(2));
		Student s3 = new Student(3, "MOUNI", "Female", 'A', 65.0, 'A', bm.getBranch(3));
		Student s4 = new Student(4, "SUJAN", "Male", 'B', 62, 'C', bm.getBranch(4));
		Student s5 = new Student(5, "ANI", "Male", 'A', 65, 'A', bm.getBranch(5));
		Student s6 = new Student(6, "SWETHA", "Female", 'A', 65, 'A', bm.getBranch(5));

		StudentMethods sm = new StudentBuilder();

		sm.addStudent(s1);
		sm.addStudent(s2);
		sm.addStudent(s3);
		sm.addStudent(s4);
		sm.addStudent(s5);
		sm.addStudent(s6);

		System.out.println(sm.getStudentByGender("Female"));
		sm.getAllStudents();
		sm.updateStudentBranch(6, b6);
		sm.getAllStudents();
	}
}
