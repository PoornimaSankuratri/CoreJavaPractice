package OOPSsettergetter;


public class Branch {
	private String branchname;
	private int branchid;
	private char section;
	private int Numberoffaculty;
	private int Numberoflabs;
	private int Classstrength;
	
	public boolean equals(Branch b) {
		if (branchname.equals(b.branchname) && branchid == b.branchid && section == b.section 
				&& Numberoffaculty == b.Numberoffaculty && Numberoflabs == b.Numberoflabs && Classstrength == b.Classstrength) {
			return true;
		}
		return false;
	}

	public Branch() {
	}

	public Branch(String branchname, int branchid, char section, int Numberoffaculty, int Numberoflabs,
			int Classstrength) {
		this.branchname = branchname;
		this.branchid = branchid;
		this.section = section;
		this.Numberoffaculty = Numberoffaculty;
		this.Numberoflabs = Numberoflabs;
		this.Classstrength = Classstrength;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public int getBranchid() {
		return branchid;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public char getSection() {
		return section;
	}

	public void setNumberoffaculty(int Numberoffaculty) {
		this.Numberoffaculty = Numberoffaculty;
	}

	public int getNumberoffaculty() {
		return Numberoffaculty;
	}

	public void setNumberoflabs(int Numberoflabs) {
		this.Numberoflabs = Numberoflabs;
	}

	public int getNumberoflabs() {
		return Numberoflabs;
	}

	public void setClassstrength(int Classstrength) {
		this.Classstrength = Classstrength;
	}

	public int getClassstrength() {
		return Classstrength;
	}

	public String toString() {
		return "Branchname " + branchname + " , branchid " + branchid + ", Section " + section + " , Numberoffaculty "
				+ Numberoffaculty + " , ClassStrength " + Classstrength;
	}
}
