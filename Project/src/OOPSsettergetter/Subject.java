package OOPSsettergetter;

public class Subject {
	private int id;
	private String Subjectname;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setSubjectname(String Subjectname) {
		this.Subjectname = Subjectname;
	}
	
	public String getSubjectname() {
		return Subjectname;
	}
	public String toString() {
		return "Subject id " + id + ", Subject name " + Subjectname;
	}
}
