package OOPSLIST;

import java.util.List;

public class Teacher {
	String TeacherName;
	List<Subject> Subject;

	public String toString() {
		return "TeacherName " + TeacherName + ", " + Subject;
	}
}
