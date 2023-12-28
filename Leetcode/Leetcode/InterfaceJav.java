import java.util.Scanner;

// Define the interface in1
interface in1 {
    void display(int p);
}

// Implement the interface in the testClass
class testClass implements in1 {
    // Implement the display method to count prime numbers
    public void display(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Main class with the main function
public class InterfaceJav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Create an object of testClass
        testClass obj = new testClass();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the value of n for each test case
            int n = sc.nextInt();

            // Call the display method to count prime numbers
            obj.display(n);
        }

        // Close the scanner
        sc.close();
    }
}


