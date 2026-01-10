class Solution {
    public int removeDuplicates(int[] n) {
        int l=0;
        for(int r=1;r<n.length;r++){
            if(n[r]!=n[l]){
                l++;
                n[l]=n[r];
            }
        }return l+1;
    }
}