class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1,e=num;
        while(s<=e){
            int m=s+(e-s)/2;
            long square=(long)m*m;
            if(square==num) return true;
            else if(square>num) e=m-1;
            else s=m+1;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna