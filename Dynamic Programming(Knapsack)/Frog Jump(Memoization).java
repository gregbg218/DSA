import java.util.* ;
import java.io.*; 
public class Solution {

     public static int findfrogJump(int n, int heights[], int dp[]) 
    {
        if(n==1)
            return 0;

        if(dp[n-1]!=-1)
            return dp[n-1];

        int jump1 =  findfrogJump(n-1, heights,dp)+Math.abs(heights[n-1]-heights[n-2]);

        int jump2 = Integer.MAX_VALUE;
        if(n-2>0)
            jump2 =  findfrogJump(n-2, heights,dp)+Math.abs(heights[n-1]-heights[n-3]);
        
        return dp[n-1]=Math.min(jump1,jump2);

        
    }
    public static int frogJump(int n, int heights[]) {

        int[] dp = new int[heights.length];
         for(int j=0;j<=heights.length-1;j++)
           {
               dp[j]=-1;
           }
        return findfrogJump(n,heights,dp);
    }

}
