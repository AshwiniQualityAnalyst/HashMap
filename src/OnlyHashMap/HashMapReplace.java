package OnlyHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplace {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "Ajay");

		System.out.println("Initial list of elements");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
		System.out.println("Replacing value of 102 key");

		map.replace(102, "Ashwini");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
		System.out.println("Replacing value of 101 key");

		map.replace(101, "Vijay", "Akhil");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
		System.out.println("Replace everything with common value");
		map.replaceAll((k, v) -> "SAMEER");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
