class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int l=0,r=0,max=0;
        // while(r<nums.length){
        //     if(nums[r]!=1) l=r+1;
        //     max=Math.max(max,r-l+1);
        //     r++;
        // }
        // return max;
        //approach 2 best for this but u can use window too
        int count = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna