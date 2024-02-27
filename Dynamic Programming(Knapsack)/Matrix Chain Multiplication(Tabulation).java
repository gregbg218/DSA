

import java.io.*;
import java.util.*;

//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
       
        int[][] memoTable = new int[N][N]; 
        
        return solveByDP(arr,memoTable);
        
    }
    
    static int solveByDP(int arr[],int[][] memoTable)
    {
        int N=arr.length;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i>=j || i==0)     // i==0 becos i always starts from 1 and i>=j is the base case of memoization
                    memoTable[i][j] = 0;
            
            }
        }
        for(int i=N-1;i>=1;i--)  // Notice i starting point is different similarly for j, this is explained in template.md
        {
            for(int j=i+1;j<N;j++)
            {
               
                    int cost=Integer.MAX_VALUE;
                    for(int k=i;k<=j-1;k++)
                    {
                        cost=Math.min(
                            memoTable[i][k]+memoTable[k+1][j]+arr[i-1]*arr[k]*arr[j],
                            cost
                            
                            );
                        ;
                    }

                    memoTable[i][j]=cost;
                
                
            }
        }
        

        
        
        return memoTable[1][N-1];
        
        
    }
}
