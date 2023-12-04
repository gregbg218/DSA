class Solution{


   static boolean isSubsetSum(int n, int set[], int sum) {
    boolean[][] dpTable = new boolean[n+1][sum+1];
    
    for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=sum;j++)
           {
               if(i==0)
                dpTable[i][j]=false;
                
               if(i==0 && j==0)
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
