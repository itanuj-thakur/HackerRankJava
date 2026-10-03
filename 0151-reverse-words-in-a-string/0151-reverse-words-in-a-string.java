class Solution {
    public String reverseWords(String s) {
        int first = 0, last = s.length() - 1;

        if (s.isEmpty())
            return "";

        // Find first non-space character
        while (first <= last && s.charAt(first) == ' ')
            first++;

        // Find last non-space character
        while (first <= last && s.charAt(last) == ' ')
            last--;

        StringBuilder result = new StringBuilder();
        StringBuilder st = new StringBuilder();
        int countSpace = 0;

        for (int i = last; i >= first; i--) {

            if (s.charAt(i) == ' ') {

                if (countSpace == 0) {
                    st = reverse(st);
                    result.append(st);
                    result.append(' ');
                    st.setLength(0);
                    countSpace++;
                }

                continue;
            }

            countSpace = 0;
            st.append(s.charAt(i));
        }

        result.append(reverse(st));

        return result.toString();
    }

    static StringBuilder reverse(StringBuilder s) {
        StringBuilder st = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--)
            st.append(s.charAt(i));

        return st;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna