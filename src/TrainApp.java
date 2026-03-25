import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("======================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("Passenger Bogies after removal: " + passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Does Sleeper exist? " + exists);

        System.out.println("Final Train Consist: " + passengerBogies);

        System.out.println("\nSystem ready for operations...");
    }
}