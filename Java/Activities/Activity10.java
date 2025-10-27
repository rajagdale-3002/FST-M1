import java.util.HashSet;
public class Activity10 {

public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hs = new HashSet<>();

        // Add 6 objects to the HashSet
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Elderberry");
        hs.add("Fig");

        // Print the size of the HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // Remove an element
        hs.remove("Date");
        System.out.println("Removed 'Date' from HashSet.");

        // Try to remove an element not present
        boolean removed = hs.remove("Grape");
        System.out.println("Attempted to remove 'Grape': " + (removed ? "Success" : "Not Found"));

        // Check if an item is in the Set
        System.out.println("Contains 'Apple'? " + hs.contains("Apple"));
        System.out.println("Contains 'Date'? " + hs.contains("Date"));

        // Print the updated set
        System.out.println("Updated HashSet: " + hs);
    }


}
