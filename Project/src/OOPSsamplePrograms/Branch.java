package OOPSsamplePrograms;

public class Branch {
	private String branchname;
	private int branchid;

	public Branch() {
	}

	public Branch(String branchname, int branchid) {
		this.branchname = branchname;
		this.branchid = branchid;
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

	public String toString() {
		return "Branchname " + branchname + " , branchid " + branchid;
	}
}
