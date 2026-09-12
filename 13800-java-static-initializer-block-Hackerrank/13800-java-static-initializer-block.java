import java.io.*;
import java.util.*;

public class Solution {
static int b,h;
static boolean flag=false;
static{
    Scanner scanner = new Scanner(System.in);
    b=scanner.nextInt();
    h=scanner.nextInt();
    scanner.close();
    try{
        if(b<=0 || h<=0) throw new Exception("Breadth and height must be positive");
        flag=true;
    }
    catch(Exception e){ System.out.print(e);
    }
}
    public static void main(String[] args) {
        if(flag)
        System.out.print(b*h);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna