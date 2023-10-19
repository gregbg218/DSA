import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] merge(int[][] intervals) {
        

                   
       Arrays.sort(intervals, new Comparator<int[]>()
                {
                    @Override
                    public int compare(int[] a, int[] b)
                    {
                        return a[0]-b[0];

                    }
                }
        );
        LinkedList<int[]> list = new LinkedList<>();
            
        for(int[] interval : intervals)
        {
            if(!list.isEmpty() && list.getLast()[1] >= interval[0])
            {
                interval[0]=Math.min(list.getLast()[0],interval[0]);
                interval[1]=Math.max(list.getLast()[1],interval[1]);
                list.removeLast();
            }
            list.add(interval);
        }
        
        int i=0;
        int answer[][] = new int[list.size()][]; 
        for(int[] interval : list)
        {
            answer[i++]=interval;
        }
        return answer;
        
    }
}
