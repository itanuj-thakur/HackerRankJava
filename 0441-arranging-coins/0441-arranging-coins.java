class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int count=0;
        while(n>0){
            n-=i;
            i++;
            count++;
        }
        return n==0?count:--count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna