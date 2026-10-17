class Solution {
    public int nthMagicNo(int n) {
        // code here
        int result=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1) result+=(int)Math.pow(5,i+1);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna