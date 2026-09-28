class Solution {
    public int search(int[] arr, int target) {
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target) return m;
            if(target<arr[m]) e=m-1;
            else s=m+1; 
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna