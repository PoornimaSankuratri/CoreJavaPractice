package InterfaceEmployee;

public class Designation {
	private int id;
	private String Designationname;
	private int minsalary;
	private int maxsalary;
	private boolean permanentemployee;

	public Designation() {
	}

	public Designation(int id, String Designationname, int minsalary, int maxsalary, boolean permanentemployee) {
		this.id = id;
		this.Designationname = Designationname;
		this.minsalary = minsalary;
		this.maxsalary = maxsalary;
		this.permanentemployee = permanentemployee;
	}

	public boolean equals(Designation d) {
		if (id == d.id && Designationname.equals(d.Designationname) && minsalary == d.minsalary
				&& maxsalary == d.maxsalary && permanentemployee == permanentemployee) {
			return true;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignationname() {
		return Designationname;
	}

	public void setDesignationname(String designationname) {
		Designationname = designationname;
	}

	public int getMinsalary() {
		return minsalary;
	}

	public void setMinsalary(int minsalary) {
		this.minsalary = minsalary;
	}

	public int getMaxsalary() {
		return maxsalary;
	}

	public void setMaxsalary(int maxsalary) {
		this.maxsalary = maxsalary;
	}

	public boolean isPermanentemployee() {
		return permanentemployee;
	}

	public void setPermanentemployee(boolean permanentemployee) {
		this.permanentemployee = permanentemployee;
	}

	@Override
	public String toString() {
		return "Designation [Designationname=" + Designationname + ", minsalary=" + minsalary + ", maxsalary="
				+ maxsalary + ", permanentemployee=" + permanentemployee + "]";
	}

}
