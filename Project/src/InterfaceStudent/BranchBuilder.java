package InterfaceStudent;

import java.util.ArrayList;
import java.util.List;

 class BranchBuilder implements BranchMethods {
	List<Branch> branches = new ArrayList<>();

	public boolean addBranch(Branch b) {
		for (Branch br : branches) {
			if (br.getId() == b.getId()) {
				return false;
			}
		}
		branches.add(b);
		return true;
	}

	public Branch getBranch(int id) {
		for (Branch br : branches) {
			if (br.getId() == id) {
				return br;
			}
		}
		return null;
	}
}
