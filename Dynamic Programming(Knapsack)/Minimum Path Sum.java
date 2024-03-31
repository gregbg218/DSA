class Solution {


    public int minPathSum(int[][] grid) {

     int dp[][] = new int[grid.length][grid[0].length];
        
        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp)
            Arrays.fill(row, -1);
        
        return findUniquePaths(grid,dp) ;
    }

    public int findUniquePaths(int[][] grid,int[][] dp) 
    {

        int m=grid.length-1;
        int n=grid[0].length-1;
        
       for(int i=0;i<=m;i++)
       {
            for(int j=0;j<=n;j++)
            {
                int up=0;
                int left=0;

                

                if(i==0 && j==0)
                {
                    dp[i][j]=grid[i][j];
                    continue;
                }
                  
                
                    
        
              

                if (i > 0)
                    up = grid[i][j]+dp[i - 1][j];
                else
                     up=Integer.MAX_VALUE;

                if (j > 0)
                    left = grid[i][j]+dp[i][j - 1];
                else
                    left=Integer.MAX_VALUE;

                
                dp[i][j]=Math.min(up,left);

            }
       }

       return dp[m][n];
       
    }
}
