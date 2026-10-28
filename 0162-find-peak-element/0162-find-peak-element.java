class Solution {
    public int findPeakElement(int[] nums) {
        int s=0,e=nums.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(nums[m]>nums[m+1]) e=m;
            else s=m+1;           
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna