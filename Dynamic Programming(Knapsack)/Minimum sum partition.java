class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int rangeSum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        rangeSum=rangeSum+arr[i];
	    }
	    
	    boolean[][] dpTable = new boolean[n+1][rangeSum+1];
    

           for(int j=0;j<=rangeSum;j++)
           {
               
                dpTable[0][j]=false;         
           }
           
        

	   dpTable[0][0]=true;
       
        for(int i=1;i<=n;i++)
        {
           for(int j=0;j<=rangeSum;j++)
           {
               
                
               if(arr[i-1]<=j)
               {
                dpTable[i][j]= dpTable[i-1][j-arr[i-1]] || dpTable[i-1][j];
               }
               else
               {
                dpTable[i][j]= dpTable[i-1][j];  
               }
           }
           
        }
        
        int s2=0;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<=rangeSum/2;i++)
        {
            if(dpTable[n][i]==false)
                continue;
            int temp=rangeSum-(2*i);
            if(temp<result)
                result=temp;
            
        }
        
        return result;
       
	} 
}


// There are going to be 2 subsets S1 and S2
// Let s1 and s2 beth sums of S1 and S2 rsepectively
// our goal is that s1-s2 should be minimum
// s1 can be written as s1=Range-s2
// Substituting in s1-s2=(Range-s2)-s2=Range-2(s2)
// So our goal is to find some value of s2 that can minimize Range-2(s2)
// Only possible way is that s2<=(Range)/2
// becos if s2==(Range)/2 then the difference is 0 which is also acceptable
// but s2 shouldnt be more than (Range)/2
