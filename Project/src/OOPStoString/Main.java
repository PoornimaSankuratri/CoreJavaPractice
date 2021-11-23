package OOPStoString;

public class Main {
public static void main(String args[]) {
	University U = new University();
	U.UniversityName = "JNTUK";
	U.Regulation = "R13";
	U.Colleges = "VASAVI";
	System.out.println(U);
	College C = new College();
	C.Collegename = "VASAVI";
	C.Villagename = "Tadepalligudem";
	C.numberofbranches = 6;
	C.university = "JNTUK";
	C.numberofblocks = 10;
	C.numberofcanteens = 3;
	System.out.println(C);
	Branch B = new Branch();
	B.branchname = "CSE";
	B.branchid = 5;
	B.Numberofsections = 3;
	B.Numberoffaculty = 30;
	B.Numberoflabs = 3;
	B.Numberofstudents = 300;
	Branch B1 = new Branch();
	B1.branchname = "CSE";
	B1.branchid = 5;
	B1.Numberofsections = 3;
	B1.Numberoffaculty = 30;
	B1.Numberoflabs = 3;
	B1.Numberofstudents = 300;
	System.out.println(B);
	Student S = new Student();
	S.id = "14A81A0551";
	S.name = "Poornima";
	S.gender = "Female";
	S.branch = "CSE";
	S.section = 'A' ;
    S.percentage = 69.6;
    S.grade = 'A';
    System.out.println(S);
    
    if(B.equalto(B1)) {
    	System.out.println("Objects are matching");
    }
    else {
    	System.out.println("Objects are not matching");
    }
}
}
