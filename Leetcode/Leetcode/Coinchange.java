    public class Coinchange {
        public static int count(int[] coins, int N, int sum) {
            // dp array to store the number of ways to make change for each value up to sum
            int[] dp = new int[sum + 1];
            dp[0] = 1; // There is one way to make change for sum = 0 (using no coins)
    
            // Iterate over each coin and update the dp array
            for (int coin : coins) {
                for (int i = coin; i <= sum; i++) {
                    dp[i] += dp[i - coin];
                }
            }
    
            return dp[sum];
        }
    
        public static void main(String[] args) {
            // Example 1
            int[] coins1 = {1, 2, 3};
            int N1 = 3;
            int sum1 = 4;
            System.out.println("Output 1: " + count(coins1, N1, sum1));
    
            // Example 2
            int[] coins2 = {2, 5, 3, 6};
            int N2 = 4;
            int sum2 = 10;
            System.out.println("Output 2: " + count(coins2, N2, sum2));
        }
    }
    

