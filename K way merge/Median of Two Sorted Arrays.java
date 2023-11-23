class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalSize = m + n;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        // Insert the first elements of both arrays into the min heap.
        if (m > 0) {
            minHeap.offer(new int[]{nums1[0],0, 1}); // Use 1 to indicate it's from nums1
        }
        if (n > 0) {
            minHeap.offer(new int[]{nums2[0],0, 2}); // Use 2 to indicate it's from nums2
        }

        int count = 0;

        int medianPos=0;

        if(totalSize%2==0)
        {
            medianPos=(totalSize / 2)-1;
        }
        else
        {
            medianPos=(totalSize / 2);
        }

        while (!minHeap.isEmpty()) {
            int[] element = minHeap.poll();
            int value = element[0];
            int arrayPos=element[1];
            int source = element[2];   // Array number


            if (source == 1 && arrayPos+1 < nums1.length) {
                minHeap.offer(new int[]{nums1[arrayPos + 1],arrayPos+1, 1});
            } else if (source == 2 && arrayPos+1 < nums2.length) {
                minHeap.offer(new int[]{nums2[arrayPos + 1],arrayPos+1, 2});
            }


            if (count == medianPos )
            {
                if(!(totalSize%2==0))
                    return value;
                else
                {
                    int mid1=value;
                    int mid2=minHeap.peek()[0];
                    double result = (mid1 + mid2) / 2.0;
                    return result;
                }
            }
            
            count++;   // to find if we have reached median

        }

        return 0.0; 
    }
}
// Same as kth element in sorted matrix only difference is k=median
// median for even numbers is diiferent
// IF EVEN NUMBER OF NUMBERS (LIKE 6 NUMBERS) 
// THEN WE TAKE 3RD AND 4TH NUMBER AND DIVIDE BY 2
