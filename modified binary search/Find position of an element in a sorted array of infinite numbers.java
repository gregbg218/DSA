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
