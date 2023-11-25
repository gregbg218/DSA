import java.util.PriorityQueue;

class Solution {


    public static void nearlySorted(int arr[], int k)
    {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++)
        {
            minHeap.add(arr[i]);
            if (minHeap.size() > k)
            {
                System.out.println(minHeap.remove());
            }
        }
        while (!minHeap.isEmpty())                 //  As there are still some elements remaning becos for loop only runs till i=arr.length
        {
            System.out.println(minHeap.remove());  // The output here is obtained by printing .
        }

    }


    public static void main(String[] args)
    {

        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 7;

       nearlySorted(arr,k);

    }
}


// K sorted array means if in a perfectly sorted array if there is an element at position "index"
// Then in this new array the position will be in the range [index-k,index+k]
// so index=5 and k=3 then positions of the element can be 5,6,7,8 or 4,3,2 


// Basically here we are just putting every element and its next k elements in minheap and popping to obtain them in ascending order

