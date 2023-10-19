class Solution {
    public int binarySearch(int[] arr, int target, int low, int high)
    {
        int result=-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(target<arr[mid])
            {
                high=mid-1;
            }
            else if(target>arr[mid])
            {
                low = mid+1;
            }
            else if(target==arr[mid])
            {
                result=mid;
                break;
            }
        }
        return result;
    }

    public int findSmallestElement(int[] arr) {
        int low = 0;
        int size=arr.length;
        int high= size-1;
        int result=0;

        if(arr[high] >= arr[low])
            return low;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int prev = (mid-1+size)%(size);


            if (arr[prev] > arr[mid] ) {
                result = mid;
                break;
            }

            else if (arr[mid] >= arr[0]) {
                low = mid + 1;
            }

            else if(arr[mid] <= arr[size-1])
            {
                high = mid - 1;
            }
        }

        return result;

    }

    public int search(int[] nums, int target) {
        int smallestElementIndex = findSmallestElement(nums);

        if(nums[smallestElementIndex]==target)
            return smallestElementIndex;

        int result= binarySearch(nums,target,0, smallestElementIndex-1);
        if(result!=-1)
            return result;

        result= binarySearch(nums,target,smallestElementIndex+1, nums.length-1);
        if(result!=-1)
            return result;

        return -1;


    }
}

// Here we first find smallest element and then we know that both right and left sides of this element will have sorted sub arrays 
// then we search in these sub arrays one by one
