class Solution {
    public int findTargetSumWays(int[] arr, int target) 
    {
        

        int totalSum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalSum=totalSum+arr[i];
        }

        if(target>totalSum || (totalSum+target) % 2 == 1 || totalSum+target<0)
            return 0;

        int sum=(totalSum+target)/2;
        int n=arr.length;

        int[][] t= new int[n+1][sum+1];
       for(int i=0;i<sum+1;i++)
            t[0][i] = 0;
       
       for(int i=0;i<n+1;i++)
            t[i][0] = 1;
        

         
        for(int i=1;i<n+1;i++)
            for(int j=0;j<sum+1;j++){   // Usually j starts from 1 but for a special edge case we are starting from 0 ignore the reason
                                        // Always start from i=1 and j=1 exception is made only for this sum
                if(arr[i-1] <= j)
                    t[i][j] = (t[i-1][j] + t[i-1][j-arr[i-1]]);
                else
                    t[i][j] = t[i-1][j];
            }
            
        return t[n][sum];

    }
}