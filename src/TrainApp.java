import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=====================================\n");

        // Create a LinkedHashSet
        // Maintains insertion order + ensures uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // --- Add bogies ---
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate entry
        trainFormation.add("Sleeper"); // Duplicate (ignored automatically)

        // Display final train formation
        System.out.println("Final Train Formation (Ordered & Unique):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}