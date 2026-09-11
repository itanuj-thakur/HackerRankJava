import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (true) {
            int s = 0;
            while (n != 0) {
                int d = n % 10;
                s += d * d;
                n /= 10;
            }

            if (s == 1) return true;
            if (seen.contains(s)) return false;

            seen.add(s);
            n = s;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna