import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArrlist {
    public static void main(String[] args) {
        // Example Input
        int n1 = 5;
        int k1 = 8;
        int[] arr1 = {1, 6, 9, 2, 11};
        ArrayList<Integer> result1 = removeAndSort(n1, k1, arr1);
        System.out.println(result1);

        int n2 = 4;
        int k2 = 13;
        int[] arr2 = {1, 4, 6, 9};
        ArrayList<Integer> result2 = removeAndSort(n2, k2, arr2);
        System.out.println(result2);
    }

    public static ArrayList<Integer> removeAndSort(int n, int k, int[] arr) {
        // Create an ArrayList and add elements from the array
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(arr[i]);
        }

        // Use Iterator to iterate through the ArrayList and remove elements less than k
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num < k) {
                iterator.remove();
            }
        }

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Return the sorted ArrayList
        return arrayList;
    }
}

    

