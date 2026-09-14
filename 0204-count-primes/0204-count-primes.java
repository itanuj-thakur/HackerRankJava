class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        // By default, boolean array elements are false in Java.
        // false means prime, true means not prime (composite).
        boolean[] notPrime = new boolean[n];
        
        // Start count at 1 to include 2 (the only even prime)
        int count = 1;

        // Process only odd numbers: 3, 5, 7, 9, ...
        for (int i = 3; i < n; i += 2) {
            if (!notPrime[i]) {
                count++;
                
                // Mark odd multiples starting at i * i
                // Step size is 2 * i to skip even multiples (e.g., 3*3=9, 9+6=15, 15+6=21...)
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += 2 * i) {
                        notPrime[j] = true;
                    }
                }
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna