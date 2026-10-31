class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(isPrime(countSetBits(i))) count++;
        }
        return count;
    }
    static int countSetBits(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1)
            count++;
            n>>=1;
        }
        return count;
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=(n/i);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna