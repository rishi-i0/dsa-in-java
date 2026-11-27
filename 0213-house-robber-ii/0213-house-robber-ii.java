
class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int case1 = robLinear(nums, 0, n - 2);

        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    int robLinear(int[] nums, int start, int end) {

        int[] dp = new int[nums.length];

        dp[start] = nums[start];

        for (int i = start + 1; i <= end; i++) {

            int pick = nums[i];

            if (i > start + 1) {
                pick += dp[i - 2];
            }

            int nonPick = dp[i - 1];

            dp[i] = Math.max(pick, nonPick);
        }

        return dp[end];
    }
}
