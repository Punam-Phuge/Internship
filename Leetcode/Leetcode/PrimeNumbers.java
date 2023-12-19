import java.util.Scanner;

// Define the interface
interface in1 {
    void display(int n);
}

// Implement the interface
class Prime implements in1 {
    @Override
    public void display(int n) {
        int count = countPrimes(n);
        System.out.println(count);
    }

    // this method to count prime numbers between 2 and n
    private int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // this method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
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

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        int T = scanner.nextInt();

        // Create an instance of Prime
        Prime obj = new Prime();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Input the value of n for each test case
            int n = scanner.nextInt();

            // Call the display method for each test case
            obj.display(n);
        }

        // Close the scanner
        scanner.close();
    }
}

    

