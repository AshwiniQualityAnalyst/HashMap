package AllKeyValuePairHashMap;

import java.util.Map;

public class LinkedHashMap {

	public static void TestLinkedHashMap(Map<String, Integer> map) {
		map.put("D", 100);
		map.put("B", 101);
		map.put("A", 102);
		map.put("C", 103);

		for (String key : map.keySet()) {
			Integer Value = map.get(key);

			System.out.println("Keys: " + key + " Values: " + Value);
		}
	}

	// Repeating for Practice
	public static void TestLinkedHashMap1(Map<String, String> map) {

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
