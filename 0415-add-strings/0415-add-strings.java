class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder st = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int res = 0;
        boolean carry = false;

        while (i >= 0 && j >= 0) {
            int a = num1.charAt(i--) - '0';
            int b = num2.charAt(j--) - '0';
            res = a + b + (carry ? 1 : 0);
            carry = res > 9;
            st.append(res % 10);
        }
        while (i >= 0) {
            res = (num1.charAt(i--) - '0') + (carry ? 1 : 0);
            carry = res > 9;
            st.append(res % 10);
        }
        while (j >= 0) {
            res = (num2.charAt(j--) - '0') + (carry ? 1 : 0);
            carry = res > 9;
            st.append(res % 10);
        }
        if (carry) st.append("1");
        return st.reverse().toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna