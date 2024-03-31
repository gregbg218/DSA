class Solution {



    public int minFallingPathSum(int[][] grid) 
    {

        int dp[][] = new int[grid.length][grid.length];        
        return findUniquePaths(grid,dp) ;
    }

    public int findUniquePaths(int[][] grid,int[][] dp) 
    {

       int m=grid.length-1;

       for(int j=0;j<=m;j++)
       {
        
        dp[0][j]=grid[0][j];
        
       }

        for(int i=1;i<=m;i++)
        {

            int n=grid.length-1;
            for(int j=0;j<=n;j++)
            {
                int up=0;
                int backLeftDiagonal=0;
                int backRightDiagonal=0;

            

                if (i > 0)
                    up = grid[i][j]+dp[i - 1][j];
                else
                    up=(int) Math.pow(10, 4);

                if (i > 0 && j > 0)
                    backLeftDiagonal = grid[i][j]+dp[i-1][j - 1];
                else
                    backLeftDiagonal=(int) Math.pow(10,4);

                if (i > 0 && j < n)
                    backRightDiagonal = grid[i][j]+dp[i-1][j + 1];
                else
                    backRightDiagonal=(int) Math.pow(10, 4);


                dp[i][j]=Math.min(up,Math.min(backLeftDiagonal,backRightDiagonal));

            }
        }

        int ans=(int) Math.pow(10, 4);
        for(int i=0;i<=grid.length-1;i++)
        {
            ans=Math.min(ans,dp[m][i]);
        }

        return ans;
       
    }
}
//goal is to reach any position in last row

// Here only movement allowed is up, up left and up right
// So suppose in a 4x4 matrix we are at index 3,2 (last row is 3) then using the moves available we can reach all elements in 1st row(index 0)
// but we take the min of all such available movements and settle on lets say reaching 0,3 as the min path
// so reaching 0,3 from 3,2 costs the least as compared to other elements in 1st row(index 0)
// similarly we do the same for all other elements of last row(index 3) and find the lowest cost among them
// Since no right or left movement is allowed, once any element  of 1st row(index 0) is reached we stop
// we dont go from lets say 0,3 to 0,0 
// as a result we can do this :
// for(int j=0;j<=m;j++)
//        {
        
//         dp[0][j]=grid[0][j];
        
//        }
