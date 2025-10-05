class Solution {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length; // size of the array
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            // maybe an answer
            if (nums[mid] >= target) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                // look on the right
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(nums, x);
        System.out.println("The index is: " + ind);
    }
}
