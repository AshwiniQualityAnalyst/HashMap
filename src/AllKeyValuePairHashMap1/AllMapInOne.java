package AllKeyValuePairHashMap1;

import java.util.Map;

public class AllMapInOne {
	public static void TestMap(Map<Integer, String> map) {

		map.put(2, "Lion");
		map.put(1, "Tiger");
		map.put(4, "Bear");
		map.put(3, "Jaguar");

		String PrintValueBasedOnKey = map.get(2);
		System.out.println(PrintValueBasedOnKey);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + " : " + value);
		}
	}
}
