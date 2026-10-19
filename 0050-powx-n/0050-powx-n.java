class Solution {
    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            power = -power;
        }

        double ans = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= x;
            }
            x *= x;
            power >>= 1;
        }

        // Divide only once at the end to prevent precision drift
        return n < 0 ? 1.0 / ans : ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna