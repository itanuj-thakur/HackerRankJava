class Solution {
    public int maxScore(int[] arr, int k) {
        int leftsum=0,rightsum=0,n=arr.length;
        for(int i=0;i<k;i++)
        leftsum+=arr[i];
        int rightindex=k-1;
        int max=leftsum;
        for(int i=n-1;i>=n-k;i--){
            rightsum+=arr[i];
            leftsum-=arr[rightindex--];
            max=Math.max(max,leftsum+rightsum);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna