class Solution
{

	public int subsetCount(int arr[], int n, int sum)
	{
       		int t[n+1][sum+1];
        	for(int i=1;i<sum+1;i++)
		{
			t[0][i] = 0;	
		}
            	


		t[0][0] = 1;
        
        	for(int i=1;i<n+1;i++)
		{
            		for(int j=0;j<sum+1;j++)
			{
                		if(arr[i-1] <= j)
                    			t[i][j] = (t[i-1][j] + t[i-1][j-arr[i-1]]);
                		else
                    			t[i][j] = t[i-1][j];
			}
            	}
            
        	return t[n][sum];
	}
	  
};


// instead of doing Max((t[i-1][j] + t[i-1][j-arr[i-1]])) we are just doing (t[i-1][j] + t[i-1][j-arr[i-1]]); as this just accepts all possibile counts instead of finding
// max or min and limiting possibile sums

//Why do we do dpTable[0][0]=1;
//Becos When the target sum is 0 and you have an empty set (a={}), there is one way 
//to achieve this sum, and that is by having an empty subset.

// this question is same as subset sum only difference is we want the number of possible ways instead of yes or no

// in this line :t[i][j] = (t[i-1][j] + t[i-1][j-arr[i-1]]);
// at each step we are saying there are 2 ways:
//including (i-1)th index element or not including (i-1)th index element
//example: 5,11 is obtained from 4,1 OR 4,11
//(i-1)th index element in the above example is 10
// when including 10 then we can subtract and if there's a remainder use the previous subproblem for getting the remainder sum/weight
// when not including 10 then we are forced to use the previous subproblem for getting the full sum/weight 
// the unsuccessful way would give value 0


// however note in this type of sums((t[i-1][j] + t[i-1][j-arr[i-1]])) where the real work is done by j-arr[i-1] there should be
// a base case where the value is 1 like here t[0][0] = 1;
