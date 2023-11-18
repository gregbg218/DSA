class Solution {

    public static int[] findIndexes(int[] arr, int target)
    {
        int low=0;
        int high=1;
        while(arr[high]<target)
        {
            low = high;
            high=high*2;
        }
        arr[0]=low;
        arr[1]=high;

        return arr;
    }
    public static int infiniteBinarySearch(int[] arr, int target)
    {
        int[] indexes= findIndexes(arr,target);
        int low=indexes[0];
        int high=indexes[1];
        int result=-1;



        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(arr[mid]>target)
            {
                high=mid-1;

            }
            else if(arr[mid]<target)
            {
                low=mid+1;


            }
            else if(arr[mid]==target)
            {
                result=mid;
                break;
            }

        }
        return result;
    }



    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target= 90;


        int result= infiniteBinarySearch(arr,target);
        System.out.println(result);

    }
}


// Initialization:
// Initially, low is set to 0, and high is set to 1.

// Exponential Increase:
// The loop condition arr[high] < target checks whether the element at the high index is less than the target.
// If it is, the search space is increased by setting low = high and doubling the value of high (high = high * 2).
// This process continues until a range is found where arr[high] is greater than or equal to the target.

// Storing the Range:
// Once a suitable range is found, the low and high indices are stored in the arr array
// (arr[0] contains the low index, and arr[1] contains the high index).
// Then just do normal binary search on the array
