class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<32;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1)==1) sum++;
            }
            sum%=3;
            if(sum!=0)
            result=result|(1<<i);
        }
    return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna