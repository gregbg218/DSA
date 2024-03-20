class Solution {
   public int uniquePaths(int m, int n) {
        
        return findUniquePaths(m-1, n-1) ;
    }

    public int findUniquePaths(int m, int n) 
    {

       if(m==0 && n==0)
            return 1;
        
        if(m<0 || n<0)
            return 0;

        return findUniquePaths(m-1, n)+findUniquePaths(m, n-1); 
    }
}
// Unbounded means a knapsack where we can use each given
// item/weight infinite number of times
// so whole bag can be full of the same items

// same as 0/1 Knapsack only difference is in "val[i-1]+dpTable[i][j-wt[i-1]]"
// we use dpTable[i] instead of dpTable[i-1] so as to allow reptition
// if we dont want to repeat we directly go to the else condition
