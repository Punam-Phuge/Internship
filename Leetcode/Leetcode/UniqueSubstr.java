import java.util.HashSet;

public class UniqueSubstr {
    public static void main(String[] args) {
        // Example Input
        String str = "abd";
        int result = countUniqueSubstrings(str);
        System.out.println(result);
    }

    public static int countUniqueSubstrings(String str) {
        int n = str.length();
        HashSet<String> uniqueSubstrings = new HashSet<>();

        // Generate all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                uniqueSubstrings.add(substring);
            }
        }

        // Return the total number of unique substrings
        return uniqueSubstrings.size();

        //Explanation:
       //str = abd. The 6 unique substrings are {a, b, d, ab, bd, abd}.
    }
}

    

