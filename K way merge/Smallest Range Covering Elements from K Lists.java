class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int minVal=Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        int range=Integer.MAX_VALUE;
        int[] res= new int[2];

        Comparator<int[]> arrComp = new Comparator<int[]>()
        {
            @Override
            public int compare(int[] node1, int[] node2) {
                return node1[0] - node2[0];
            }
        };

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(arrComp); // 3 values: value,list number
                                                                     // and index of value in list
        
        for(int i=0;i<nums.size();i++)
        {
            int value=nums.get(i).get(0);
            if(value>maxVal)                                       //As it is a min heap we have to keep track of max value artificially 
                maxVal=value;                                      // or manually without heap
            minHeap.add(new int[]{value,i,0});
        }

        while (!minHeap.isEmpty())
        {
            int[] point = minHeap.peek();
            minVal=point[0];
            int listNo=point[1];
            int elementIndex=point[2];

            minHeap.poll();

            if(maxVal-minVal<range)
            {
                range=maxVal-minVal;
                res[0] = minVal;
                res[1] = maxVal;
            }
            
            
            if(elementIndex+1<nums.get(listNo).size())  // If one list is over then the                                             
            {                                           // problem is over and we break
                int newElement = nums.get(listNo).get(elementIndex+1);
                minHeap.add(new int[]{newElement,listNo,elementIndex+1});

                if(newElement>maxVal)                                 //As it is a min heap we have to keep track of max value artificially
                    maxVal=newElement;                                // or manually without heap
            }
            else
                break;    

        }
        return res;
    }
}
// The question says at least one elelemtn should be from each list so the best way to do this is to get a heap of size k(number of lists)
// So as we have to include at least 1 point from each of the k lists
// when we pop from the minheap the next element is from the same list
// so that the range is always inclusive of all 3 lists
// as the minheap at any one time
// only keeps track of k elements from k lists i.e there's always 1 element only 
// from each of the k lists 
// and from that same heap we are always fining min or max(which means we 
// are not randomly finding min max we are only doing it in the heap as
// only the min and max of that can include elements of all 3 lists at one time)
