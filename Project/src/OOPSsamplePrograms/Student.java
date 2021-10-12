package OOPSsamplePrograms;


public class Student {
		private String id;
		private String name;
		private String gender;
		private char section;
		private double percentage;
		private char grade;
		private Branch branch;
		
		public Student() {	}
		
		public Student(String id, String name, String gender,char section, double percentage,char grade, Branch branch) {
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.section = section;
			this.percentage = percentage;
			this.grade = grade;
			this.branch = branch;
		}
		
		public void setBranch(Branch branch) {
			this.branch = branch;
		}
		
		public Branch getBranch() {
			return branch;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getGender() {
			return gender;
		}

		public void setSection(char section) {
			this.section = section;
		}

		public char getSection() {
			return section;
		}

		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}

		public double getPercentage() {
			return percentage;
		}
		
		public void setGrade(char grade) {
			this.grade = grade;
		}
		
		public char getGrade() {
			return grade;
		}
	    
		 public String toString() {
		    	return  " Student details: id " + id + " , name " + name + " , gender "  + gender + " ,  " + branch + " , section " + section + 
		    			" , percentage " + percentage + " , grade " +grade;
		    }
		}
		


