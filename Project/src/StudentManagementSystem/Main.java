package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		StudentBuilder sb = new StudentBuilder();
		BranchBuilder bb = new BranchBuilder();

		Branch b1 = new Branch(1, "cse");
		Branch b2 = new Branch(2, "ece");
		Branch b3 = new Branch(3, "eee");
		Branch b4 = new Branch(4, "civil");
		Branch b5 = new Branch(5, "mech");
		Branch b6 = new Branch(6, "it");

		bb.addBranch(b1);
		bb.addBranch(b2);
		bb.addBranch(b3);
		bb.addBranch(b4);
		bb.addBranch(b5);
		bb.addBranch(b6);

		Student s1 = new Student(1, "HEMA", "Female", 'A', 65.5, 'A', bb.getBranch(1));
		Student s2 = new Student(2, "POORNIMA", "Female", 'A', 69.5, 'A', bb.getBranch(2));
		Student s3 = new Student(3, "MOUNI", "Female", 'A', 65.0, 'A', bb.getBranch(3));
		Student s4 = new Student(4, "SUJAN", "Male", 'B', 62, 'C', bb.getBranch(4));
		Student s5 = new Student(5, "ANI", "Male", 'A', 65, 'A', bb.getBranch(5));
		Student s6 = new Student(6, "SWETHA", "Female", 'A', 65, 'A', bb.getBranch(5));

		sb.addStudent(s1);
		sb.addStudent(s2);
		sb.addStudent(s3);
		sb.addStudent(s4);
		sb.addStudent(s5);

		System.out.println(sb.getStudentByGender("Female"));

		System.out.println(sb.updateStudentBranch(4, b6));
		sb.getAllStudents();
		sb.replaceStudent(4,s6);
		
		sb.getAllStudents();
	}
}
