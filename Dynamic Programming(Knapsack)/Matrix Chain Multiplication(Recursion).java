class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        int result=Integer.MAX_VALUE;
        int[][] memoTable = new int[N+1][N+1]; 
        for(int i=0;i<=N;i++)
       {
           for(int j=0;j<=N;j++)
           {
               memoTable[i][j]=-1;
           }
       }
        return solveByDP(1,N-1, arr,result,memoTable);
        
    }
    
    static int solveByDP(int i, int j, int arr[],int result,int[][] memoTable)
    {
        
        
        if(i>=j)
            return 0;
            
        if (memoTable[i][j] != -1)  
        { 
            return memoTable[i][j]; 
        }
        
        int cost=Integer.MAX_VALUE;
        
        for(int k=i;k<=j-1;k++)
        {
            cost = 
            Math.min(
            cost,
            solveByDP(i,k,arr,result,memoTable)+solveByDP(k+1,j,arr,result,memoTable)+arr[i-1]*arr[k]*arr[j]
            );
            
        }
            
        memoTable[i][j] = cost;
        
        //For every i,j we find the way of minimum cost using k and store it in memo table
        return cost;
    }
}
