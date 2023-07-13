

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minCapitalAndProfitMinHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]); // This is an ascending order
                                                                                                    //comparator for a custom datatype like object array 
        PriorityQueue<Integer> maxProfitMaxHeap = new PriorityQueue<>(Collections.reverseOrder()); // reverseOrder() return a comparator
        
        for (int i = 0; i < profits.length; i++) {
            minCapitalAndProfitMinHeap.offer(new int[]{capital[i], profits[i]});  // same as add method only difference is add method gives exception
                                                                                  // when queue is full
        }
        
        for (int i = 0; i < k; i++) // major for loop that does all the work
        {
          while(!minCapitalAndProfitMinHeap.isEmpty()  &&  minCapitalAndProfitMinHeap.peek()[0] <= w) // the whie loop is for when the input is capital =[1,1,2] and w=2 then we need all 3 and form them we need to choose max. This is the reason for maxProfit heap
          {
            maxProfitMaxHeap.add(minCapitalAndProfitMinHeap.poll()[1]);  // 0 is for capital and 1 is for profit
          }

          if(maxProfitMaxHeap.isEmpty())
            break;
            
            w += maxProfitMaxHeap.poll();
        }
        
        return w;
    }
}
// Basically here we are using 2 heaps in 1st min heap we are arranging all profits in ascending order of their capital and then all those with 
// their capital equal to or less than the initial capital are sent to the max profit heap and this cycle keeps on repeating
