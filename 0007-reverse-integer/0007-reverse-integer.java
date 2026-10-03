class Solution {
    public int reverse(int x) {
        long result=0;
        while(x!=0){
            int d=x%10;
            result=result*10+d;
            x/=10;
        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna