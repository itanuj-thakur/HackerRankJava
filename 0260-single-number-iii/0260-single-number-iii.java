class Solution {
    public int[] singleNumber(int[] nums) {
        int mask=0,xor=0;
        for(int num: nums) xor^=num;
        mask=(xor&(-xor));
        int[] arr=new int[2];
        for(int num:nums){
            if((num&mask)==0) arr[0]^=num;
            else arr[1]^=num;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna