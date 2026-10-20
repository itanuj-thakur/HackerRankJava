
class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length() - 1, l2 = b.length() - 1;
        StringBuilder result = new StringBuilder();
        boolean carry = false;

        while (l1 >= 0 && l2 >= 0) {
            if (carry) {
                if (a.charAt(l1) == '1' && b.charAt(l2) == '1') {
                    result.append('1');
                    carry = true;
                } else if (a.charAt(l1) == '0' && b.charAt(l2) == '0') {
                    result.append('1');
                    carry = false;
                } else {
                    result.append('0');
                    carry = true;
                }
            } else {
                if (a.charAt(l1) == '1' && b.charAt(l2) == '1') {
                    result.append('0');
                    carry = true;
                } else if (a.charAt(l1) == '0' && b.charAt(l2) == '0') {
                    result.append('0');
                    carry = false;
                } else {
                    result.append('1');
                    carry = false;
                }
            }

            l1--;
            l2--;
        }

        while (l1 >= 0) {
            if (a.charAt(l1) == '1') {
                if (carry) {
                    result.append('0');
                    carry = true;
                } else {
                    result.append('1');
                }
            } else {
                if (carry) {
                    result.append('1');
                    carry = false;
                } else {
                    result.append('0');
                }
            }

            l1--;
        }

        while (l2 >= 0) {
            if (b.charAt(l2) == '1') {
                if (carry) {
                    result.append('0');
                    carry = true;
                } else {
                    result.append('1');
                }
            } else {
                if (carry) {
                    result.append('1');
                    carry = false;
                } else {
                    result.append('0');
                }
            }

            l2--;
        }

        if (carry) {
            result.append('1');
        }

        return result.reverse().toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna