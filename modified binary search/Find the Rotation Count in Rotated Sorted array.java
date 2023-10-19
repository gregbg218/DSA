

class Solution2 {
    public static int findNumberOfRotations(int[] arr) {
        int low = 0;
        int size=arr.length;
        int high= size-1;
        int result=0;

        if(arr[high] >= arr[low]) // for 0 rotations which means normal sorted array
            return low;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int prev = (mid-1+size)%(size);


            if (arr[prev] > arr[mid] )  // we are not checking if next element is greater than mid element as even in rotated array as long as it is 
                                        // sorted next element will be greater
            {
                result = mid;
                break;
            }

            else if (arr[mid] >= arr[0]) 
            {
                low = mid + 1;            // This means left side is sorted but right side is unsorted so search there
            }
            
                

            else if(arr[mid] <= arr[size-1])
            {
                high = mid - 1;          // This means right side is sorted but left side is unsorted so search there
            }
            
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
// example in this case it is element 0 which is at index 4
// so the first if condition finds smalllest element and the unique property of smallest element is that it is smaller than both its predecessor or 
// previous element and its next element
// if we dont find the smallest element in the first mid calculation then we shorten the search area and find mid again
// To get the new search area we need to find which part of the array is unsorted while taking the mid as the reference point

// In the first else if loop we are comparing with arr[0] becos only 1 comparison is needed to find which part of the array is sorted and unsorted
// similarly for arr[szie-1]




// prev = (mid-1+size)%(size); 
//Explaination:

// In a rotated sorted array, you need to consider both situations where the array is rotated and where it is not. 
// When mid is not the first element of the array, simply using prev = mid - 1 would be correct. 
// However, when mid is the first element (i.e., mid is 0), prev = mid - 1 would result in a negative index, which is not what you want. 
// In such cases, you need to wrap around to the last element of the array to correctly find the previous element.
// This is why the expression prev = (mid-1+size)%(size) is used to ensure that the calculation of prev works correctly even when mid is 0.

// Here's an example to illustrate the difference:

// Let's say you have the array arr = {4, 5, 6, 7, 0, 1, 2}. If you're looking at the middle element, which is 0, and you want
// to find the element before it, using prev = mid - 1 would give you prev = 0 - 1, which is -1, and it's not a valid index. 
// Instead, using prev = (mid-1+size)%(size) would give you prev = (0 - 1 + 7) % 7, which is prev = 6, and correctly points 
// to the last element of the array.

// So, the expression prev = (mid-1+size)%(size) is used to handle the case where mid is the first element of the array and
// wrap around to the end of the array to find the previous element.
