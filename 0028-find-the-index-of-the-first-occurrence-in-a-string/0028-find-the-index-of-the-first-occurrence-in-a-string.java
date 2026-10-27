class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return -1;
        int l=0,r=needle.length()-1;
        while(r<haystack.length()){
            if(haystack.substring(l,r+1).equals(needle)) return l;
            l++;
            r++;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna