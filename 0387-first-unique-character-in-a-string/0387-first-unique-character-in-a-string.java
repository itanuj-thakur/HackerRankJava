import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        // LinkedHashMap preserves the order in which keys are inserted
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1); // Use -1 as the duplicate marker instead of 0
            } else {
                map.put(c, i);
            }
        }
        
        // Iterate through values in the exact order they appeared
        for (int index : map.values()) {
            if (index != -1) {
                return index;
            }
        }
        
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna