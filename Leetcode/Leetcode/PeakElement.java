public class PeakElement {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int result1 = peakElement(arr1, arr1.length);
        System.out.println("Generated Output for arr1: " + result1);

        int[] arr2 = {3, 4, 2};
        int result2 = peakElement(arr2, arr2.length);
        System.out.println("Generated Output for arr2: " + result2);
    }

    static int peakElement(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return 1; // Index of a peak element
            }

            // If the element to the right of mid is greater, move towards the right
            if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                // If the element to the left of mid is greater or equal, move towards the left
                right = mid - 1;
            }
        }

        return 0; // No peak element found
    }
}
// Example 1:

// Input: 
// N = 3
// arr[] = {1,2,3}
// Possible Answer: 2
// Generated Output: 1
// Explanation: index 2 is 3.
// It is the peak element as it is 
// greater than its neighbour 2.
// If 2 is returned then the generated output will be 1 else 0.
// Example 2:

// Input:
// N = 3
// arr[] = {3,4,2}
// Possible Answer: 1
// Output: 1
// Explanation: 4 (at index 1) is the 
// peak element as it is greater than 
// it's neighbor elements 3 and 2.
// If 1 is returned then the generated output will be 1 else 0.

