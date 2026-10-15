class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int num : nums){
            unique=unique^num;
        }
        return unique;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna