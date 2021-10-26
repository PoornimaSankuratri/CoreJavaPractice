package StudentManagementSystem;

public class Branch {
	private int id;
	private String branchname;

	public Branch() {
	}

	public Branch(int id, String branchname) {
		this.id = id;
		this.branchname = branchname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String toString() {
		return "brnachid : " + id + " BranchName :" + branchname;
	}
}
