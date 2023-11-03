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
            if(value>maxVal)
                maxVal=value;
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
            
            
            if(elementIndex+1<nums.get(listNo).size())
            {
                int newElement = nums.get(listNo).get(elementIndex+1);
                minHeap.add(new int[]{newElement,listNo,elementIndex+1});

                if(newElement>maxVal)
                    maxVal=newElement;
            }
            else
                break;    

        }
        return res;
    }
}
