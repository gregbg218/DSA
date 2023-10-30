class Solution { 
    public static long findKSmallest(long arr[], long k)
    {
        PriorityQueue<Long> maxHeap= new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0;i<arr.length;i++)
        {
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    public static long sumBetweenTwoKth(long arr[], long N, long K1, long K2)
    {
        long k1Value=findKSmallest(arr,K1);
        long k2Value=findKSmallest(arr,K2);
        long sum=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>k1Value && arr[i]<k2Value)
                sum=sum+arr[i];
        }
        return sum;
    }
    
}
