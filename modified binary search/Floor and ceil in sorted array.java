class Solution {
    public static int floorBinarySearch(int[] arr, int target, int low, int high)
    {
        int result=-1;

        if(target<arr[0])
            return -1;
        if(target>arr[arr.length-1])
            return arr[arr.length-1];

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(arr[mid]<=target)
            {
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;

            }



        }
        return arr[result];
    }

    public static int ceilBinarySearch(int[] arr, int target, int low, int high)
    {
        int result=-1;

        if(target<arr[0])
            return arr[0];
        if(target>arr[arr.length-1])
            return -1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(arr[mid]>=target)
            {
                result=mid;
                high=mid-1;

            }
            else if(arr[mid]<target)
            {
                low=mid+1;

            }

        }
        return arr[result];
    }



    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target= 5;

        int result= floorBinarySearch(arr,target,0, arr.length-1);
        System.out.println(result);

        result= ceilBinarySearch(arr,target,0, arr.length-1);
        System.out.println(result);

    }
}
// In the context of an array of numbers, the "floor" and "ceiling" of a given value refer to 
//finding the largest number in the array that is less than or equal to the given value (floor) and the smallest
//number in the array that is greater than or equal to the given value (ceiling).

// For your example array {1, 2, 8, 10, 10, 12, 19}, let's calculate the floor and ceiling for the specified values:

// For x = 0:
// Floor: There is no number in the array that is less than or equal to 0, so the floor doesn't exist.
// Ceiling: The smallest number in the array that is greater than or equal to 0 is 1, so the ceiling is 1.

// For x = 1:
// Floor: The largest number in the array that is less than or equal to 1 is 1 itself, so the floor is 1.
// Ceiling: The smallest number in the array that is greater than or equal to 1 is also 1, so the ceiling is 1.

// For x = 5:
// Floor: The largest number in the array that is less than or equal to 5 is 2, so the floor is 2.
// Ceiling: The smallest number in the array that is greater than or equal to 5 is 8, so the ceiling is 8.

// For x = 20:
// Floor: The largest number in the array that is less than or equal to 20 is 19, so the floor is 19.
// Ceiling: There is no number in the array that is greater than or equal to 20, so the ceiling doesn't exist in the array.

