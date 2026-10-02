class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int l = 0, r = 0, unallocated = 0;
        boolean[] allocated = new boolean[baskets.length];

        while (l < fruits.length) {

            if (r >= baskets.length) {
                unallocated++;
                r = 0;
                l++;
                continue;
            }

            if (allocated[r]) {
                r++;
                continue;
            }

            if (fruits[l] <= baskets[r]) {
                allocated[r] = true;
                r = 0;
                l++;
            } else {
                r++;
            }
        }

        return unallocated;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna