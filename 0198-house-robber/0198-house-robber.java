class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
     dp[0]=nums[0];
    for(int i = 1; i < n; i++) {

            // Pick
            int pick = nums[i];

            if(i > 1) {
                pick += dp[i-2];
            }

            // Not Pick
            int nonPick = dp[i-1];

            // Maximum of both choices
            dp[i] = Math.max(pick, nonPick);
        }return dp[n-1];
       
    }
}