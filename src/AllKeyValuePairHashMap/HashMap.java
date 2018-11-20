package AllKeyValuePairHashMap;

import java.util.Map;

public class HashMap {

	public static void TestHashMap(Map<Integer, String> map) {
		// Enter Key with it's Value
		map.put(2, "Lion");
		map.put(1, "Tiger");
		map.put(4, "Bear");
		map.put(3, "Jaguar");

		// Retrieve all the values

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println("Keys: " + key + " Values: " + value);
		}
	}

	// Repeating for Practice
	public static void TestHashMap1(Map<String, String> map) {

		map.put("D", "Dog");
		map.put("C", "Cat");
		map.put("B", "Bat");
		map.put("A", "Animal");

		for (String key : map.keySet()) {
			String value = map.get(key);

			System.out.println("Keys: " + key + " Values: " + value);
		}
	}
}
