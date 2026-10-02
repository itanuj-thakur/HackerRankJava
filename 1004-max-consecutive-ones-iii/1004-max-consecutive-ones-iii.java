class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=nums.length,max=0;
        for(int i=0;i<len;i++){
            int zeroes=0;
            for(int j=i;j<len;j++){
                if(nums[j]==0) zeroes++;
                if(zeroes<=k) max=Math.max(max,j-i+1);
                else break;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna