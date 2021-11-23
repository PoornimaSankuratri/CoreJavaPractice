package OOPSObjectInClass;

import java.util.Objects;

public class College {

	String Villagename;
	int numberofbranches;
	int numberofblocks;
	int numberofcanteens;
	University university;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		College other = (College) obj;
		return Objects.equals(Villagename, other.Villagename) && numberofblocks == other.numberofblocks
				&& numberofbranches == other.numberofbranches && numberofcanteens == other.numberofcanteens
				&& Objects.equals(university, other.university);
	}

	public String toString() {
		return university + " , VillageName " + Villagename + " , numberofbranches " + numberofbranches
				+ " , NumberOfBlocks " + numberofblocks + " , NumberOfCanteens " + numberofcanteens;
	}
}
