class Solution {
    public int findGCD(int[] nums) {
        int min=1001,max=0;
        for(int num : nums){
            max=max<num?num:max;
            min=min>num?num:min;
        }
        while(min!=0){
            int temp=max;
            max=min;
            min=temp%min;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna