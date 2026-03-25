import java.util.HashMap;
import java.util.Map;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("=====================================\n");

        // Create a HashMap
        // Stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // --- Insert bogie capacities ---
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 24);

        // Display bogie-capacity mapping
        System.out.println("Bogie Capacity Details:");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }
    }
}