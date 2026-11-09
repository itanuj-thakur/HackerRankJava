import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        // Maps a character to its minimum common count across words
        Map<Character, Integer> map = new HashMap<>();
        
        // 1. Fill the map with frequencies from the first word
        for (int i = 0; i < words[0].length(); i++) {
            char c = words[0].charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // 2. Intersect this map with the counts from all subsequent words
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentWordMap = new HashMap<>();
            
            // Your exact two-pointer setup, fixed to include the middle element (l <= r)
            int l = 0, r = words[i].length() - 1;
            while (l <= r) {
                char leftChar = words[i].charAt(l);
                currentWordMap.put(leftChar, currentWordMap.getOrDefault(leftChar, 0) + 1);
                
                // Only count the right character if it is distinct from the left one
                if (l != r) {
                    char rightChar = words[i].charAt(r);
                    currentWordMap.put(rightChar, currentWordMap.getOrDefault(rightChar, 0) + 1);
                }
                l++; 
                r--;
            }
            
            // Update the master map to retain only the minimum frequencies
            for (char ch : map.keySet()) {
                int commonCount = Math.min(map.get(ch), currentWordMap.getOrDefault(ch, 0));
                map.put(ch, commonCount);
            }
        }
        
        // 3. Collect the characters based on their remaining valid counts
        for (char ch : map.keySet()) {
            int count = map.get(ch);
            while (count > 0) {
                list.add(String.valueOf(ch)); // Converts character key to String entry
                count--;
            }
        }
        
        return list;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna