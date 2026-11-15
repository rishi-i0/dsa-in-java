class Solution {
    public int countPrimes(int n) {
        int cnt=0;
        Boolean[] isPrime=new Boolean[n+1];
        Arrays.fill(isPrime, true);
        if(n>=0) isPrime[0]=false;
        if(n>=1) isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
            if (isPrime[i]){
          for(int j=i*i;j<n;j+=i){
            isPrime[j]=false;
          }
            }
            
        }
       for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}