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
       
  
        t[0][0] = 1;
         
        for(int i=1;i<n+1;i++)
            for(int j=0;j<sum+1;j++){
                if(arr[i-1] <= j)
                    t[i][j] = (t[i-1][j] + t[i-1][j-arr[i-1]]);
                else
                    t[i][j] = t[i-1][j];
            }
            
        return t[n][sum];

    }
}

//Why do we do t[0][0]=1;
//Becos When the target sum is 0 and you have an empty set (a={}), there is one way 
//to achieve this sum, and that is by having an empty subset.

// see in the video from 3:40 how it
//uses same logic as count of subset sum difference
// s1+s2 = total sum
// s1-s2= difference=given target sum in the question
// so Adding above equations we get 2s1=total sum+difference
//s1=(total sum+difference)/2
//substitute the values
