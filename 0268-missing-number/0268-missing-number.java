class Solution {
    public int missingNumber(int[] arr) {
        int a=0,b=0;
        for(int i=0;i<arr.length;i++){
            a=a^arr[i];
            b=b^i;
        }
        b=b^arr.length;
        return a^b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna