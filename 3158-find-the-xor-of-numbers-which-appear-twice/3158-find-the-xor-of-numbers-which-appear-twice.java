class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;
        for (int num : nums) {
            if(!set.add(num))//set.add() return false if already present
            result^=num;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna