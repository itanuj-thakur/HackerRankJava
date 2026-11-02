class Solution {
    public int numberOfSteps(int num) {
        // return steps(num,0);
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0)
                num /= 2;

            else
                num--;
            count++;
        }
        return count;
    }
    // static int steps(int n,int step){
    //     if(n<=0) return step;
    //     return n%2==0?steps(n/2,step+1):steps(n-1,step+1);
    // }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna