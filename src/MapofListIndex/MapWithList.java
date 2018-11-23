package MapofListIndex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithList {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Grapes");

		List<String> vegetableList = new ArrayList<String>();
		vegetableList.add("Carrot");
		vegetableList.add("Brinjal");
		vegetableList.add("Cucumber");

		map.put("Fruits", fruitList);
		map.put("Vegetables", vegetableList);

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().get(1));
		}

	}

}
