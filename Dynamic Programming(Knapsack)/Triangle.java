class Solution {
   
    public int minimumTotal(List<List<Integer>> grid) 
    {

     int dp[][] = new int[grid.size()][grid.get(grid.size()-1).size()];
        
        for(int i=0;i<= dp.length-1;i++) 
        {
            for(int j=0;j<= dp[i].length-1;j++)
                if(j<=grid.get(i).size()-1)
                    dp[i][j]=-1;
                else
                    dp[i][j]=10000;
        }
        
        return findUniquePaths(grid,dp) ;
    }

    public int findUniquePaths(List<List<Integer>> grid,int[][] dp) 
    {

       int m=grid.size()-1;
        
       for(int i=0;i<=m;i++)
       {
        
        int n=grid.get(i).size()-1;
            for(int j=0;j<=n;j++)
            {
                int up=0;
                int left=0;

                

                if(i==0 && j==0)
                {
                    dp[i][j]=grid.get(i).get(j);
                    continue;
                }
                  
                
                    
        
              

                if (i > 0)
                    up = grid.get(i).get(j)+dp[i - 1][j];
                else
                     up=Integer.MAX_VALUE;

                if (i > 0 && j > 0)
                    left = grid.get(i).get(j)+dp[i-1][j - 1];
                else
                    left=Integer.MAX_VALUE;

                
                dp[i][j]=Math.min(up,left);

            }
       }

       int ans=Integer.MAX_VALUE;
       for(int i=0;i<=grid.get(grid.size()-1).size()-1;i++)
       {
        ans=Math.min(ans,dp[m][i]);
       }

       return ans;
       
    }
}

// down or down right is only allowed movements
//goal is to reach any position in last row
