package ComplicatedMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
public class ListOfMapsWay1 {
 
    public static void main(String[] args) {
 
        // HashMap 1: input preparation for WEST India Region
        Map<String, String> westIndiaStateCapital = 
                new HashMap<String, String>();
        westIndiaStateCapital.put("Maharashtra", "Mumbai");
        westIndiaStateCapital.put("Gujarat", "Gandhinagar");
        westIndiaStateCapital.put("Rajasthan", "Jaipur");
        westIndiaStateCapital.put("Goa", "Panaji");
 
        // HashMap 2: input preparation for SOUTH India Region
        Map<String, String> southIndiaStateCapital = 
                new HashMap<String, String>();
        southIndiaStateCapital.put("Andhra Pradesh", "Amaravati");
        southIndiaStateCapital.put("Karnataka", "Bengaluru");
        southIndiaStateCapital.put("Kerala","Thiruvananthapuram");
        southIndiaStateCapital.put("Tamil Nadu", "Chennai");
        southIndiaStateCapital.put("Telangana", "Hyderabad");
 
        // HashMap 3: input preparation for EAST India Region
        Map<String, String> eastIndiaStateCapital = 
                new HashMap<String, String>();
        eastIndiaStateCapital.put("Bihar", "Patna");
        eastIndiaStateCapital.put("Jharkhand", "Ranchi");
        eastIndiaStateCapital.put("West Bengal", "Kolkata");
        eastIndiaStateCapital.put("Odisha", "Bhubaneswar");
 
        // HashMap 4: input preparation for SOUTH India Region
        Map<String, String> northIndiaStateCapital = 
                new HashMap<String, String>();
        northIndiaStateCapital.put("Delhi", "New Delhi");
        northIndiaStateCapital.put("Himachal Pradesh", "Shimla");
        northIndiaStateCapital.put("Jammu n Kashmir", "Srinagar");
        northIndiaStateCapital.put("Punjab", "Chandigarh");
 
        // HashMap 5: input preparation for CENTRAL India Region
        Map<String, String> centralIndiaStateCapital = 
                new HashMap<String, String>();
        centralIndiaStateCapital.put("Madhya Pradesh", "Bhopal");
        centralIndiaStateCapital.put("Uttar Pradesh", "Lucknow");
        centralIndiaStateCapital.put("Chhattisgarh", "Raipur");
 
 
        // create ArrayList and insert all 5 HashMap into it
        List<Map<String, String>> listOfIndianRegions = 
                new ArrayList<Map<String, String>>();
 
        // add all 5 regions to AL
        listOfIndianRegions.add(westIndiaStateCapital);
        listOfIndianRegions.add(southIndiaStateCapital);
        listOfIndianRegions.add(eastIndiaStateCapital);
        listOfIndianRegions.add(northIndiaStateCapital);
        listOfIndianRegions.add(centralIndiaStateCapital);
 
        // temp variable to indicate zone/region
        int regionIndex = 1;
 
        // Way 1: Iterate using for-each and 
        // loop through Map using entrySet() method
        System.out.println("Way 1: Iterate using for-each and"
                + " loop through Map using entrySet() method");
 
        // get Iterator for looping through AL
        Iterator<Map<String, String>> iterator = 
                listOfIndianRegions.iterator();
 
        // iterate AL using while-loop
        while(iterator.hasNext()) {
 
            System.out.println("\nIndia Region - " + regionIndex);
            System.out.println("=========================="
                    + "========================");
 
            Map<String, String> region = iterator.next();
 
            // getting entrySet() into Set
            Set<Entry<String, String>> entrySet = 
                    region.entrySet();
 
            // for-each loop
            for(Entry<String, String> entry : entrySet) {
 
                System.out.println("State : " + entry.getKey() 
                        + "\tCapital : " + entry.getValue());
            }
 
            // increment region index by 1
            regionIndex++;
        }
    }
}