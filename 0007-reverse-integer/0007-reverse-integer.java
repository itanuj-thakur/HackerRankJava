class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int d = x % 10;

            // Check overflow for positive limit
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }

            // Check overflow for negative limit
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }

            result = result * 10 + d;
            x /= 10;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna