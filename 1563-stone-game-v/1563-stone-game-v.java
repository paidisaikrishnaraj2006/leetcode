class Solution {
    int[][] dp;
    int[] prefix;

    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;

        prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        dp = new int[n][n];

        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }

        return solve(stoneValue, 0, n - 1);
    }

    private int solve(int[] stones, int left, int right) {
        if (left == right) {
            return 0;
        }

        if (dp[left][right] != -1) {
            return dp[left][right];
        }

        int ans = 0;

        for (int k = left; k < right; k++) {

            int leftSum = prefix[k + 1] - prefix[left];
            int rightSum = prefix[right + 1] - prefix[k + 1];

            if (leftSum < rightSum) {
                ans = Math.max(
                    ans,
                    leftSum + solve(stones, left, k)
                );
            }
            else if (leftSum > rightSum) {
                ans = Math.max(
                    ans,
                    rightSum + solve(stones, k + 1, right)
                );
            }
            else {
                ans = Math.max(
                    ans,
                    Math.max(
                        leftSum + solve(stones, left, k),
                        rightSum + solve(stones, k + 1, right)
                    )
                );
            }
        }

        return dp[left][right] = ans;
    }
}