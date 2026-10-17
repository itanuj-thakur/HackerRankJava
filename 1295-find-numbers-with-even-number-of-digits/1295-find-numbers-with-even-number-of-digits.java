class Solution {
    public int findNumbers(int[] nums) {
        short count=0;
        for(int num : nums){
            int digits=(int)(Math.floor(Math.log(num)/Math.log(10)+1e-10)+1);
            if((digits&1)==0) count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna