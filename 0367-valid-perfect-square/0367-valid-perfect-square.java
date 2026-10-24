class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num; i++) {
            long sq=(long)i*i;
            if (sq == num)
                return true;
            else if (sq > num)
                return false;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna