class NumArray {
    int prefix[];
    public NumArray(int[] nums) {
        int n=nums.length;
        this.prefix=new int[n];
        this.prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            this.prefix[i]=this.prefix[i-1]+nums[i];
        }
        

    }
    
    public int sumRange(int left, int right) {
        int sum=this.prefix[right];
        if(left!=0){
            sum=sum-this.prefix[left-1];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */