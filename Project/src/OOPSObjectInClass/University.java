package OOPSObjectInClass;

public class University {
		String UniversityName;
		String Regulation;
		String Colleges;
		
		public boolean equalto(University u) {
			if (UniversityName.equals(u.UniversityName) && Regulation.equals(u.Regulation) && Colleges.equals(u.Colleges)) {
				return true;
			}
			return false;
		}
		public String toString() {
			return "UniversityName " + UniversityName + " , Regulation " + Regulation + " , Collegename " + Colleges ;
		}
}
