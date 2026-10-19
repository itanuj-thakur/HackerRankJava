class Solution {
    public int[] decode(int[] encoded) {
        int length = encoded.length + 1;
        int[] perm = new int[length];
        int a = (totalXOR(length) ^ oddXOR(encoded));
        perm[0]=a;
        for(int i=0;i<length-1;i++) perm[i+1]=encoded[i]^perm[i];
        return perm;
    }

    static int totalXOR(int l) {
        int res = 0;
        for (int i = 1; i <= l; i++)
            res ^= i;
        return res;
    }

    static int oddXOR(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0)
                res ^= arr[i];
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna