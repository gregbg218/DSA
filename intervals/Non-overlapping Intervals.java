class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        // for(int[] i : intervals)
        // {
        //     System.out.println(" "+i[1]);
        // }
        int ans = 0;
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; ++i)
            if (intervals[i][0] >= currentEnd)
                currentEnd = intervals[i][1];
            else
                ++ans;

        return ans;
        
    }
}
