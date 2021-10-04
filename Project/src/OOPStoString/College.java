package OOPStoString;

public class College {
	String Collegename;
	String Villagename;
	int numberofbranches;
	String university;
	int numberofblocks;
	int numberofcanteens;

	public String toString() {
		return "CollegeName " + Collegename + " , VillageName " + Villagename + " , numberofbranches " + numberofbranches + "  University " + university + " , NumberOfBlocks " + numberofblocks + " , NumberOfCantens "
				+ numberofcanteens;
	}
}
