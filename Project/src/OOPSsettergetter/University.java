package OOPSsettergetter;

public class University {
	private String UniversityName;
	private String Regulation;
	private String Colleges;
	
	public University() { }
	
	public University(String UniversityName, String Regulation ,String Colleges ) {
		this.UniversityName = UniversityName;
		this.Regulation = Regulation;
		this.Colleges = Colleges;
	}
	
	public void setUniversityName(String UniversityName) {
		this.UniversityName = UniversityName;
	}
	
	public String getUniversityName() {
		return UniversityName;
	}
	
	public void setRegulation(String Regulation) {
		this.Regulation = Regulation;
	}
	
	public String getRegulation() {
		return Regulation;
	}
	
	public void setColleges(String Colleges) {
		this.Colleges = Colleges;
	}
	
	public String getColleges() {
		return Colleges;
	}
	public String toString() {
		return "UniversityName " + UniversityName + " , Regulation " + Regulation + " , Collegename " + Colleges ;
	}

}
