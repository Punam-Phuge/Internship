public class MajorityElement {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int result1 = findMajorityElement(arr1);
        System.out.println("Output for arr1: " + result1);

        int[] arr2 = { 3, 1, 3, 3, 2 };
        int result2 = findMajorityElement(arr2);
        System.out.println("Output for arr2: " + result2);
    }
    

    static int findMajorityElement(int[] arr) {
        int n = arr.length;

        // Step 1: Find a candidate for the majority element
        int candidate = findCandidate(arr);

        // Step 2: Check if the candidate is the majority element
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > n / 2) ? candidate : -1;
    }

    static int findCandidate(int[] arr) {
        int candidate = 0, count = 0;

        // Moore's Voting Algorithm
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return candidate;
    }

}
//Example 1:
    /// Input:
    // N = 3
    // A[] = {1,2,3}
    // Output:
    // -1
    // Explanation:
    // Since, each element in
    // {1,2,3} appears only once so there
    // is no majority element.

    // Example 2:

    // Input:
    // N = 5
    // A[] = {3,1,3,3,2}
    // Output:
    // 3
    // Explanation:
    // Since, 3 is present more
    // than N/2 times, so it is
    // the majority element.