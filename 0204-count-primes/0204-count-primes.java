class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; (long)i*i<n; i++) {
            if(isPrime[i]) {
                for(int m=i*i;m<n;m+=i) isPrime[m]=false;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]) count++;
        }
        return count;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna