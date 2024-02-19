
public class Anagram {
    
    static boolean areAnagrams(String a, String b) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Create arrays to store the frequency of characters in both strings
        int[] countA = new int[26];
        int[] countB = new int[26];
        
        // Count the frequency of characters in string a
        for (char c : a.toCharArray()) {
            countA[c - 'a']++;
        }
        
        // Count the frequency of characters in string b
        for (char c : b.toCharArray()) {
            countB[c - 'a']++;
        }
        
        // Check if the frequency arrays are equal
        for (int i = 0; i < 26; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String a1 = "geeksforgeeks";
        String b1 = "forgeeksgeeks";
        System.out.println("Are '" + a1 + "' and '" + b1 + "' anagrams? " + (areAnagrams(a1, b1) ? "YES" : "NO"));

        String a2 = "allergy";
        String b2 = "allergic";
        System.out.println("Are '" + a2 + "' and '" + b2 + "' anagrams? " + (areAnagrams(a2, b2) ? "YES" : "NO"));
    }
}
