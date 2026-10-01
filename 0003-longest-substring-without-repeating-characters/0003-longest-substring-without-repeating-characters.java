import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,r=0,maxlen=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                if(map.get(c)>=l) l=map.get(c)+1;
            }
            map.put(c,r);
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna