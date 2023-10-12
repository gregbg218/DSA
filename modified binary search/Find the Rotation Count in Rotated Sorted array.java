

class Solution2 {
    public static int findNumberOfRotations(int[] arr) {
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
            // This means left side is sorted but right side is unsorted so search there
                

            else if(arr[mid] <= arr[high])
            {
                high = mid - 1;
            }
            // This means right side is sorted but left side is unsorted so search there
        }

        return result;


    }


    public static void main(String[] args)
    {

        int[] arr = { 4,5,6,7,0,1,2};

        System.out.println("Rotations: "+ findNumberOfRotations(arr));

    }
}


// Basically the current index or position of the smallest element is the number of times rotation has happened 
// example in this case it is 2 which is at index 2
// so the first if condition finds smalllest element and the unique property of smallest element is that it is smaller than both 
// previous and next element
// if we dont find the smallest element in the first mid calculation then we shorten the search area and find mid again
// To get the new search area we need to find which part of the array is unsorted while taking the mid as the reference point

// In the first else if loop we are comparing with arr[0] becos only 1 comparison is needed to find which part of the array is sorted and unsorted
