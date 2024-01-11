public class EditDistance {

    public static int minOperations(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "geek";
        String t1 = "gesek";
        System.out.println(minOperations(s1, t1));  // Output: 1

        String s2 = "gfg";
        String t2 = "gfg";
        System.out.println(minOperations(s2, t2));  // Output: 0
    }
}
