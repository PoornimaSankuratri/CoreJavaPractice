package OOPSObjectInClass;

public class Branch {
	String branchname;
	int branchid;
	char section;
	int Numberoffaculty;
	int Numberoflabs;
	int Classstrength;
	
	public boolean equals(Branch b) {
		if (branchname.equals(b.branchname) && branchid == b.branchid && section == b.section 
				&& Numberoffaculty == b.Numberoffaculty && Numberoflabs == b.Numberoflabs && Classstrength == b.Classstrength) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Branchname " + branchname + " , branchid " + branchid + ", Section " + section + " , Numberoffaculty " + Numberoffaculty + " , ClassStrength " + Classstrength;
	}
}
