class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Use an array to bypass the "effectively final" rule
        int[] index = {0}; 
        
        map.forEach((key, val) -> {
            if (val == 1) {
                arr[index[0]++] = key;
            }
        });
        return arr;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna