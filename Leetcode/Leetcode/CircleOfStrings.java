import java.util.*;

public class CircleOfStrings {
    
    static boolean canFormCircle(String[] A) {
        if (A == null || A.length == 0) return false;
        
        // Create a graph represented as an adjacency list
        Map<Character, List<String>> graph = new HashMap<>();
        for (String str : A) {
            char startChar = str.charAt(0);
            char endChar = str.charAt(str.length() - 1);
            
            // Add the string to the start character's adjacency list
            if (!graph.containsKey(startChar)) {
                graph.put(startChar, new ArrayList<>());
            }
            graph.get(startChar).add(str);
            
            // Add the string to the end character's adjacency list
            if (!graph.containsKey(endChar)) {
                graph.put(endChar, new ArrayList<>());
            }
            graph.get(endChar).add(str);
        }
        
        // Check if every vertex has exactly two incident edges
        for (char ch : graph.keySet()) {
            List<String> adjList = graph.get(ch);
            if (adjList.size() != 2) {
                return false;
            }
        }
        
        // If all vertices have exactly two incident edges, return true
        return true;
    }

    public static void main(String[] args) {
        String[] arr1 = {"abc", "bcd", "cdf"};
        int N1 = arr1.length;
        System.out.println("Output for arr1: " + (canFormCircle(arr1) ? "1" : "0"));

        String[] arr2 = {"ab", "bc", "cd", "da"};
        int N2 = arr2.length;
        System.out.println("Output for arr2: " + (canFormCircle(arr2) ? "1" : "0"));
    }
}
