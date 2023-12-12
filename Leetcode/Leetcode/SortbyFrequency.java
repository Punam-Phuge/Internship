import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortbyFrequency {
    public static String frequencySort(String s) {
        // Count the frequency of each character
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Use a PriorityQueue to sort characters based on their frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> charFreq.get(b) - charFreq.get(a));
        maxHeap.addAll(charFreq.keySet());

        // Construct the sorted string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char currentChar = maxHeap.poll();
            int frequency = charFreq.get(currentChar);
            for (int i = 0; i < frequency; i++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        //case1:
        String s1 = "tree";
        System.out.println(frequencySort(s1));  
      //case2:
        String s2 = "cccaaa";
        System.out.println(frequencySort(s2));  
     //case3:
        String s3 = "Aabb";
        System.out.println(frequencySort(s3));  
    }
}
