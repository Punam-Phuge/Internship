import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        List<Integer> result1 = findLeaders(arr1);
        System.out.println("Output for arr1: " + result1);

        int[] arr2 = {1, 2, 3, 4, 0};
        List<Integer> result2 = findLeaders(arr2);
        System.out.println("Output for arr2: " + result2);
    }

    static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        // The rightmost element is always a leader
        int maxRight = arr[n - 1];
        leaders.add(maxRight);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                // Current element is greater than or equal to all elements to its right
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }

        // Reverse the list to maintain the original order
        List<Integer> reversedLeaders = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            reversedLeaders.add(leaders.get(i));
        }

        return reversedLeaders;
    }
}

// Example 1:

// Input:
// n = 6
// A[] = {16,17,4,3,5,2}
// Output: 17 5 2
// Explanation: The first leader is 17 
// as it is greater than all the elements
// to its right.  Similarly, the next 
// leader is 5. The right most element 
// is always a leader so it is also 
// included.
// Example 2:

// Input:
// n = 5
// A[] = {1,2,3,4,0}
// Output: 4 0
// Explanation: 0 is the rightmost element
// and 4 is the only element which is greater
// than all the elements to its right.

