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

// Basically initially we are filling heap with pairs containing 0 to k-1 indices of nums 1 and only 0 index of nums 2 (nums1[1] and nums2[0] where 
// i>=0 && i<k)
// Then we are popping the heap one by one and adding new points with num1 index and num2 index+1 of the popped element in the heap
