class Solution {
    public int fib(int n) {
        int a = 0, b = 1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        while (n > 2) {
            int temp = a;
            a = b;
            b += temp;
            n--;
        }
        return a + b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna