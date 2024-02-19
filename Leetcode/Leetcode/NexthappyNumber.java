public class NexthappyNumber {
    
    // Function to check if a number is happy
    static boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    // Function to find the sum of squares of digits
    static int digitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // Function to find the next smallest happy number
    static int nextHappyNumber(int n) {
        while (true) {
            n++;
            if (isHappy(n)) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        int N1 = 8;
        System.out.println("Next happy number after " + N1 + " is: " + nextHappyNumber(N1));

        int N2 = 10;
        System.out.println("Next happy number after " + N2 + " is: " + nextHappyNumber(N2));
    }
}