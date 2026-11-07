class Solution {
    public int lengthOfLastWord(String s) {
        int j=s.length()-1;
        while(j>=0 && s.charAt(j)==' ') j--;
        int len=0;
        for(int i=j;i>=0;i--){
            char c=s.charAt(i);
            if(c!=' ') len++;
            if(c==' ') break;
        }
        return len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna