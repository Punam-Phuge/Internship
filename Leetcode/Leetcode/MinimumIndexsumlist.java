import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexsumlist {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        // Build a map of string to index for list1
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }

        // Check common strings in list2 and update result if a common string with minimum index sum is found
        for (int j = 0; j < list2.length; j++) {
            if (indexMap.containsKey(list2[j])) {
                int indexSum = j + indexMap.get(list2[j]);
                if (indexSum < minIndexSum) {
                    result.clear();
                    result.add(list2[j]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        // case1
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result1 = findRestaurant(list1, list2);
        System.out.println("Output 1: " + Arrays.toString(result1));  
    ///case2:
        String[] list3 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list4 = {"KFC", "Shogun", "Burger King"};
        String[] result2 = findRestaurant(list3, list4);
        System.out.println("Output 2: " + Arrays.toString(result2));  
////case3:
        String[] list5 = {"happy", "sad", "good"};
        String[] list6 = {"sad", "happy", "good"};
        String[] result3 = findRestaurant(list5, list6);
        System.out.println("Output 3: " + Arrays.toString(result3));  
    }
}

