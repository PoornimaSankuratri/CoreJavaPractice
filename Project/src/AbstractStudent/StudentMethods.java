package AbstractStudent;

import java.util.List;

public abstract class StudentMethods {

	abstract boolean addStudent(Student s);

	abstract Student getStudent(int id);

	abstract void getAllStudents();

	abstract void removeStudent(int id);

	abstract void replaceStudent(int id, Student newstd);

	abstract Student updateStudentBranch(int id, Branch br);

	abstract List<Student> getStudentByGender(String gender);

}
