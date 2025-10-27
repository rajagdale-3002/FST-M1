
// Define the functional interface
@FunctionalInterface
interface Addable {
    int add(int num1, int num2);
}

// Main class

public class Activity12 {

public static void main(String[] args) {
        // Lambda expression without body
        Addable ad1 = (a, b) -> (a + b);

        // Lambda expression with body
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };

        // Test the lambda expressions
        System.out.println("Result from ad1: " + ad1.add(10, 20));
        System.out.println("Result from ad2: " + ad2.add(30, 40));
    }


}
