import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++)
        {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i],0)+1);
        }
        // Above step finds the frequency of all elements

        Comparator<Integer> freqComparator = new Comparator()  // So this comparator just uses the particular hashpMp to compare things in that heap
        {
            @Override
            public int compare(Object o, Object t1) {
                return freqMap.get(o)-freqMap.get(t1);
            }
            
        };
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(freqComparator);

        for(int el : freqMap.keySet())
        {
            minHeap.add(el);
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }

        k=k-1;            // just to act as a counter for the array below
        while(minHeap.size()!=0)
        {
            res[k--]=minHeap.poll();

        }


        return res;
    }
}
