package OnlyHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPutIfAbsent {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		System.out.println("After invoking put() method ");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		map.putIfAbsent(103, "Gaurav");
		System.out.println();
		System.out.println("After invoking putIfAbsent() method ");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(104, "Ravi");
		map1.putAll(map);
		System.out.println();
		System.out.println("After invoking putAll() method ");

		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
