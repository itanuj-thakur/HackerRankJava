class Solution {
    public int reverse(int x) {
        long ans = reverseHelper(Math.abs((long)x));

        if (x < 0) ans = -ans;

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;

        return (int) ans;
    }

    static long reverseHelper(long n) {
        if (n == 0) return 0;

        return (n % 10) * (long)Math.pow(10, (int)Math.log10(n))
                + reverseHelper(n / 10);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna