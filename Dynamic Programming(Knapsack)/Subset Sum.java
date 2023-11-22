for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=sum;j++)
           {
               if(i==0)
                dpTable[i][j]=false;
                
               if(j==0)
                dpTable[i][j]=true;
                
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
