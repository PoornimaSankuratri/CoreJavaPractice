package OOPSObjectInClass;

public class College {
	String Villagename;
	int numberofbranches;
	int numberofblocks;
	int numberofcanteens;
	University university;

	public String toString() {
		return  university + " , VillageName " + Villagename + " , numberofbranches "
				+ numberofbranches +  " , NumberOfBlocks " + numberofblocks
				+ " , NumberOfCanteens " + numberofcanteens;
	}
}
