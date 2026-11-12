class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int maxArea=0;
        while(l<=r){
            int h=Math.min(nums[l],nums[r]);
            int w=r-l;
            int area=h*w;
            maxArea=Math.max(maxArea,area);
            if(nums[l]<=nums[r]){
                l++;
            }else{
                r--;
            }
        } return maxArea;
    }
}