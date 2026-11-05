class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuilder st = new StringBuilder();
        outer: for (int i = 0; i < strs[0].length(); i++) {
            boolean flag = true;
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length())
                    break outer;
                if (c != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                st.append(c);
            else
                break;
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna