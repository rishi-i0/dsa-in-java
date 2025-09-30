// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
         int n = arr.length;

        
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    

    

    }
}