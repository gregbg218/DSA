class Solution {
   public int uniquePaths(int m, int n) {

     int dp[][] = new int[m][n];
        
        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp)
            Arrays.fill(row, -1);
        
        return findUniquePaths(m-1, n-1,dp) ;
    }

    public int findUniquePaths(int m, int n,int[][] dp) 
    {
        
       for(int i=0;i<=m;i++)
       {
            for(int j=0;j<=n;j++)
            {
                int up=0;
                int left=0;
                if(i==0 && j==0)
                {
                    dp[i][j]=1;
                    continue;
                }
                    
        
                // if(i<0 || j<0)
                //     continue;

                if (i > 0)
                    up = dp[i - 1][j];
                if (j > 0)
                    left = dp[i][j - 1];

                
                dp[i][j]=up+left;

            }
       }

       return dp[m][n];
       
    }
}
