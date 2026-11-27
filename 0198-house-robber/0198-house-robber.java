
import java.util.*;

class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 0) return 0;

        int[] dp = new int[n];

        // Base case
        dp[0] = nums[0];

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
        }

        return dp[n-1];
    }
}
