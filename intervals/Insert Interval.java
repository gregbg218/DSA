import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int counter=0; // this variable is going to be reused
        List<int[]> resultList = new ArrayList<int[]>();
        Boolean isBefore= false;  // this is for "if" case in for loop
        if(intervals.length==0)
        {
            resultList.add(newInterval);
        }
        else
        {
            for(counter=0;counter<intervals.length;counter++)
            {
//                 System.out.println("I : "+counter);

                if(newInterval[1]<intervals[counter][0])  // If new interval lies before the first element of the array
                {
                    // System.out.println(" If : "+newInterval[1]+" "+intervals[counter][0]);
                    isBefore=true;
                    break;
                }
                else if (newInterval[0]>intervals[counter][1])  // If new interval lies ahead
                {
                    // System.out.println("else If : "+newInterval[0]+" "+intervals[counter][1]);
                    resultList.add(intervals[counter]);
                }
                else                                           // If new interval overlaps
                {
                    newInterval[0] = Math.min(intervals[counter][0],newInterval[0]);
                    newInterval[1] = Math.max(intervals[counter][1],newInterval[1]);
                    // System.out.println("else : "+newInterval[0]+" "+newInterval[1]);
                }
            }
            resultList.add(newInterval);  //this is for both if case and else case
        }

        if(isBefore)
        {
            for(; counter<intervals.length;counter++) // the same counter variable is reused
            {
                resultList.add(intervals[counter]);
            }

        }


        int[][] resultArr = new int[resultList.size()][2];
        for(int j=0;j<resultList.size();j++)
        {
            resultArr[j][0]=resultList.get(j)[0];
            resultArr[j][1]=resultList.get(j)[1];
        }


        return resultArr;
    }
}
