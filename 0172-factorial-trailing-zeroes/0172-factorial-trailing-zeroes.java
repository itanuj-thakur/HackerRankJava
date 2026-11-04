class Solution {
    public int trailingZeroes(int n) {
        if (n == 0)
            return 0; // Base condition
        return (n / 5) + trailingZeroes(n / 5); // Count multiples of 5, 25, 125...
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna