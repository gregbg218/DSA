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
            else if(mid-1>=0 && target==arr[mid-1])
            {
                result=mid-1;
                break;
            }
            else if(mid+1<=arr.length-1 && target==arr[mid+1])
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
