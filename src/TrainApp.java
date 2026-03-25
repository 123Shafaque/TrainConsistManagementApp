import java.util.LinkedList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=====================================\n");

        // Create a LinkedList
        // Maintains insertion order and allows fast insertions/removals
        List<String> trainConsist = new LinkedList<>();

        // --- Add bogies in sequence ---
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry");

        // Remove first and last bogie
        trainConsist.remove(0); // removes Engine
        trainConsist.remove(trainConsist.size() - 1); // removes Guard

        // Display final train consist
        System.out.println("Final Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}