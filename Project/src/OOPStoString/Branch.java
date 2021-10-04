package OOPStoString;

public class Branch {
	String branchname;
	int branchid;
	int Numberofsections;
	int Numberoffaculty;
	int Numberoflabs;
	int Numberofstudents;
	
	public String toString() {
		return "Branchname " + branchname + " , branchid " + branchid + ", Numberofsections " + Numberofsections + " , Numberoffaculty " + Numberoffaculty + " , Numberofstudents " + Numberofstudents;
	}
}
