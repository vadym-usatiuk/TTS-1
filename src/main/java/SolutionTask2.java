import java.util.HashMap;
import java.util.Scanner;

//    You are a car dealer. Create a hash map of vehicles.
//    The model is the Key, the make is the Value.
//    Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//            (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")

public class SolutionTask2 {

    public static HashMap<String, String> vehicle = new HashMap<>();

    public static void main(String[] args) {
        vehicle.put("Civic", "Honda");
        vehicle.put("Corolla", "Toyota");
        vehicle.put("Sentra", "Nissan");
        vehicle.put("Elantra", "Huyndai");
        vehicle.put("3", "Mazda");
        modelRequest();
    }

    public static void modelRequest() {
        System.out.println("What car (model) are you looking for?");
        Scanner model = new Scanner(System.in);
        String modelName = model.next();
        if (vehicle.containsKey(modelName)) {
            String modelMaker = vehicle.get(modelName);
            System.out.println("Oh, you're looking for a " + modelName + "? Our " + modelMaker + " section is right over here... ");
        } else {
            System.out.println("There is no such vehicle here.");
        }
    }
}