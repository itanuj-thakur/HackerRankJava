class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2) {
            if(set1.contains(num)) set2.add(num);
        }
        int[] arr = new int[set2.size()];
        int indx=0;
        for(Integer val:set2) arr[indx++]=val;
        return arr;      
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna