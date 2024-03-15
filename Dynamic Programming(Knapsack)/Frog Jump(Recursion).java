import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        if(n==1)
            return 0;

        int jump1 =  frogJump(n-1, heights)+Math.abs(heights[n-1]-heights[n-2]);

        int jump2 = Integer.MAX_VALUE;
        if(n-2>0)
            jump2 =  frogJump(n-2, heights)+Math.abs(heights[n-1]-heights[n-3]);
        
        return Math.min(jump1,jump2);
    }

}
