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
