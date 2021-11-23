package OOPSObjectInClass;

public class Student {
	String id;
	String name;
	String gender;
	Branch branch;
	char section;
    double percentage;
    char grade;
    College college;

public boolean equals(Student s) {
	if(id == s.id && name.equals(s.name) && gender.equals(s.gender) && branch.equals(s.branch) && section == s.section 
			&& percentage == s.percentage && grade == s.grade && college.equals(s.college)) {
		return true;
	}
	return false;
}



	public String toString() {
    	return  college + " Student details: id " + id + " , name " + name + " , gender "  + gender + " ,  " + branch + " , section " + section + 
    			" , percentage " + percentage + " , grade " +grade;
    }
}
