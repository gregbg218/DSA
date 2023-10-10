import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int findNumberOfRotations(int[] arr,int size) {
        int low = 0;
        int high= size-1;
        int result=0;


        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int prev = (mid-1+size)%(size);
            int next = (mid+1)%(size);

            if (arr[prev] > arr[mid] && arr[next] > arr[mid]) {
                result = mid;
                break;
            } else if (arr[mid] <= arr[low]) {
                high = mid - 1;
            } else if (arr[mid] >= arr[high]) {
                low = mid + 1;
            }
        }

        return result;

    }


    public static void main(String[] args)
    {

        int[] arr = { 12 ,13,15, 18,19,1,2, 3, 6, 12  };

        int size= arr.length;
        System.out.println("Rotations: "+ findNumberOfRotations(arr,size));

    }
}


// Basically the current index or position of the smallest element is the number of times rotation has happened 
// example in this case it is 2 which is at index 2
// so the first if condition finds smalllest element and the unique property of smallest element is that it is smaller than both 
// previous and next element
// if we dont find the smallest element in the first mid calculation then we shorten the search area and find mid again
// To get the new search area we need to find which part of the array is unsorted while taking the mid as the reference point
// Example : first mid = 4 and elementt is 19
// now we compare 19 with highest index and since 19>12 we know that left array is unsorted and there we will find our
// smallest element
