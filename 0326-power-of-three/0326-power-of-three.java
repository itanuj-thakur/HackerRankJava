class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        double res=Math.log10(n)/Math.log10(3);
        // return res==(int)res; for some cases it fails like 243 res=4.9999 ,so check precision lvl
        return Math.abs(res-Math.round(res))<1e-10;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna