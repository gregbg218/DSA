//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1/

static int maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here
        int left=0;
        int size=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            sum=sum+Arr.get(i);
            size+=1;
            if(size==k)
            {
                max=max<sum?sum:max;
                sum-=Arr.get(left);
                left+=1;
                size-=1;
            }
            
        }
        return max;
    }
