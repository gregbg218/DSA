import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static int findKSmallestElement(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0;i<arr.length;i++)
        {
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();

    }


    public static void main(String[] args)
    {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println("K smallest Element is : "+ findKSmallestElement(arr,k));
        // 3,4,7,10,15,20
    }
}


