package OOPSLIST;
import java.util.ArrayList;

public class House {
String house;
ArrayList<Rooms> room = new ArrayList<>();
public String toString() {
	return "house name" + house + " , " + room;
}
}
