import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        if(n==1)
            return 0;

        int jump1 =  Math.abs(heights[n-1]-heights[n-2])+frogJump(n-1, heights);

        int jump2 = Integer.MAX_VALUE;
        if(n-2>0)
            jump2 =  Math.abs(heights[n-1]-heights[n-3])+frogJump(n-2, heights);
        
        return Math.min(jump1,jump2);
    }

}
