class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
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
                dpTable[i][j]=Math.max(val[i-1]+dpTable[i-1][j-wt[i-1]],dpTable[i-1][j]);
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
