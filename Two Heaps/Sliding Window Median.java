class Solution {
    PriorityQueue<Long> minHeap;
    PriorityQueue<Long> maxHeap;


    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result= new double[nums.length-k+1];
        minHeap= new PriorityQueue<>();
        maxHeap= new PriorityQueue<>(Collections.reverseOrder());

        for(int j=0;j<k;j++)
        {
            addNum(nums[j]);
        }
        
        
        for(int i=0;i+k-1<nums.length;i++)
        {
            // printHeap();
            result[i]=findMedian();
            
            
            if(i+k==nums.length)
                break;
            
            removeNum(nums[i]);
            addNum(nums[i+k]);
        }
        return result;
    }

    public void addNum(int num) {
        // if (maxHeap.contains(num)|| minHeap.contains(num))
        //     return;
        maxHeap.add((long)num);

        balanceHeaps();
    }
    
    public double findMedian() {
        double median=0;
        if(maxHeap.size()==minHeap.size())
        {

                 
            median=(double) (maxHeap.peek()+minHeap.peek())/2; //. In Java, the order of operations is from left to right. Therefore, the type casting occurs after the addition and before the division.
            // System.out.println(median);

            return median;
        }
        else if(maxHeap.size()>minHeap.size())
        {
            return (double) maxHeap.peek();
        }
        else
        {
            return (double) minHeap.peek();
        }
    }

    public void removeNum(int num) {
        if (maxHeap.contains((long)num)) {
            maxHeap.remove((long)num);
            // System.out.println("Max does");
        } else if (minHeap.contains((long)num)) {
            minHeap.remove((long)num);
            // System.out.println("Min does");
        }

        balanceHeaps();
    }

    public void balanceHeaps()
    {
        if(maxHeap.size()!=0 && minHeap.size()!=0 && maxHeap.peek()>minHeap.peek())
        {
            long exchangeElement = maxHeap.poll();
            minHeap.add(exchangeElement);
        }
        
        if(maxHeap.size()-minHeap.size()==2) // If difference is 2 then it means    total number of elements is even and there's an uneven distribution. Also it cant be more than 2 as all checks are done per 1 element addition. Also if difference is 1 then its fine
        {
            long exchangeElement = maxHeap.poll();
            minHeap.add(exchangeElement);
        }

        if(minHeap.size()-maxHeap.size()==2)
        {
            long exchangeElement = minHeap.poll();
            maxHeap.add(exchangeElement);
        }
    }

 
}