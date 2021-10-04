package OOPSObjectInClass;

public class Main {
	public static void main(String args[]) {
		University U = new University();
		U.UniversityName = "JNTUK";
		U.Regulation = "R13";
		U.Colleges = "VASAVI";
		University U1 = new University();
		U1.UniversityName = "JNTUK";
		U1.Regulation = "R13";
		U1.Colleges = "SASI";
		College C = new College();
		C.Villagename = "PedaTadepalligudem";
		C.numberofbranches = 5;
		C.numberofblocks = 10;
		C.numberofcanteens = 3;
		C.university = U;
		College C1 = new College();
		C1.Villagename = "Tadepalligudem";
		C1.numberofbranches = 6;
		C1.numberofblocks = 12;
		C1.numberofcanteens = 1;
		C1.university = U1;
		Branch B = new Branch();
		B.branchname = "CSE";
		B.branchid = 5;
		B.section = 'A';
		B.Numberoffaculty = 20;
		B.Numberoflabs = 3;
		B.Classstrength = 60;
		Student S = new Student();
		S.id = "14A81A0551";
		S.name = "POORNIMA";
		S.gender = "Female";
		S.branch = B;
		S.section = 'A';
	    S.percentage = 69.6;
	    S.grade = 'A';
	    S.college = C;
	    System.out.println(S);
		Student S1 = new Student();
		S1.id = "14A81A0506";
		S1.name = "HEMA";
		S1.gender = "Female";
		S1.branch = B;
		S1.section = 'A';
	    S1.percentage = 70.5;
	    S1.grade = 'A';
	    S1.college = C;
	    System.out.println(S1);
		Student S2 = new Student();
		S2.id = "14A81A0506";
		S2.name = "SWETHA";
		S2.gender = "Female";
		S2.branch = B;
		S2.section = 'A';
	    S2.percentage = 70.5;
	    S2.grade = 'A';
	    S2.college = C1;
	    System.out.println(S2);

	}
}
