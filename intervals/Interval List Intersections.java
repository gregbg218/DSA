class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int p=0,q=0;
        // int[][] result = new int[][];
        List<int[]> resultList = new ArrayList<int[]>();
        while(p!=firstList.length && q!=secondList.length)
        {
            if(firstList[p][0]<=secondList[q][1] && firstList[p][1]>=secondList[q][0]) // equal to is important becos sometimes overlap is just 1 point example: (5,5)
            {
                int[] ans = new int[2];
                ans[0] = Math.max(firstList[p][0],secondList[q][0]);
                ans[1] = Math.min(firstList[p][1],secondList[q][1]);
                resultList.add(ans);
            }
            if(firstList[p][1]>secondList[q][1])
            {
                q++;
            }
            else
            {
                p++;
            }
                
        }
        int resultArr[][] = new int[resultList.size()][2];
        for(int i=0;i<resultList.size();i++)
        {
            resultArr[i][0]=resultList.get(i)[0];
            resultArr[i][1]=resultList.get(i)[1];
        }
        
        return resultArr;
    }
}
