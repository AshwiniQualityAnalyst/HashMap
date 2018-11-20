package AllKeyValuePairHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ParentMainClass {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		System.out.println("Hashmap implementation--> HashMap doesn't guaranteed the order");
		AllKeyValuePairHashMap.HashMap.TestHashMap(hashmap);

		System.out.println();
		System.out.println("Again Test HashMap");

		Map<String, String> hashmap1 = new HashMap<String, String>();
		AllKeyValuePairHashMap.HashMap.TestHashMap1(hashmap1);

		System.out.println();

		Map<String, Integer> linkedhashmap = new LinkedHashMap<String, Integer>();
		System.out.println("Linked Hashmap implementation--> LinkedHashMap maintains the order of insertion");
		AllKeyValuePairHashMap.LinkedHashMap.TestLinkedHashMap(linkedhashmap);
		
		System.out.println();
		System.out.println("Again Test Linked HashMap");
		
		Map<String, String> linkedhashmap1 = new LinkedHashMap<String, String>();
		AllKeyValuePairHashMap.LinkedHashMap.TestLinkedHashMap1(linkedhashmap1);

		System.out.println();

		Map<Integer, String> treehashmnap = new TreeMap<Integer, String>();
		System.out.println("Tree Hashmap implementation--> TreeMap sort the keys");
		AllKeyValuePairHashMap.TreeHashMap.TestTreeHashMap(treehashmnap);
		
		System.out.println();
		System.out.println("Again Test Tree HashMap");
		
		Map<String, String> treehashmnap1 = new TreeMap<String, String>();
		AllKeyValuePairHashMap.TreeHashMap.TestTreeHashMap1(treehashmnap1);

	}

}
