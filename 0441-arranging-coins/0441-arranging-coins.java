class Solution {
    public int arrangeCoins(int n) {
        // int i=1;
        // int count=0;
        // while(n>0){
        //     n-=i;
        //     i++;
        //     count++;
        // }
        // return n==0?count:--count;
        long s=1,e=n;
        while(s<=e){
            long m=s+(e-s)/2;
            long coins=m*(m+1)/2;
            if(coins==n) return (int)m;
            else if(coins<n) s=m+1;
            else e=m-1;
        }
        return (int)e;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna