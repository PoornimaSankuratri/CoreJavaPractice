package InterfaceStudent;

import java.util.List;

public interface StudentMethods {
	
	public boolean addStudent(Student s);

	public Student getStudent(int id);

	public void getAllStudents();

	public void removeStudent(int id);

	public void replaceStudent(int id, Student newstd);

	public Student updateStudentBranch(int id, Branch br);

	public List<Student> getStudentByGender(String gender);
}
