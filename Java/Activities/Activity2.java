
public class Activity2 {
public static void main(String[] args) {
	// Initialize the array
    int[] numbers = {10, 77, 10, 54, -11, 10};

    // Variable to store the sum of 10's
    int sum = 0;

    // Loop through the array and add 10's
    for (int num : numbers) {
        if (num == 10) {
            sum += num;
        }
    }

    // Check if the sum is exactly 30
    boolean result = (sum == 30);

    // Print the result
    System.out.println("Is the sum of all 10's exactly 30? " + result);
}
}
