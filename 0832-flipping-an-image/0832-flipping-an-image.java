class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len=image.length;
        for(int i=0;i<len;i++){
            int l=0,r=len-1;
            while(l<=r){
                int temp=image[i][l];
                image[i][l]=(image[i][r]^1);//reverses
                image[i][r]=(temp^1);
                l++;r--;
            }
        }
        return image;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna