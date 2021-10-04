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
    public String toString() {
    	return  college + " Student details: id " + id + " , name " + name + " , gender "  + gender + " ,  " + branch + " , section " + section + 
    			" , percentage " + percentage + " , grade " +grade;
    }
}
