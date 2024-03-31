class Solution {
   

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

     int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp)
            Arrays.fill(row, -1);
        
        return findUniquePaths(obstacleGrid,dp) ;
    }

    public int findUniquePaths(int[][] obstacleGrid,int[][] dp) 
    {

        int m=obstacleGrid.length-1;
        int n=obstacleGrid[0].length-1;
        
       for(int i=0;i<=m;i++)
       {
            for(int j=0;j<=n;j++)
            {
                int up=0;
                int left=0;

                if(obstacleGrid[i][j]==1)  //if landing on obstacles then the number of ways is 0
                {
                    dp[i][j]=0;
                    continue;
                }

                if(i==0 && j==0)
                {
                    dp[i][j]=1;
                    continue;
                }
                                

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
