
import java.util.HashMap;
import java.util.Map;
public class Activity11 {

public static void main(String[] args) {
        // Create a Map with Integer keys and String values
        Map<Integer, String> colours = new HashMap<>();

        // Add 5 random colours to the Map
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Yellow");
        colours.put(4, "Green");
        colours.put(5, "Purple");

        // Print the Map
        System.out.println("Initial Map: " + colours);

        // Remove one colour
        colours.remove(3); // Removes "Yellow"
        System.out.println("Removed colour with key 3.");

        // Check if the colour "Green" exists
        boolean hasGreen = colours.containsValue("Green");
        System.out.println("Does the Map contain 'Green'? = " + hasGreen);

        // Print the size of the Map
        System.out.println("Size of the Map: " + colours.size());

        // Print the updated Map
        System.out.println("Updated Map: " + colours);
    }


}
