import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int findFirst(int[] arr,int target,int size) {
        int low = 0;
        int high= size-1;
        int result=-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(target>arr[mid])
            {
                low=mid+1;
            }
            else if(target<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                result = mid;
                high=mid-1;
            }
        }

        return result;

    }

    public static int findLast(int[] arr,int target,int size)
    {
        int low = 0;
        int high= size-1;
        int result=-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(target>arr[mid])
            {
                low=mid+1;
            }
            else if(target<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                result = mid;
                low=mid+1;
            }
        }

        return result;


    }



    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4};
        int target = 3;
        int size= arr.length;
        System.out.println("First occurrence "+ findFirst(arr,target,size));
        System.out.println("Last occurrence "+ findLast(arr,target,size));
    }
}



// both findFirst and findLast are same methods with minor change in the else loop
// example : 
//else
//           {
//             result = mid;
//             high=mid-1;
//           }
// here even if the mid element matches with target then too we can keep on searching for first occurence .
// Now if the search fails we still have the result stored .
