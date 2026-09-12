class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(long)length*width*height;
        if(length>=10000 || width>=10000 || height>=10000 || vol>=1000000000L){
            if(mass>=100) return "Both";
            else return "Bulky";
        }
        else if(mass>=100) return "Heavy";
        else return "Neither";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna