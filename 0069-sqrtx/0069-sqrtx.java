
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        double r = x;

        while (true) {
            double next = (r + x / r) / 2;

            if (Math.abs(next - r) < 1e-7) {
                return (int) next;
            }
            r = next;
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna