package OnlyHashMap;

import java.util.Hashtable;
import java.util.Map;

class LTI {

	int PSNumber;
	String Designation;

	public LTI(int PSNumber, String Designation) {
		this.PSNumber = PSNumber;
		this.Designation = Designation;
	}
}

public class HashtableExample {

	public static void main(String[] args) {
		Map<Integer, LTI> map = new Hashtable<Integer, LTI>();

		LTI L1 = new LTI(10645280, "Ashwini --> Sr. Test Engineer");
		LTI L2 = new LTI(10635529, "Akhil --> Sr. Test Engineer");

		map.put(2, L1);
		map.put(1, L1);

		for (Map.Entry<Integer, LTI> entry : map.entrySet()) {
			Integer Key = entry.getKey();
			LTI Value = entry.getValue();
			System.out.println(Key);
			System.out.println(Value.PSNumber+" "+Value.Designation);
		}
	}

}
