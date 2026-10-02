class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0,max=0;
        while(r<nums.length){
            if(nums[r]!=1) l=r+1;
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna