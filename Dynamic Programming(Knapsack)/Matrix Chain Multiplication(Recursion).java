class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        return solveByDP(1,N-1, arr);
        
    }
    
    static int solveByDP(int i, int j, int arr[])
    {
        
        
        if(i>=j)
            return 0;
            

        int cost=Integer.MAX_VALUE;
        
        for(int k=i;k<=j-1;k++)
        {
            cost = 
            Math.min(
            cost,
            solveByDP(i,k,arr)+solveByDP(k+1,j,arr)+arr[i-1]*arr[k]*arr[j]
            );
            
        }
        
        //For every i,j(i and j is a way of dividng the array) we find the way of minimum cost using k 
        return cost;
    }
}
