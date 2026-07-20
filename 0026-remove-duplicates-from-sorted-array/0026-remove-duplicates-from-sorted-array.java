class Solution {
    public int removeDuplicates(int[] n) {
        int k=0;
        for(int r=0;r<n.length;r++){
            if(n[r]!=n[k]){
                k++;
                n[k]=n[r];
            }
        } return k+1;
    }
}