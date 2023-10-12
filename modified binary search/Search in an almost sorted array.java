class Solution {
    public static int binarySearch(int[] arr, int target, int low, int high)
    {
        int result=-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(target==arr[mid])
            {
                result=mid;
                break;
            }
            else if(mid-1>=0 && target==arr[mid-1])    // extra condition (mid-1>=0 so that it does not go outside array)
            {
                result=mid-1;
                break;
            }
            else if(mid+1<=arr.length-1 && target==arr[mid+1])     // extra condition (mid+1<=arr.length-1 so that it does not go outside array)
            {
                result=mid+1;
                break;
            }
            else if(target>arr[mid])
            {
                low = mid+1;
            }
            else if(target<arr[mid])
            {
                high=mid-1;
            }
            

        }
        return result;
    }



    public static void main(String[] args) {

        int[] arr = {3, 2, 10, 4, 40 };
        int target= 4;
        int result= binarySearch(arr,target,0, arr.length-1);
        System.out.println(result);

    }
}

// Here the sorting is wrong in a particular sense:
//arr[i] may be present at arr[i+1] or arr[i-1] i.e. arr[i] can only be swapped with either arr[i+1] or arr[i-1].
//The task is to search for an element in this array.
// example arr={1,2,3} can be arr={1,3,2} or arr={2,1,3} so 2 can onlyy move 1 ahead or 1 back
// so as a result we have added 2 extra conditions for checking if target == arr[mid-1] or arr[mid+1] 
// other than that it is same as normal binary search
