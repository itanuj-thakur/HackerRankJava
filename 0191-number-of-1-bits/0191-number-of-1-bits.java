class Solution {
    public int hammingWeight(int n) {
        short count=0,i=0;
        while(i<32){
            if((n|(1<<i))==n) count++;
            i++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna