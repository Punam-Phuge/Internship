public class ProductArrayPuzzle {
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];

        // Initialize leftProducts and rightProducts arrays
        leftProducts[0] = 1;
        rightProducts[n - 1] = 1;

        // Fill leftProducts array
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Fill rightProducts array
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calculate result array
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 3, 5, 6, 2};
        int[] result1 = productExceptSelf(nums1);
        System.out.println("Output for {10, 3, 5, 6, 2}:");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {12, 0};
        int[] result2 = productExceptSelf(nums2);
        System.out.println("Output for {12, 0}:");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
