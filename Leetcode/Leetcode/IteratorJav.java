import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class IteratorJav {
    public static ArrayList<Integer> removeElementsLessThanK(int[] arr, int k) {
        // Create an ArrayList and add elements from the array
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Use Iterator to iterate over the ArrayList
        Iterator<Integer> iterator = list.iterator();

        // Remove elements less than k
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num < k) {
                iterator.remove();
            }
        }

        // Sort the ArrayList
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 6, 9, 2, 11};
        int k1 = 8;
        ArrayList<Integer> result1 = removeElementsLessThanK(arr1, k1);
        System.out.println("Output 1: " + result1);

        // Example 2
        int[] arr2 = {1, 4, 6, 9};
        int k2 = 13;
        ArrayList<Integer> result2 = removeElementsLessThanK(arr2, k2);
        System.out.println("Output 2: " + result2);
    }
}


