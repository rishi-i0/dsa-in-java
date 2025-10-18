public class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, zeroCount = 0, best = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) zeroCount++;
            while (zeroCount > k) {
                if (nums[l] == 0) zeroCount--;
                l++;
            }
            best = Math.max(best, r - l + 1);
        }
        return best;
    }
}
