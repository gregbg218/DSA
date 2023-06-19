

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minCapitalAndProfitMinHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]); // This is a comparator
        PriorityQueue<Integer> maxProfitMaxHeap = new PriorityQueue<>(Collections.reverseOrder()); // The logic for this is explained below
        
        for (int i = 0; i < profits.length; i++) {
            minCapitalAndProfitMinHeap.offer(new int[]{capital[i], profits[i]});
        }
        
        for (int i = 0; i < k; i++) {

          
          
          while(!minCapitalAndProfitMinHeap.isEmpty()  &&  minCapitalAndProfitMinHeap.peek()[0] <= w) // the whie loop is for when the input is capital =[1,1,2] and w=2 then we need all 3 and form them we need to choose max. This is the reason for maxProfit heap
          {
            maxProfitMaxHeap.add(minCapitalAndProfitMinHeap.poll()[1]);
          }

          if(maxProfitMaxHeap.isEmpty())
            break;
            
            w += maxProfitMaxHeap.poll();
        }
        
        return w;
    }
}
