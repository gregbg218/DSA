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
        

       if(m==0 && n==0)   // At (0,0) 1 way to reach
            return 1;
        
        if(m<0 || n<0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        return dp[m][n]=findUniquePaths(m-1, n,dp)+findUniquePaths(m, n-1,dp); // since we are finding total number of ways base condition
                                                                               // should return 1 or greater
    }
}



// We are starting from end of the matrix or destination instead of the source or starting point and so we are in a way assuming that avaialble directions are 
// up and left instead of down and right . Even with our assumptions the answer would be same
// We are finding total number of ways
