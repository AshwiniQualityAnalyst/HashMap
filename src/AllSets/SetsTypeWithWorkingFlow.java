package AllSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsTypeWithWorkingFlow {

	public static void main(String[] args) {
		// HashSet doesnot retains a order
		Set<String> set1 = new HashSet<String>();
		TestSet(set1);
		// LinkedHashSet maintains a insertion order
		Set<String> set2 = new LinkedHashSet<String>();
		TestSet(set2);
		// TreeSet maintains a Alphabetical Order
		Set<String> set3 = new TreeSet<String>();
		TestSet(set3);
	}

	public static void TestSet(Set<String> set) {

		set.add("Boy");
		set.add("Apple");
		set.add("Dog");
		set.add("Cat");
		// Adding duplicate items does nothing
		set.add("Cat");
		// Simple Print
		System.out.println(set);

		// Now we are retrieving

		for (String Element : set) {
			System.out.println(Element);
		}

	}

}
