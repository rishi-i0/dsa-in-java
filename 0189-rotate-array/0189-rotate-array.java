class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);  //here array is reversed to 7,6,5,4,3,2,1
        reverse(nums,0,k-1);   //we reversed k values which is 5,6,7,4,3,2,1
        reverse(nums,k,nums.length-1); //here we reversed the remaining arr 4,3,2,1 to 1,2,3,4 now nums [5,6,7,1,2,3,4] is rotated to right 

    }
    public void reverse(int []nums,int start,int end){
        while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start ++;  
        end --;
        }

    }
}