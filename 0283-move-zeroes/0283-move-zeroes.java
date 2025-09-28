class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        
        // find first zero
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        
        // no zero found
        if (j == -1) return;

        // move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, 2, 3, 20, 0, 4, 8, 1};
        
       
        Solution obj = new Solution();
        obj.moveZeroes(nums);

        // print result
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
