public class EqualSum {
    
    static String hasEqualSum(int[] Arr) {
        int n = Arr.length;
        
        // Calculate total sum of the array
        int totalSum = 0;
        for (int num : Arr) {
            totalSum += num;
        }
        
        // Calculate sum of elements to the left of each index
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            if (leftSum == totalSum - leftSum - Arr[i]) {
                return "YES";
            }
            leftSum += Arr[i];
        }
        
        // If no such index found, return "NO"
        return "NO";
    }

    public static void main(String[] args) {
        int[] Arr1 = {1, 2, 3, 3};
        System.out.println("Output for Arr1: " + hasEqualSum(Arr1));

        int[] Arr2 = {1, 5};
        System.out.println("Output for Arr2: " + hasEqualSum(Arr2));
    }
}
