class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1;
        int count=0;
        while(r<nums.length){
            if(nums[l]!=nums[r]){
                nums[count++]=nums[l];
                l=r;
            }
            r++;
        }
        nums[count++]=nums[l];
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna