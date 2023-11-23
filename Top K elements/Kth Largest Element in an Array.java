class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();

        for(int i =0;i<arr.length;i++)
        {
            minHeap.add(arr[i]);
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }
        return minHeap.peek();
        
    }
}
//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5

// By the time it reaches the final element of array there are k+1 or 3 of the largst element on the heap then we pop the 3rd largest and break out 
// of loop. Then at the top of heap we have kth or 2nd largest element


// so our aim is to get the k largest elements in the heap after traversing the whole array and also keeping time complexity low
