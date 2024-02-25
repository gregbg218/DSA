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
                dpTable[i][j]= dpTable[i-1][j-set[i-1]] || dpTable[i-1][j]; // the real work happens here when we do j-set[i-1] 
		//System.out.println(i+","+j+" is obtained from "+(i-1)+","+(j-set[i-1])+" OR "+(i-1)+","+j+"  set["+(i-1)+"]="+set[i-1]);
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

// Logic
//1,2 is obtained from 0,0 OR 0,2  set[0]=2
//1,3 is obtained from 0,1 OR 0,3  set[0]=2
//1,4 is obtained from 0,2 OR 0,4  set[0]=2
//1,5 is obtained from 0,3 OR 0,5  set[0]=2
//1,6 is obtained from 0,4 OR 0,6  set[0]=2
//1,7 is obtained from 0,5 OR 0,7  set[0]=2
//1,8 is obtained from 0,6 OR 0,8  set[0]=2
//1,9 is obtained from 0,7 OR 0,9  set[0]=2
//1,10 is obtained from 0,8 OR 0,10  set[0]=2
//1,11 is obtained from 0,9 OR 0,11  set[0]=2
//2,3 is obtained from 1,0 OR 1,3  set[1]=3
//2,4 is obtained from 1,1 OR 1,4  set[1]=3
//2,5 is obtained from 1,2 OR 1,5  set[1]=3
//2,6 is obtained from 1,3 OR 1,6  set[1]=3
//2,7 is obtained from 1,4 OR 1,7  set[1]=3
//2,8 is obtained from 1,5 OR 1,8  set[1]=3
//2,9 is obtained from 1,6 OR 1,9  set[1]=3
//2,10 is obtained from 1,7 OR 1,10  set[1]=3
//2,11 is obtained from 1,8 OR 1,11  set[1]=3
//3,7 is obtained from 2,0 OR 2,7  set[2]=7
//3,8 is obtained from 2,1 OR 2,8  set[2]=7
//3,9 is obtained from 2,2 OR 2,9  set[2]=7
//3,10 is obtained from 2,3 OR 2,10  set[2]=7
//3,11 is obtained from 2,4 OR 2,11  set[2]=7
//4,8 is obtained from 3,0 OR 3,8  set[3]=8
//4,9 is obtained from 3,1 OR 3,9  set[3]=8
//4,10 is obtained from 3,2 OR 3,10  set[3]=8
//4,11 is obtained from 3,3 OR 3,11  set[3]=8
//5,10 is obtained from 4,0 OR 4,10  set[4]=10
//5,11 is obtained from 4,1 OR 4,11  set[4]=10

// notice the pattern here it is either doing it through previous subproblem and reminder sum/weight 
//or previous subproblem and full sum/weight 
//example: 5,11 is obtained from 4,1 OR 4,11
//here 4 is previous subproblem and 1 is remainder and 11 is full sum/weight
// another way of saying this is 1 way is including (i-1)th index element or not including (i-1)th index element
//(i-1)th index element in the above example is 10
// when not including 10 then we are forced to use the previous subproblem for getting the full sum/weight 
