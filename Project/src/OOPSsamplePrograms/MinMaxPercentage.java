package OOPSsamplePrograms;

import java.util.ArrayList;
import java.util.List;

public class MinMaxPercentage {
	public static void main(String args[]) {
		Branch b1 = new Branch("CSE", 101);
		Branch b2 = new Branch("ECE", 101);
		Branch b3 = new Branch("EEE", 101);
		Branch b4 = new Branch("CIVIL", 101);
		Branch b5 = new Branch("MECH", 101);
		Branch b6 = new Branch("IT", 101);

		Student s1 = new Student("14A81A0506", "HEMA", "Female", 'A', 65.5, 'A', b1);
		Student s2 = new Student("14A81A0551", "POORNIMA", "Female", 'A', 69.5, 'A', b1);
		Student s3 = new Student("14A81A0557", "MOUNI", "Female", 'A', 65.0, 'A', b1);
		Student s4 = new Student("14A81A0532", "SUJAN", "Male", 'B', 62, 'C', b2);
		Student s5 = new Student("14A81A0500", "ANI", "male", 'A', 65, 'A', b5);

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		System.out.println("Student Minimum percentage " + minPercentage(list));
		System.out.println("Student Minimum percentage " + maxPercentage(list));
	}

	public static double minPercentage(List<Student> list) {

		double min = Double.MAX_VALUE;

		for (Student s : list) {
			if (s.getPercentage() < min) {
				min = s.getPercentage();
			}
		}
		return min;
	}

	public static double maxPercentage(List<Student> list) {
		double max = Double.MIN_VALUE;
		for (Student s : list) {
			if (s.getPercentage() > max) {
				max = s.getPercentage();
			}
		}
		return max;
	}
}
