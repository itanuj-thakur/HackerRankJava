class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len=image.length;
        int[][] arr=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=0;j--){
                if(image[i][j]==0) arr[i][len-1-j]=1;
                else arr[i][len-1-j]=0;
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna