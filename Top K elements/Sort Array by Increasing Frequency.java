class Solution {
    public int[] frequencySort(int[] arr) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i],0)+1);
        }
        // Above step finds the frequency of all elements

        Comparator<Integer> freqComparator = new Comparator()  // So this comparator just uses the particular hashpMp to compare things in that heap
        {
            @Override
            public int compare(Object o, Object t1) {
                Integer a=(int)o;
                Integer b=(int)t1;
                Integer aFreq=freqMap.get(a);
                Integer bFreq=freqMap.get(b);

                if(Objects.equals(aFreq, bFreq))
                    return a.compareTo(b);      // Ascending order
                return bFreq.compareTo(aFreq);  // Descending order
            }

        };
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(freqComparator);

        for(int el : freqMap.keySet())
        {
            maxHeap.add(el);

        }

        int k=arr.length-1;            // just to act as a counter for the array below
        while(maxHeap.size()!=0)
        {
            int element = maxHeap.poll();
            int freq = freqMap.get(element);
            while(freq!=0)            // As frequency of elements is more than 1, they are going to be repeated
            {
                arr[k--] = element;
                freq--;
            }

        }


        return arr;
        
    }
}
