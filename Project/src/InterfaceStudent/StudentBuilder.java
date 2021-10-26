package InterfaceStudent;

import java.util.ArrayList;
import java.util.List;

class StudentBuilder implements StudentMethods {
	List<Student> students = new ArrayList<>();

	public boolean addStudent(Student s) {
		for (Student st : students) {
			if (st.getId() == s.getId()) {
				return false;
			}
		}
		students.add(s);
		return true;
	}

	public Student getStudent(int id) {
		for (Student s : students) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	public void getAllStudents() {
		for (Student s : students) {
			System.out.println(s);
		}
	}

	public void removeStudent(int id) {
		Student temp = null;
		boolean find = false;
		for (Student s : students) {
			if (s.getId() == id) {
				temp = s;
				find = true;
			}
		}
		if (find) {
			students.remove(temp);
		}
	}

	public void replaceStudent(int id, Student newstd) {
		removeStudent(id);
		addStudent(newstd);
	}

	public Student updateStudentBranch(int id, Branch br) {
		Student temp = null;
		for (Student s : students) {
			if (s.getId() == id) {
				s.setBranch(br);
				temp = s;
				break;
			}
		}
		return temp;
	}

	public List<Student> getStudentByGender(String gender) {
		List<Student> temp = new ArrayList<>();
		for (Student s : students) {
			if (s.getGender().equals(gender)) {
				temp.add(s);
			}
		}
		return temp;
	}
}
