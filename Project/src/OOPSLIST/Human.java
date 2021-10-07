package OOPSLIST;
import java.util.ArrayList;

public class Human {
String Name;
ArrayList<Sports> sportname = new ArrayList<>();
public String toString() {
	return "HumanName " + Name + " , " + sportname;
}
}
