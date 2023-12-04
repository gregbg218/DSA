class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if(sum%2==0)
        {
            return isSubsetSum(nums.length, nums, sum/2) ;
        }

        else
        {
            return false;        //if sum is odd then we cannot partition and directly can return result as false
        }
        
    }

    public boolean isSubsetSum(int n, int set[], int sum) 
    {
    boolean[][] dpTable = new boolean[n+1][sum+1];
    
    for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=sum;j++)
           {
               if(i==0)
                dpTable[i][j]=false;
                
               if(j==0)
                dpTable[i][j]=true;
              
           }
           
       }
       
       for(int i=1;i<=n;i++)
       {
           for(int j=0;j<=sum;j++)
           {
               
                
               if(set[i-1]<=j)
               {
                dpTable[i][j]= dpTable[i-1][j-set[i-1]] || dpTable[i-1][j];
               }
               else
               {
                dpTable[i][j]= dpTable[i-1][j];  
               }
           }
           
       }
       boolean res=dpTable[n][sum];
       return res;
}
    
}


// Same as subset sum
// The logic is that if sum of array is even then the 2 partitions will be half of that sum
// so we can do subset sum with targetSum=sum/2
// But if sum is odd then we cannot partition and directly can return result as false
