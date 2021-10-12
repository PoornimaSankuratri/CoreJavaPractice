package OOPSsettergetter;

public class Main {

	public static void main(String arg[]) {

		Branch B = new Branch();
		B.setBranchname("CSE");
		B.setBranchid(5);
		B.setSection('A');
		B.setNumberoffaculty(20);
		B.setNumberoflabs(3);
		B.setClassstrength(60);

		University U = new University();
		U.setUniversityName("JNTUK");
		U.setRegulation("R13");
		U.setColleges("VASAVI");

		College C = new College();
		C.setVillagename("PedaTadepalligudem");
		C.setNumberofbranches(5);
		C.setNumberofblocks(10);
		C.setNumberofcanteens(3);
		C.setUniversity(U);

		Student s1 = new Student();
		s1.setId("14A81A0551");
		s1.setName("Poornima");
		s1.setGender("Female");
		s1.setGrade('A');
		s1.setPercentage(69.6);
		s1.setSection('B');
		s1.setBranch(B);
		s1.setCollege(C);

		System.out.println(s1);

		Subject S = new Subject();
		S.setId(1);
		S.setSubjectname("TELUGU");

		University u1 = new University("JNTUH", "R15", "CMABT");

		Branch b1 = new Branch("ECE", 4, 'B', 21, 2, 60);

		College c1 = new College("Hyderabad", 7, 20, 5, u1);

		Student s2 = new Student("14A81A0506", "HEMA", "Female", 'A', 65.5, 'A', b1, c1);

		System.out.println(s2);

	}
}
