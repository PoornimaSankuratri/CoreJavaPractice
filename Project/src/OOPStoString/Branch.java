package OOPStoString;

import java.util.Objects;

public class Branch {
	String branchname;
	int branchid;
	int Numberofsections;
	int Numberoffaculty;
	int Numberoflabs;
	int Numberofstudents;

	public boolean equalto(Branch b) {
		if (branchname.equals(b.branchname) && branchid == b.branchid && Numberofsections == b.Numberofsections 
				&& Numberoffaculty == b.Numberoffaculty && Numberoflabs == b.Numberoflabs && Numberofstudents == b.Numberofstudents) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Branchname " + branchname + " , branchid " + branchid + ", Numberofsections " + Numberofsections
				+ " , Numberoffaculty " + Numberoffaculty + " , Numberofstudents " + Numberofstudents;
	}
}
