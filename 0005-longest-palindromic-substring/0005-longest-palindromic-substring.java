class Solution {
    public String longestPalindrome(String s) {
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    if (r - l + 1 > st.length())
                        st = s.substring(l, r + 1);
                } else
                    break;
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length()) {
                char c1 = s.charAt(l);
                char c2 = s.charAt(r);
                if (s.charAt(l) == s.charAt(r)) {
                    if (r - l + 1 > st.length())
                        st = s.substring(l, r + 1);
                } else
                    break;
                l--;
                r++;
            }
        }
        return st;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna