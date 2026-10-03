import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        int freq=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)) freq=map.get(c)+1;
            else freq=1;
            map.put(c,freq);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(map.containsKey(c) && map.get(c)>0){
                map.replace(c,map.get(c)-1);
            }
            else return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna