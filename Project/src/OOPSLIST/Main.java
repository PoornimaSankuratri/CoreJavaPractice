package OOPSLIST;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		Subject Telugu = new Subject();
		Telugu.id = 1;
		Telugu.Subjectname = "TELUGU";

		Subject Hindi = new Subject();
		Hindi.id = 1;
		Hindi.Subjectname = "Hindi";

		Subject English = new Subject();
		English.id = 1;
		English.Subjectname = "English";

		Subject Maths = new Subject();
		Maths.id = 1;
		Maths.Subjectname = "Maths";
		
		List<Subject> l= new ArrayList();

		ArrayList<Subject> list = new ArrayList();
		list.add(Telugu);
		list.add(English);
		
		ArrayList<Subject> list2 = new ArrayList();
		list2.add(Hindi);
		list2.add(Maths);

		Teacher t1 = new Teacher();
		t1.TeacherName = "Augustian";
		t1.Subject = list;

		Teacher t2 = new Teacher();
		t2.TeacherName = "Praveen";
		t2.Subject = list2;

		System.out.println(t1);
		System.out.println(t2);

		Sports s1 = new Sports();
		s1.id = 1;
		s1.sportsname = "Cricket";

		Sports s2 = new Sports();
		s2.id = 2;
		s2.sportsname = "Kabbadi";

		ArrayList<Sports> list3 = new ArrayList();
		list3.add(s1);

		ArrayList<Sports> list4 = new ArrayList();
		list4.add(s2);

		Human h1 = new Human();
		h1.Name = "Ram";
		h1.sportname = list3;

		Human h2 = new Human();
		h2.Name = "Sam";
		h2.sportname = list4;

		System.out.println(h1);
		System.out.println(h2);
		
		Rooms r1 = new Rooms();
		r1.id = 1;
		r1.roomname = "Kitchen";
		r1.NumberOfLights = 1;
		r1.NumberOfFans = 1;

		Rooms r2 = new Rooms();
		r2.id = 2;
		r2.roomname = "hall";
		r2.NumberOfLights = 1;
		r2.NumberOfFans = 1;
		
		Rooms r3 = new Rooms();
		r3.id = 3;
		r3.roomname = "Firstbedroom";
		r3.NumberOfLights = 1;
		r3.NumberOfFans = 1;
		
		Rooms r4 = new Rooms();
		r4.id = 4;
		r4.roomname = "Secondbedroom";
		r4.NumberOfLights = 1;
		r4.NumberOfFans = 1;
		
		ArrayList<Rooms> list5 = new ArrayList<>();
		list5.add(r1);
		list5.add(r2);
		list5.add(r3);
		list5.add(r4);
		
		House ho = new House();
		ho.house = "Building";
		ho.room = list5;
		
		System.out.println(ho);
		
	}
}
