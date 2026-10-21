class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        boolean[] seen=new boolean[51];
        int result = 0;
        for (int num : nums) {
            if(seen[num])
            result^=num;
            else seen[num]=true;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna