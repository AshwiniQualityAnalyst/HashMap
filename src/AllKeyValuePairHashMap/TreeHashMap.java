package AllKeyValuePairHashMap;

import java.util.Map;

public class TreeHashMap {

	public static void TestTreeHashMap(Map<Integer, String> map) {
		map.put(2, "Lion");
		map.put(1, "Tiger");
		map.put(4, "Bear");
		map.put(3, "Jaguar");

		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println("Keys: " + key + " Values: " + value);
		}
	}

	// Repeating for Practice
	public static void TestTreeHashMap1(Map<String, String> map) {

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
