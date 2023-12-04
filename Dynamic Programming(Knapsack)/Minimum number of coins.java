class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int n=coins.length;
        int W=amount;

        int[][] dpTable = new int[n+1][W+1];
        for(int j=0;j<W+1;j++)
        {
            dpTable[0][j]=Integer.MAX_VALUE-1;
        }

        dpTable[0][0]=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                
                if(coins[i-1]<=j)
                {
                    dpTable[i][j]=Math.min(1+dpTable[i][j-coins[i-1]]
                    ,dpTable[i-1][j]);
               }
               else
               {
                dpTable[i][j]=dpTable[i-1][j];  
               }
           }
           
       }
       int res=dpTable[n][W];
       if(res>=Integer.MAX_VALUE-1)
        return -1;
       return res;
        
    }
}
// Integer.MAX_VALUE-1 is just a way of showing there is no solution with 0
// coins to get any value
// Idelally we should have put infinity there but since we dont have that facility 
// we put the integer limit

//we couldnt put 0 
//there as it doesnt mean the same as no solution and also since it is
//a minimum finding problem it will interfere with the results

// We put -1 in Integer.MAX_VALUE-1 becos in the double for loop we are adding
// 1 and we dont want to go over the integer limit
