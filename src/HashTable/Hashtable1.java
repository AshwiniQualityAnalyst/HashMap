package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> HT = new Hashtable<Integer, String>();
		HT.put(100, "Amit");
		HT.put(102, "Ravi");
		HT.put(101, "Vijay");
		HT.put(103, "Rahul");

		for (Map.Entry<Integer, String> entry : HT.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
