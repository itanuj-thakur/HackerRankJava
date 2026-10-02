class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,r=0,l=0,zeroes=0;
        while(r<nums.length){
            if(nums[r]==0) zeroes++;
            if(zeroes<=k) max=Math.max(max,r-l+1);
            else{
                if(nums[l]==0) zeroes--;
                l++;
            }
            r++;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna