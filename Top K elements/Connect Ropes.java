public class Solution {
    public int solve(ArrayList<Integer> A) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<A.size();i++)
        {
            minHeap.add(A.get(i));
        }
        int totalCost=0;
        while(minHeap.size()!=1)
        {
            int firstRope=minHeap.poll();
            int secondRope=minHeap.poll();
            int twoRopeSum=firstRope+secondRope;
            totalCost=totalCost+twoRopeSum;

            minHeap.add(twoRopeSum);

        }
        return totalCost;
    }
}
