class Solution{
    static int knapSack(int n, int W, int val[], int wt[])
    {
        int[][] dpTable = new int[n+1][W+1];
       
       for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=W;j++)
           {
               if(i==0)
                dpTable[i][j]=0;
               else if(wt[i-1]<=j)
               {
                dpTable[i][j]=Math.max(val[i-1]+dpTable[i][j-wt[i-1]],dpTable[i-1][j]);
               }
               else
               {
                dpTable[i][j]=dpTable[i-1][j];  
               }
           }
           
       }
       int res=dpTable[n][W];
       return res;
    }
}
// same as 0/1 Knapsack only difference is in "val[i-1]+dpTable[i][j-wt[i-1]]"
// we use dpTable[i] instead of dpTable[i-1] so as to allow reptition
// if we dont want to repeat we directly go to the else condition
