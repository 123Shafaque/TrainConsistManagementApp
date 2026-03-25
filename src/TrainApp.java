import java.util.*;
import java.util.stream.Collectors;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " | Capacity: " + capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("=====================================\n");

        // Create list of bogies (can include duplicates for grouping)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));       // duplicate type
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));      // duplicate type

        // --- Grouping using Stream ---
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("   " + b);
            }
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}