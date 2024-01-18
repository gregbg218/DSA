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
                dpTable[i][j]=Math.max(val[i-1]+dpTable[i-1][j-wt[i-1]],dpTable[i-1][j]);  // val[i-1] has ii-1 becos array usess 0 based indexing and dpTable[i-1] has i-1 becos we need 
                                                                                           // the value of the previous subproblem/iteration/sum/value
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

// We only need to fill the first row(i=0) in initialization no need to bother about 1st column(j=0)
// becos when we have 0 elements unlike subsets we cant offer null set instead here we are dealing with values and there are n values for null sets
