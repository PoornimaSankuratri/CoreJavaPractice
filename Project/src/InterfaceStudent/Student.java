package InterfaceStudent;

public class Student {
	private int id;
	private String name;
	private String gender;
	private char section;
	private double percentage;
	private char grade;
	private Branch branch;

	public Student() {
	}

	public Student(int id, String name, String gender, char section, double percentage, char grade, Branch branch) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.section = section;
		this.percentage = percentage;
		this.grade = grade;
		this.branch = branch;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", section=" + section + ", percentage="
				+ percentage + ", grade=" + grade + ", branch=" + branch + "]";
	}
}

