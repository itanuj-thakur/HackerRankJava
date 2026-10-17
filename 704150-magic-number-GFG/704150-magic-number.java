class Solution {
    public int nthMagicNo(int n) {
        // code here
        int result=0,power=5;
        while(n>0){
            if((n&1)==1) result+=power;
            power*=5;
            n>>=1;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna