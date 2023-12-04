class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
       if(n==0)
            return 0;
       if(wt[n-1]<=W)
       {
        return Math.max(val[n-1]+knapSack(W-wt[n-1],wt, val,n-1),knapSack(W,wt, val,n-1));    
       }
       else
        return knapSack(W,wt, val,n-1);
    } 
}



// We only need n==0 as base condition in initialization no need to bother about W==0
// becos when we have 0 elements unlike subsets we cant offer null set instead here we are dealing with values and there are n values for null sets
