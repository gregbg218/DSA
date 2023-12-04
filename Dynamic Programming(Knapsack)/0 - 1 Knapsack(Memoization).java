class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
       int[][] memoTable = new int[n+1][W+1];  /// here we are doing n+1 which is the size but indexing will be from 0 to n similarly for W
       
       for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=W;j++)
           {
               memoTable[i][j]=-1;
           }
       }
       int res=knapSackMemoMethod(W,wt,val,n,memoTable);
       return res;
    } 
    
    static int knapSackMemoMethod(int W, int wt[], int val[], int n,int[][] memoTable ) 
    {
        
        
       if(n==0)
            return 0;
            
       if(memoTable[n][W]!=-1)
        return memoTable[n][W];
        
       if(wt[n-1]<=W)
       {
        return memoTable[n][W]=Math.max(val[n-1]+knapSackMemoMethod(W-wt[n-1],wt, val,n-1,memoTable),
        knapSackMemoMethod(W,wt, val,n-1,memoTable));    
       }
       else
        return memoTable[n][W]=knapSackMemoMethod(W,wt, val,n-1,memoTable);
    }
}
