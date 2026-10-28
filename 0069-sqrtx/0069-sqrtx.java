class Solution {
    public int mySqrt(double x) {
        // int s=0,e=x;
        // while(s<=e){
        //     int m=s+(e-s)/2;
        //     if((long)m*m==x) return m;
        //     else if((long)m*m>x) e=m-1;
        //     else s=m+1;
        // }
        // return e;
        if(x==0) return 0;
        double r=x/2;
        while(true){
            r=(r+x/r)/2;
            if(Math.abs((r*r)-x)<1e-3) break;
        }
        return (int)r;        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna