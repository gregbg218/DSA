class Solution {
    class Pair
    {
        private int[] numsIndex;

        private int sum;

        Pair (int[] numsIndex,int sum)
        {
            this.numsIndex=numsIndex;
            this.sum=sum;
        }

    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();

        Comparator<Pair> pairComp = new Comparator<Pair>() {
            @Override
            public int compare(Pair node1, Pair node2) {
                return node1.sum - node2.sum;
            }
        };

        PriorityQueue<Pair> minHeap = new PriorityQueue<>(pairComp);


        for(int i=0;i<Math.min(k,nums1.length);i++)
        {
            minHeap.add(new Pair(new int[]{i,0},nums1[i]+nums2[0]));
        }

        while(!minHeap.isEmpty() && k!=0) // k mayy be less or more than size of the array 
        {
            Pair curr = minHeap.peek();
            int nums1Index=curr.numsIndex[0];
            int nums2Index=curr.numsIndex[1];
            minHeap.poll();
            
            List<Integer> smallPair = new ArrayList<>();
            smallPair.add(nums1[nums1Index]);
            smallPair.add(nums2[nums2Index]);
            res.add(smallPair);
            
            
            
            if(nums2Index+1<nums2.length)
                minHeap.add(new Pair(new int[]{nums1Index,nums2Index+1},nums1[nums1Index]+nums2[nums2Index+1]));
            k--;
        }

        return res;
    }
}

// repetition is allowed only the sense 
// eg : nums1 = [1a,1b,2], nums2 = [1c,2,3]
// Soln : [[1a,1c],[1b,1c]]

// Also in the pair(u,v) u can either be from nums 1 or nums 2 similarly for v

// Basically initially we are filling heap with pairs containing 0 to k-1 indices of nums 1 and only 0 index of nums 2  
// (nums1[i] and nums2[0] where i>=0 && i<k)
// Then we are popping the heap one by one and adding new points with num1 index and num2 index+1 of the popped element in the heap
// For adding a new pair we use a special logic: we take the nums1 and nums2 index of the popped element and then we keep nums1Index the same while 
// we increment nums2Index by 1


// Example:
//int[] nums1 = {1, 7, 11};
//int[] nums2 = {2, 4, 6};

// 1) Filling the Heap:
// Initially, the heap has pairs: (1, 2), (7, 2), (11, 2) with sums 3, 9, and 13.(2nd element or v is constant)

// 2) Main Loop:
// It starts removing the pair with the smallest sum, which is (1, 2), and adds it to the result list.
// (New nums1Index=old nums2Index=0 while new nums2Index= old nums2Index+1=0+1=1
// Then, it adds a new pair with the same index from nums1 (1) and the next index from nums2 (4) to the heap.
// The heap now has: (7, 2), (11, 2), (1, 4) with sums 9, 13, and 5.
// Next, it removes (1, 4) from the heap, adds it to the result list, and adds a new pair (1, 6) to the heap.
// The heap now has: (1, 6), (11, 2), (7, 2) with sums 7, 13, and 9.
// Finally, it removes (1, 6) from the heap, adds it to the result list,but it cant add anything to the heap.
// The heap now has: (11, 2),(7, 2) with sums 13, 9.

// 3) Returning the Result:
// The result list now contains the 3 smallest pairs: (1, 2), (1, 4), (1, 6), each with their respective sums.

