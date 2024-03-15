import java.util.* ;
import java.io.*; 
public class Solution {

     public static int findfrogJump(int n, int heights[], int dp[]) 
    {
        dp[0]=0;
        for(int i=1;i<heights.length;i++) 
        {

        int jump1 =  dp[i-1]+Math.abs(heights[i]-heights[i-1]);

        int jump2 = Integer.MAX_VALUE;
        if(i-2>=0)
            jump2 =  dp[i-2]+Math.abs(heights[i]-heights[i-2]);

        dp[i]=Math.min(jump1,jump2);
        

        }


        return dp[n-1];

        
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
