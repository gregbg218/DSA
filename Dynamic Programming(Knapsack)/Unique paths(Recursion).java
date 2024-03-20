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
