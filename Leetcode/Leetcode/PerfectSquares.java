import java.util.Arrays;

public class PerfectSquares {

    public static void main(String[] args) {
        PerfectSquares out = new PerfectSquares();
        Solution s = out.new Solution();
        
         System.out.println("Perfect square for number 12 is :");
        System.out.println(s.numSquares(12));

        System.out.println("Perfect square for number 13 is :");
        System.out.println(s.numSquares(13));
    }

 class Solution {
        public int numSquares(int n) {

            if (n <= 0) {
                return 0;
            }

            // count[i] means, for number i, minimum square count
            int[] count = new int[n + 1];
            Arrays.fill(count, Integer.MAX_VALUE);
            count[0] = 0;

            // fill in sqaures first
            int maxPossibleSqaureRoot = (int)Math.sqrt(n * 1.0);
            for (int i = 1; i <= maxPossibleSqaureRoot; i++) {
                count[(int)Math.pow(i, 2)] = 1;
            }

            for (int i = 1; i <= n; i++) {

                int start = 0;
                int end = i / 2;

                for (int j = start; j <= end; j++) {
                    count[i] = Math.min(count[i], count[j] + count[i - j]);
                }
            }

            return count[n];
        }
    }
}