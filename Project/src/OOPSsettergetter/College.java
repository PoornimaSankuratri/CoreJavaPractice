package OOPSsettergetter;

public class College {
	private String Villagename;
	private Integer numberofbranches;
	private Integer numberofblocks;
	private Integer numberofcanteens;
	private University university;
	
	College(){}

	public College(String villagename, Integer numberofbranches, Integer numberofblocks, Integer numberofcanteens,
			University university) {
		
		Villagename = villagename;
		this.numberofbranches = numberofbranches;
		this.numberofblocks = numberofblocks;
		this.numberofcanteens = numberofcanteens;
		this.university = university;
	}


	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public void setVillagename(String Villagename) {
		this.Villagename = Villagename;
	}

	public String getVillagename() {
		return Villagename;
	}

	public void setNumberofbranches(int numberofbranches) {
		this.numberofbranches = numberofbranches;
	}

	public int getNumberofbranches() {
		return numberofbranches;
	}

	public void setNumberofblocks(int numberofblocks) {
		this.numberofblocks = numberofblocks;
	}

	public int getNumberofblocks() {
		return numberofblocks;
	}

	public void setNumberofcanteens(int numberofcanteens) {
		this.numberofcanteens = numberofcanteens;
	}

	public int getNumberofcanteens() {
		return numberofcanteens;
	}
	
	public boolean equals(College c) {
		if (
				Villagename.equals(c.Villagename)
				&& numberofbranches == c.numberofbranches && university.equals(c.university)
				&& numberofblocks == c.numberofblocks && numberofcanteens == c.numberofcanteens) {
			return true;
		}
		return false;
	}
	public String toString() {
		return university + " , VillageName " + Villagename + " , numberofbranches " + numberofbranches
				+ " , NumberOfBlocks " + numberofblocks + " , NumberOfCanteens " + numberofcanteens + " , " + university;
	}

}
