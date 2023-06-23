class MedianFinder {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap= new PriorityQueue<>();
        maxHeap= new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        balanceHeaps();
        
    }
    
    public double findMedian() {
        double median=0;
        if(maxHeap.size()==minHeap.size())
        {
            median=(double) (maxHeap.peek()+minHeap.peek())/2; //. In Java, the order of operations is from left to right. Therefore, the type casting occurs after the addition and before the division.


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

    public void balanceHeaps()
    {
        if(maxHeap.size()!=0 && minHeap.size()!=0 && maxHeap.peek()>minHeap.peek())
        {
            int exchangeElement = maxHeap.poll();
            minHeap.add(exchangeElement);
        }
        
        if(maxHeap.size()-minHeap.size()==2) // If difference is 2 then it means    total number of elements is even and there's an uneven distribution. Also it cant be more than 2 as all checks are done per 1 element addition. Also if difference is 1 then its fine
        {
            int exchangeElement = maxHeap.poll();
            minHeap.add(exchangeElement);
        }

        if(minHeap.size()-maxHeap.size()==2)
        {
            int exchangeElement = minHeap.poll();
            maxHeap.add(exchangeElement);
        }
    }
}

/*The other way to implement the MedianFinder class is by using a simple sorted list to maintain the elements. Whenever a new number is added,
it is inserted at the correct position in the sorted list to maintain the order.
In terms of time complexity comparisons, the heap-based approach is more efficient. Adding a number to a heap takes O(log n) time, and finding the median 
takes constant time. In contrast, using a sorted list takes O(n) time for adding a number and constant time for finding the median. 
Therefore, the heap-based approach has a better overall time complexity for both operations.
*/

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
