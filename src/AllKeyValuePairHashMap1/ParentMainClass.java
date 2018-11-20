package AllKeyValuePairHashMap1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ParentMainClass {

	public static void main(String[] args) {
		// HashMap
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		// LinkedHashMap
		Map<Integer, String> likedhashmap = new LinkedHashMap<Integer, String>();
		// TreeMap
		Map<Integer, String> treehashmap = new TreeMap<Integer, String>();
		System.out.println("Hash Map");
		System.out.println();
		AllMapInOne.TestMap(hashmap);
		System.out.println();
		System.out.println("Linked Hash Map");
		System.out.println();
		AllMapInOne.TestMap(likedhashmap);
		System.out.println();
		System.out.println("Tree Hash Map");
		System.out.println();
		AllMapInOne.TestMap(treehashmap);

	}
}
