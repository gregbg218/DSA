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
        

       if(m==0 && n==0)
            return 1;
        
        if(m<0 || n<0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        return dp[m][n]=findUniquePaths(m-1, n,dp)+findUniquePaths(m, n-1,dp); 
    }
}
