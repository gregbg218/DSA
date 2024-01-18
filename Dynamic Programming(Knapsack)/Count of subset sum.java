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

