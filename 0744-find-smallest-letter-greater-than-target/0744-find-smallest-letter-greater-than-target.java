class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //THIS ONE FAILS THE DUPLICATES ONES and IF TARGET IS NOT PRESENT
    //     int s=0,e=letters.length-1;
    //     while(s<=e){
    //         int m=s+(e-s)/2;
    //         if(letters[m]==target){
    //             if(m+1>=letters.length) return letters[0];
    //             return letters[m+1];
    //     }
    //     if(target<letters[m]) e=m-1;
    //     else s=m+1;
    // }
    // return letters[0];
    // }
    int len=letters.length;
    if(target>=letters[len-1]) return letters[0];
    int s=0,e=len-1;
    while(s<e){
        int m=s+(e-s)/2;
        if(target>=letters[m]) s=m+1;
        else e=m;
    }
    return letters[e];
    } //or arr[s] as both will be equal then only loop will stop
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna