class Solution {
    public boolean isThree(int n) {
        int div=1;
        int count=0;
        while(div*div<n){
            if(n%div==0) count+=2;
            div++;
        }
        if(div*div==n) count++;
        return count==3;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna