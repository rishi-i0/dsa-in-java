class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int breakCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breakCount++;
            }
        }

        return breakCount <= 1;
    }
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(obj.check(nums1));

        int[] nums2 = {1, 2, 3};
        System.out.println(obj.check(nums2));

        int[] nums3 = {2, 1, 3, 4};
        System.out.println(obj.check(nums3));
    }
}