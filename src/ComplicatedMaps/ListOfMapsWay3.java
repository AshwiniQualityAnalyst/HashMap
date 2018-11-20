package ComplicatedMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapsWay3 {

	public static void main(String[] args) {

		// HashMap 1
		Map<String, String> westIndiaStateCapital = new HashMap<String, String>();
		westIndiaStateCapital.put("Maharashtra", "Mumbai");
		westIndiaStateCapital.put("Gujarat", "Gandhinagar");
		westIndiaStateCapital.put("Rajasthan", "Jaipur");
		westIndiaStateCapital.put("Goa", "Panaji");

		// HashMap 2
		Map<String, String> southIndiaStateCapital = new HashMap<String, String>();
		southIndiaStateCapital.put("Andhra Pradesh", "Amaravati");
		southIndiaStateCapital.put("Karnataka", "Bengaluru");
		southIndiaStateCapital.put("Kerala", "Thiruvananthapuram");
		southIndiaStateCapital.put("Tamil Nadu", "Chennai");
		southIndiaStateCapital.put("Telangana", "Hyderabad");

		// HashMap 3
		Map<String, String> eastIndiaStateCapital = new HashMap<String, String>();
		eastIndiaStateCapital.put("Bihar", "Patna");
		eastIndiaStateCapital.put("Jharkhand", "Ranchi");
		eastIndiaStateCapital.put("West Bengal", "Kolkata");
		eastIndiaStateCapital.put("Odisha", "Bhubaneswar");

		// HashMap 4
		Map<String, String> northIndiaStateCapital = new HashMap<String, String>();
		northIndiaStateCapital.put("Delhi", "New Delhi");
		northIndiaStateCapital.put("Himachal Pradesh", "Shimla");
		northIndiaStateCapital.put("Jammu n Kashmir", "Srinagar");
		northIndiaStateCapital.put("Punjab", "Chandigarh");

		// HashMap 5: input preparation for CENTRAL India Region
		Map<String, String> centralIndiaStateCapital = new HashMap<String, String>();
		centralIndiaStateCapital.put("Madhya Pradesh", "Bhopal");
		centralIndiaStateCapital.put("Uttar Pradesh", "Lucknow");
		centralIndiaStateCapital.put("Chhattisgarh", "Raipur");

		// create ArrayList and insert all 5 HashMap into it
		List<Map<String, String>> listOfIndianRegions = new ArrayList<Map<String, String>>();

		// add all 5 regions to Array List
		listOfIndianRegions.add(westIndiaStateCapital);
		listOfIndianRegions.add(southIndiaStateCapital);
		listOfIndianRegions.add(eastIndiaStateCapital);
		listOfIndianRegions.add(northIndiaStateCapital);
		listOfIndianRegions.add(centralIndiaStateCapital);

		// Way 3: Using Iterable.forEach() in Java 8 version
		System.out.println("Way 3: Using " + "Iterable.forEach() in Java 8 version");

		listOfIndianRegions.forEach(System.out::println);
	}

}
