package OOPStoString;

public class College {
	String Collegename;
	String Villagename;
	int numberofbranches;
	String university;
	int numberofblocks;
	int numberofcanteens;

	public boolean equals(College c) {
		if (Collegename.equals(c.Collegename) && Villagename.equals(c.Villagename)
				&& numberofbranches == c.numberofbranches && university.equals(c.university)
				&& numberofblocks == c.numberofblocks && numberofcanteens == c.numberofcanteens) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "CollegeName " + Collegename + " , VillageName " + Villagename + " , numberofbranches "
				+ numberofbranches + "  University " + university + " , NumberOfBlocks " + numberofblocks
				+ " , NumberOfCantens " + numberofcanteens;
	}
}
