class Solution {
    public int mySqrt(int x) {
        int s=0,e=x;
        while(s<=e){
            int m=s+(e-s)/2;
            if((long)m*m==x) return m;
            else if((long)m*m>x) e=m-1;
            else s=m+1;
        }
        return e;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna