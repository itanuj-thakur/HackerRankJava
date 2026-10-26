class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for(int i=0;i<s.length();i++)
        sum1+=(int)s.charAt(i);
        for(int i=0;i<t.length();i++)
        sum2+=(int)t.charAt(i);
        return (char)(sum2-sum1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna