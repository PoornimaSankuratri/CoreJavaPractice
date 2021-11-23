package OOPStoString;

public class Student {
	String id;
	String name;
	String gender;
	String branch;
	char section;
    double percentage;
    char grade;
    
    
    public String toString() {
    	return "id " + id + " , name " + name + " , gender "  + gender + " , branch " + branch + " , section " + section + 
    			" , percentage " + percentage + " , grade " +grade;
    }
}
