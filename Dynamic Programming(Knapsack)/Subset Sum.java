class Solution{


   static boolean isSubsetSum(int n, int set[], int sum) {
    boolean[][] dpTable = new boolean[n+1][sum+1];
    
    for(int j=0;j<=sum;j++)
           {
               
                dpTable[0][j]=false;         
           }
           
        

	   dpTable[0][0]=true;
       
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
//Why do we do dpTable[0][0]=true;
//Becos When the target sum is 0 and you have an empty set (a={}), there is one way 
//to achieve this sum, and that is by having an empty subset.

// Unlike the Aditya Verma video we dont need to initialise the 1st column we only need to initialize 1st row as in the double for loop
// j in the inner loop starts from 0
