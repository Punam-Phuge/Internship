import java.util.*;

public class MaximumSumAfterNegotiations {

    static int maximumSum(int[] arr, int N, int K) {
        int negCount = 0;

        // Count the number of negative elements
        for (int num : arr) {
            if (num < 0) {
                negCount++;
            }
        }

        // Sort the array to process negative elements first
        Arrays.sort(arr);

        // Iterate over the sorted array
        for (int i = 0; i < N && K > 0 && arr[i] < 0; i++) {
            arr[i] = -arr[i]; // Convert negative element to positive
            K--; // Decrement K
        }

        // If K is still greater than 0 after processing negative elements
        if (K > 0) {
            // If K is odd, convert the smallest positive element to negative
            if (K % 2 != 0) {
                arr[0] = -arr[0];
            }
        }

        // Calculate the sum of the modified array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 4, 5};
        int N1 = arr1.length;
        int K1 = 1;
        System.out.println("Output for arr1: " + maximumSum(arr1, N1, K1));

        int[] arr2 = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
        int N2 = arr2.length;
        int K2 = 5;
        System.out.println("Output for arr2: " + maximumSum(arr2, N2, K2));
    }
}
