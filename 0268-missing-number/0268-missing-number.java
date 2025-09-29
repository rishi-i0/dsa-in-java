class Solution {
    public int missingNumber(int[] nums) {
        int xorArr = 0;
        int xorFull = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xorArr ^= nums[i];    
            xorFull ^= i;         
        }

        xorFull ^= n;            
        return xorArr ^ xorFull;  
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + obj.missingNumber(nums)); 
    }
}
