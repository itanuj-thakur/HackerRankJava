class Solution {
    public int getSum(int a, int b) {
        int carry = b;
        do {
            carry = (a & b) << 1;
            a = (a ^ b);
            b = carry;
        } while (carry != 0);
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna