class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder st = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c!=' ') st.append(c);
            if(c==' ' && st.length()>0) break;
        }
        return st.length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna