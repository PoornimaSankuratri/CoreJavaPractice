package AbstarctEmployee;

import java.util.ArrayList;
import java.util.List;

public class DesignationBuilder {
	List<Designation> designations = new ArrayList<>();

	public boolean addDesignation(Designation ds) {
		for (Designation d : designations) {
			if (d.getId() == ds.getId()) {
				return false;
			}
		}
		designations.add(ds);
		return true;
	}

	public Designation getDesignation(int id) {
		for (Designation d : designations) {
			if (d.getId() == id) {
				return d;
			}
		}
		return null;
	}

	public void getAllDesignations() {
		for (Designation d : designations) {
			System.out.println(d);
		}
	}

	public Designation updateMinSalary(int id, int minsalary) {
		Designation temp = null;
		for (Designation d : designations) {
			if (d.getId() == id) {
				d.setMinsalary(minsalary);
				temp = d;
				break;
			}
		}
		return temp;
	}
}
